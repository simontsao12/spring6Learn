package com.atsimoncc.spring6.iocxml.dimap;

/**
 * ClassName: Lesson
 * Package: com.atsimoncc.spring6.iocxml.dimap
 * Description:
 */
public class Lesson {
    private String lessonName;

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                '}';
    }
}
