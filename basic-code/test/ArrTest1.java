package com.itheima.test;

public class ArrTest1 {
    public static void main(String[] args) {
        /*
        需求:
        遍历数组,获得数组中所有元素的和
         */
        int [] arr = {1,2,3,4,5,6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
