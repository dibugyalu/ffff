package com.baidu._04_treeMap;

import com.baidu._03_hashMap.Student;

import java.util.HashMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>((s1, s2) -> s2.getAge() - s1.getAge());
        Student student1 = new Student("ikun1", 18, "汉");
        Student student2 = new Student("ikun2", 28, "回");
        Student student3 = new Student("ikun3", 38, "藏");
        treeMap.put(student1, student1.getJiguai());
        treeMap.put(student2, student2.getJiguai());
        treeMap.put(student3, student3.getJiguai());
        System.out.println(treeMap);


    }
}
