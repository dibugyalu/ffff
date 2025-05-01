package com.baidu._03_hashMap;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String jiguai;

    public Student() {
    }

    public Student(String name, int age, String jiguai) {
        this.name = name;
        this.age = age;
        this.jiguai = jiguai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJiguai() {
        return jiguai;
    }

    public void setJiguai(String jiguai) {
        this.jiguai = jiguai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(jiguai, student.jiguai);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (jiguai != null ? jiguai.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jiguai='" + jiguai + '\'' +
                '}';
    }
}
