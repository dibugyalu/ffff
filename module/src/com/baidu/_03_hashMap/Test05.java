package com.baidu._03_hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test05 {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<>();
        Student student1 = new Student("ikun1", 18, "汉");
        Student student2 = new Student("ikun2", 28, "回");
        Student student3 = new Student("ikun3", 38, "藏");
        hashMap.put(student1, student1.getJiguai());
        hashMap.put(student2, student2.getJiguai());
        hashMap.put(student3, student3.getJiguai());

        // 1.使用hashMap的默认方法forEach配合lambdag表达式
        //hashMap.forEach((key, value) -> System.out.println(key + "=>" + value));

        // 2.通过键来获取键值keySet
//        Set<Student> students = hashMap.keySet();
//        for (Student k : students) {
//            System.out.println(k + "=>" + hashMap.get(k));
//        }

        // 3.直接获取entry对象 entrySet -> getKey getValue
        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
