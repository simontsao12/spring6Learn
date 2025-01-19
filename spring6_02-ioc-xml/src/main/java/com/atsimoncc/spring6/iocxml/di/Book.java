package com.atsimoncc.spring6.iocxml.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: Book
 * Package: com.atsimoncc.spring6.iocxml.di
 * Description:
 */
public class Book {
    private String bname;
    private String author;
    private String others;

    public void setOthers(String others) {
        this.others = others;
    }

    public Book() {
        System.out.println("無參建構子執行");
    }

    public Book(String bname, String author) {
        System.out.println("有參建構子執行");
        this.bname = bname;
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //set方法注入
        Book book = new Book();
        book.setBname("Java");
        //建構子注入
        Book book1 = new Book("Spring", "Java");

    }
}
