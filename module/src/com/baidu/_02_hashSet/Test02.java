package com.baidu._02_hashSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/*
    把下面list集合中的数据，帮我把所有重复的数据只保留一份
 */
    public class Test02 {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(3);
            list.add(3);
            list.add(1);
            list.add(2);
            list.add(1);
            list.add(1);
            list.add(5);
            list.add(3);
    //        HashSet<Integer> hashSet = (HashSet<Integer>) list;
//            HashSet<Integer> set = new HashSet<>(list);
//            System.out.println(set);

            Collection<Integer> collection = list;


        }
    }
