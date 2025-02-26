package com.itheima.test;

public class MethodTest2 {
    public static void main(String[] args) {
        /*
        需求:
        定义一个方法,求每个季度的销售额
         */
        System.out.println(getSum(10,20,30));  // 60.0
        double sum1 = getSum(10,20,30);  // 单个季度
    }

    public static double getSum(double num1,double num2,double num3){
        return num1 + num2 + num3;
    }
}
