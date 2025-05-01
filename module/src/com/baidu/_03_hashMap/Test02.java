package com.baidu._03_hashMap;

import java.util.HashMap;
import java.util.Set;

/*
    练习map集合的第一种方式，键找值
 */
public class Test02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "111");
        map.put("b", "222");
        map.put("c", "333");
        map.put("d", "444");
        // 键找值
        Set<String> s = map.keySet();
        System.out.println(s);
        for (String s1 : s) {
            System.out.println(s1 + "=>" + map.get(s1));
        }

    }
}
