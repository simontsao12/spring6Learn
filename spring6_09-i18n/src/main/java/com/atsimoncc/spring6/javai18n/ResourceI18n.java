package com.atsimoncc.spring6.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ClassName: ResourceI18n
 * Package: com.atsimoncc.spring6.javai18n
 * Description:
 */
public class ResourceI18n {
    public static void main(String[] args) {
        ResourceBundle bundle1 = ResourceBundle.getBundle("message",
                new Locale("zh", "TW"));
        String value1 = bundle1.getString("test");
        System.out.println(value1);

        ResourceBundle bundle2 = ResourceBundle.getBundle("message",
                new Locale("en", "GB"));
        String value2 = bundle2.getString("test");
        System.out.println(value2);
    }
}
