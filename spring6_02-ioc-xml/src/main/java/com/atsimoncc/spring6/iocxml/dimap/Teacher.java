package com.atsimoncc.spring6.iocxml.dimap;

/**
 * ClassName: Teacher
 * Package: com.atsimoncc.spring6.iocxml.dimap
 * Description:
 */
public class Teacher {
    private String teacherName;
    private String teacherId;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }
}
