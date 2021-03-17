package assignment.ass2;

import java.awt.*;
import java.awt.peer.ButtonPeer;

public class Student {
    String name,age,mark;

    public Student(String name, String age, String mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
