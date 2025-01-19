package com.atsimoncc.spring6.iocxml.dimap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: Student
 * Package: com.atsimoncc.spring6.iocxml.dimap
 * Description:
 */
public class Student {
    private List<Lesson> lessonList;

    private Map<String, Teacher> teacherMap;
    private String sname;

    private String sid;

    public void run() {
        System.out.println("學生編號" + sid + "學生名稱" +sname);
        System.out.println(teacherMap);
        System.out.println(lessonList);
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }
    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

}
