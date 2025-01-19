package com.atsimoncc.spring6.iocxml.ditest;

import java.util.List;

/**
 * ClassName: Dept
 * Package: com.atsimoncc.spring6.iocxml.ditest
 * Description:
 */
// 部門類
public class Dept {

    private List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void info() {
        System.out.println("部門名稱: " + dname);
        for (Emp emp : empList) {
            System.out.println(emp.getEname());
        }
    }
}
