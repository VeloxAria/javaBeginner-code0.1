package com.itheima.test;

public class MethodTest6 {
    public static void main(String[] args) {
        /*
        需求:
        设计一个方法,求数组的最大值,并将最大值返回
         */
        // 1.定义数组
        int[] arr = {1,5,7,2,9,6,4,3,8};
        // 2.调用方法
        // Ctrl + Alt + V 自动补全调用方法的返回值
        int max = getMax(arr);
        System.out.println(max);
    }
    /**
     * 求数组的最大值
     * @param arr 数组
     * @return 数组的最大值
     */
    public static int getMax(int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
