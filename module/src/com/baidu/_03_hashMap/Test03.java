package com.baidu._03_hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    练习map集合的第二种方式，键值对对象(entry对象)
 */
public class Test03 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "111");
        map.put("b", "222");
        map.put("c", "333");
        map.put("d", "444");
        // 2.获取map中所有的键值对对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries); // [a=111, b=222, c=333, d=444]
        // 3.增强for遍历set集合，可以获取每个entry对象
        for (Map.Entry<String, String> entry : entries) {
            // 3.面向每一个entry对象，获取对象中的key和value
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=>" + value);
        }


    }
}
