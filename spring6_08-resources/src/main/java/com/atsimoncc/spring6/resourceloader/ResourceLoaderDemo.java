package com.atsimoncc.spring6.resourceloader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * ClassName: ResourceLoaderDemo
 * Package: com.atsimoncc.spring6.resourceloader
 * Description:
 */
public class ResourceLoaderDemo {

    @Test
    public void demo1() {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        // 會得到 ClassPathResource 實例
        Resource resource = context.getResource("test2.txt");
        System.out.println(resource.getFilename());
    }
    @Test
    public void demo2() {
        ApplicationContext context = new FileSystemXmlApplicationContext();
        // 會得到 FileSystemResource 實例
        Resource resource = context.getResource("test2.txt");
        System.out.println(resource.getFilename());
    }
}
