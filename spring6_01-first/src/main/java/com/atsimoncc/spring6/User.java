package com.atsimoncc.spring6;

/**
 * ClassName: User
 * Package: com.atsimoncc.spring6
 * Description:
 */
public class User {
    public void add() {
        System.out.println("add...");
    }
    public User(){
        System.out.println("User無參建構子");
    }
    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
