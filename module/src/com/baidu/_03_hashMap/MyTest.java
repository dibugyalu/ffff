package com.baidu._03_hashMap;

import java.util.HashMap;
import java.util.Map;

/*
    练习HashMap入门的常见方法
 */
public class MyTest {
    public static void main(String[] args) {
        String s = "abc";
        Map<String, String> map = new HashMap<>();
        // 1.增
        map.put("name", "ikun");
        map.put("age", "18");
        System.out.println(map);

        // 2.改
        String put = map.put("name", "ikun1");
        System.out.println(put);
        System.out.println(map);

        // 3.删
        map.remove(new String("name"));
      // map.remove(new StringBuilder("name"));
        //System.out.println(new StringBuilder("name").hashCode() == "name".hashCode());// false
        // String类中重写了hashCode和equals方法，hashcode值相等，equals返回的是true,首先比较的地址，地址不同，往后走，类型相同完后走，比属性，属性相同返回true,所以可以删除。
        System.out.println(map);
        System.out.println(map.isEmpty());// false
        System.out.println(map.containsKey(new String("age"))); // true

        // 取
        String s1 = map.get("age");
        System.out.println(s1); // 18
        System.out.println(map.get("age1"));
        // 取增强的方法：当取不到的数据的时候，可以给一个默认值
        String s2 = map.getOrDefault("name", "ikun1");
        System.out.println(s2);
    }
}
