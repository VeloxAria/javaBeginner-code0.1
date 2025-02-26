package com.itheima.test;

public class ArrTest2 {
    public static void main(String[] args) {
        /*
        需求:
        定义一个数组,存储1,2,3,4,5,6,7,8,9,10
        统计数组中能够被3整除的元素有多少个
         */
        int [] arr = {1,2,3,4,5,6};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0)
                count++;
        }
        System.out.println();
    }
}
