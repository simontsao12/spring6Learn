package com.atsimoncc.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: FileSystemResourceDemo
 * Package: com.atsimoncc.spring6.resource
 * Description:
 */
// 訪問系統中的資源
public class FileSystemResourceDemo {
    public static void main(String[] args) throws IOException {
        loadFileResource("C:\\Users\\test2.txt");
        loadFileResource("test.txt");
    }
    public static void loadFileResource(String path) {
        FileSystemResource resource = new FileSystemResource(path);

        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
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
}
