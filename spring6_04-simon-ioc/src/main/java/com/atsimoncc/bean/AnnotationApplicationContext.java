package com.atsimoncc.bean;

import com.atsimoncc.anno.Bean;
import com.atsimoncc.anno.Di;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: AnnotationApplicationContext
 * Package: com.atsimoncc.bean
 * Description:
 */
public class AnnotationApplicationContext implements ApplicationContext{
    // 創建 map 集合 放 bean 物件
    private Map<Class, Object> beanFactory = new HashMap<>();

    // 建立了操作比較方便
    private static String rootPath;

    // 返回物件(從 Map 中取)
    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    // 建立有參數建構子 傳遞套件路徑 設置套件掃描規則
    // 當前套件及其子套件 哪個類有 @Bean 注解 把這個類通過反射實例化
    public AnnotationApplicationContext(String basePackage) {
        try {
            // 1 把 . 替換成 /
            String packagePath = basePackage.replaceAll("\\.", "\\\\");
            // 2 獲取套件的絕對路徑(編譯之後 .class 的路徑)
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader()
                                                          .getResources(packagePath);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                // String protocol = url.getProtocol();
                String filePath = URLDecoder.decode(url.getFile(), "utf-8");
                // 獲取套件前面的部分 字串截取
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());
                // 套件掃描
                loadBean(new File(filePath));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // 屬性注入
        loadDi();
    }


    // 套件掃描的過程 實例化
    private void loadBean(File file) throws Exception {
        // 1 判斷當前是否為資料夾
        if (file.isDirectory()) {
            // 2 獲取資料夾所有內容
            File[] cildrenFiles = file.listFiles();
            // 3 判斷資料夾為空 直接返回
            if (cildrenFiles == null || cildrenFiles.length == 0) {
                return;
            }
            // 4 若資料夾不為空 遍歷資料夾所有內容
            for (File child : cildrenFiles) {
                // 4.1 遍歷得到每個 File 物件 繼續判斷 如果還是資料夾就遞迴
                if (child.isDirectory()) {
                    // 遞迴
                    loadBean(child);
                } else {
                    // 4.2 遍歷得到的 File 非資料夾是檔案的話
                    // 4.3 得到套件 + 類名稱部分 --> 字串截取
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length() - 1);
                    // 4.4 判斷當前檔案是否為 .class 檔案
                    if (pathWithClass.contains(".class")) {
                        // 4.5 如果是 .class 檔案 把路徑 \ 替換成 . 把 .class 去掉
                        // e.g. : com.atsimoncc.service.UserServiceImpl
                        String allName = pathWithClass.replaceAll("\\\\", "\\.")
                                                .replace(".class", "");
                        // 4.6 判斷類上面是否有注解 @Bean 若有則進行實例化
                        // 4.6.1 利用 allName 獲取 Class 物件
                        Class clazz = Class.forName(allName);
                        // 4.6.2 判斷介面
                        if (!clazz.isInterface()) {
                            // 4.6.3 判斷類上面是否有注解 @Bean
                            Bean annotation = (Bean)clazz.getAnnotation(Bean.class);
                            if (annotation != null) {
                                // 4.6.4 實例化
                                Object instance = clazz.getConstructor().newInstance();
                                // 4.7 實例化後放進 Map beanFactory 中
                                // 4.7.1 若有介面用介面作為 key
                                if (clazz.getInterfaces().length > 0) {
                                    beanFactory.put(clazz.getInterfaces()[0], instance);
                                } else {
                                    beanFactory.put(clazz, instance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // 屬性的注入
    private void loadDi() {
        // 實例化物件都在 beanFactory 中
        // 1 遍歷 Map 集合
        Set<Map.Entry<Class, Object>> entries = beanFactory.entrySet();
        for (Map.Entry<Class, Object> entry : entries) {
            // 2 獲取 Map 中每個物件(value) 每個物件的屬性
            Object obj = entry.getValue();
            // 獲取物件 Class
            Class clazz = obj.getClass();
            Field[] declaredFields = clazz.getDeclaredFields();
            // 3 遍歷每個物件的屬性陣列 得到每個屬性
            for (Field filed : declaredFields) {
                // 4 判斷屬性上面是否有 @Di 注解
                Di annotation = filed.getAnnotation(Di.class);
                if (annotation != null) {
                    // 若為 private 要設定存取
                    filed.setAccessible(true);
                    // 5 若有則把物件進行設置(注入)
                    try {
                        // 透過類型進行注入
                        filed.set(obj, beanFactory.get(filed.getType()));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    // 預想中的使用方式
    // public static void main(String[] args) {
    //     ApplicationContext context = new AnnotationApplicationContext("com.atsimoncc");
    //     context.getBean(Class.class);
    // }
}
