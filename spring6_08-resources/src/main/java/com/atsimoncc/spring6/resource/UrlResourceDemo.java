package com.atsimoncc.spring6.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

/**
 * ClassName: UrlResourceDemo
 * Package: com.atsimoncc.spring6.resource
 * Description:
 */
// 示範 UrlResource 訪問網路資源
public class UrlResourceDemo {
    public static void main(String[] args) {
        // http
        loadUrlResource("https://www.google.com");
        // file
        // 相對路徑讀取module根目錄(spring6 module)
        loadUrlResource("file:test.txt");
    }
    // 訪問前綴 http 和 file
    public static void loadUrlResource(String path) {
        // 1 建立 Resource 實現類 UrlResource 的物件
        try {
            Resource url = new UrlResource(path);
            // 2 獲取資源訊息
            System.out.println(url.getFilename());
            System.out.println(url.getURL());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
