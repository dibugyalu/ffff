package com.baidu._03_hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    练习map集合的第三种方式，默认方法+lambda表达式
 */
public class Test04 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "111");
        map.put("b", "222");
        map.put("c", "333");
        map.put("d", "444");
       // 2.面相map对象，调用接口中的默认方法
        map.forEach((key, value) -> System.out.println(key + "=>" + value));


    }
}
