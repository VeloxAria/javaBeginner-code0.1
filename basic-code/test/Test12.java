package com.itheima.test;

public class Test12 {
    public static void main(String[] args) {
        /*
        需求: 给定两个整数,被除数和除数(都是整数,且不超过int的范围)
        若两数相除,要求不使用乘法,除法和取余运算符,
        得到商和余数
        被除数 / 除数 = 商 ... 余数
         */
        // 1.被除数
        int dividend = 100;
        // 2.除数
        int divisor = 15;
        // 3.商
        int count = 0;
        // 3.循环
        while(dividend >= divisor){
            dividend -= divisor;
            count++;
        }
        if(dividend == 0){
            System.out.println("整除,商为" + count);
        }
        else{
            System.out.println("余数为" + dividend + ",商为" + count);
        }
    }
}
