package com.itheima.test;

public class Test11 {
    public static void main(String[] args) {
        /*
        需求:
        如果X是一个回文数,打印true,否则打印false
         */

        // 1.定义数字
        int x =12345;
        int num = 0;
        int temp = x;

        // 2.loop 循环获取
        while(x != 0) {
            int ge = x % 10;
            num = num * 10 + ge;
            x /= 10;
        }
        // 3.判断
        System.out.println(temp == num);
    }
}
