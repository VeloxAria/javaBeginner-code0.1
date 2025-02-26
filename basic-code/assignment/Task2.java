package com.itheima.task;

public class Task2 {
    public static void main(String[] args) {
        /*
        数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
        请定义一个方法，方法能够得到小数类型数字的绝对值并返回。
        请定义方法并测试。
         */
        System.out.println(getAbs(-10.5));
    }
    public static double getAbs(double val){
        return val > 0 ? val : -val;
    }
}
