package com.itheima.test;

public class ArrTest3 {
    public static void main(String[] args) {
        /*
        需求:
        遍历数组,如果数组中的数字
        1.是奇数就扩大2倍
        2.是偶数就将当前数字变成二分之一
         */
        int [] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==0){
                arr[i] = arr[i] / 2;
            }
            else{
                arr[i] = arr[i] * 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
