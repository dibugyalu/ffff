package com.baidu._05_kebiancanshu;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 4));
    }

    // 设计一个方法，允许调用者调用的时候可以任意传递多个参数，可以利用可变参数
    public static int getSum(double a, int... arr){
        // arr就可以当成数组使用
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
