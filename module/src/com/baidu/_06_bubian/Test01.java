package com.baidu._06_bubian;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // 1.创建不可变的集合对象
        List<Integer> list = List.of(1, 2, 3, 4);
        list.forEach(s -> System.out.println(s));
        // 不能增删改
        // 可以通过创建一个ArrayList对象来增删改
        ArrayList<Integer> list1 = new ArrayList<>(list);
        list1.add(6);

        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, 1, 2, 3, 4, 5);
        System.out.println(set);
        set.add(999);
        System.out.println(set);
        set.remove(Integer.valueOf(4));
        System.out.println(set);
    }
}
