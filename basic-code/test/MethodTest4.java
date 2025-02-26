package com.itheima.test;

public class MethodTest4 {
    public static void main(String[] args) {
        /*
        需求:
        使用方法重载的思想,设计比较两个整数是否相同的方法
        兼容全整数类型(byte,short,int,long)
         */

        compare(10,20); // 默认调用int类型的方法  可以根据颜色来判断方法是否被调用

    }

    public static void compare(byte b1,byte b2){
        System.out.println("byte");
        System.out.println(b1 == b2);
    }
    public static void compare(short s1,short s2){
        System.out.println("short");
        System.out.println(s1 == s2);
    }
    public static void compare(int i1,int i2){
        System.out.println("int");
        System.out.println(i1 == i2);
    }
    public static void compare(long l1,long l2){
        System.out.println("long");
        System.out.println(l1 == l2);
    }
}
