package com.itheima.test;

public class MethodTest5 {
    public static void main(String[] args){
        /*
        需求:
        设计一个方法,用于数组遍历,
        要求遍历的结果是在一行上的,  例如: [11,22,33,44,55]
         */
        // 1.定义数组
        int[] arr = {11,22,33,44,55};
        // 2.调用方法
        printArray(arr);
    }

    public static void printArray(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + ",");

        }
    }

}
