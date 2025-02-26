package com.itheima.test;

public class MethodTest7 {
    public static void main(String[] args) {
        /*
        需求:
        定义一个方法,判断数组中某个数据是否存在,并将结果返回给调用处
         */
        // 1.定义数组
        int [] arr = {11,22,33,44,55};
        // 2.调用方法
        boolean exit = contains(arr,33);
        System.out.println(exit ? "存在" : "不存在");
    }
    public static boolean contains(int [] arr,int val){
        for (int i : arr) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }
}
