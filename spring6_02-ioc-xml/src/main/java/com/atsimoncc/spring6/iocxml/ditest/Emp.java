package com.atsimoncc.spring6.iocxml.ditest;

import javax.crypto.spec.PSource;
import java.util.Arrays;

/**
 * ClassName: Emp
 * Package: com.atsimoncc.spring6.iocxml.ditest
 * Description:
 */
// 員工類
public class Emp {
    // 物件類型屬性
    private Dept dept;
    private String ename;
    private Integer age;
    private String[] loves;

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void work() {
        System.out.println(ename + "emp work..." + age);
        dept.info();
        System.out.println(Arrays.toString(loves));
    }
}
