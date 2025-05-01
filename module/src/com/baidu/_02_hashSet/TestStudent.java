package com.baidu._02_hashSet;

import java.util.HashSet;
import java.util.Objects;

public class TestStudent {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("ikun", 18));
        set.add(new Student("ikun", 18));
        set.add(new Student("ikun", 18));
        set.add(new Student("ikun", 18));
        set.add(new Student("ikun", 18));
        System.out.println(set); // 如果Student类，没有重写hashcode方法和equals的时候，一定会有5个数据
    }
}
