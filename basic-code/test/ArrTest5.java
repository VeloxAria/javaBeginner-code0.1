package com.itheima.test;

public class ArrTest5 {
    public static void main(String[] args) {
        /*
        需求:
        定义一个数组,存入1,2,3,4,5,6,7,8,9,10
        交换数组元素

         */

        // 1.定义数组
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        // 2.准备两个变量 right left
        int left = 0;
        int right = arr.length -1;
        // 3.循环遍历数组
        while(left < right){
            // 4.交换数组元素
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        // 5.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
