package com.atsimoncc.spring6.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: ClassPathRecourceDemo
 * Package: com.atsimoncc.spring6.resource
 * Description:
 */
// 訪問類路徑下的資源
public class ClassPathResourceDemo {

    public static void loadClassPathResource(String path) {
        // 建立 ClassPathResource 物件
        ClassPathResource resource = new ClassPathResource(path);

        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        // 獲取文件內容
        try {
            InputStream in = resource.getInputStream();
            byte[] b = new byte[1024];
            while (in.read(b) != -1) {
                System.out.println(new String(b));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        loadClassPathResource("test2.txt");
    }
}
