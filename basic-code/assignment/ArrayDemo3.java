package com.itheima.assignment;

public class ArrayDemo3 {
    public static void main(String[] args) {
        /*
        需求:
        定义一个数组其中包含多个数字。
        实现
        奇数放在数组的左边，偶数放在数组的右边。
         */
        int [] arr = {47,97,63,5,60,68,49,21,6,4};
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            if (arr[left] % 2 == 1){
                left++;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
