package com.itheima.assignment;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        /*
        需求:
        有一个数组，其中有十个元素从小到大依次排列
        {12,14,23,45,66,68,70,77,90,91}。
        再通过键盘录入一个整数数字。
        要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
        请输入一个整数数字：
        50
        生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
         */

        // 1.定义数组
        int [] arr = {12,14,23,45,66,68,70,77,90,91};
        int [] newArr = new int[arr.length + 1];
        // 2.键盘录入一个整数数组
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        // 3.比较数字的大小进行数组的赋值
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num > arr[i]){
                newArr[i] = arr[i];
            }
            else{
                flag = i;
                newArr[i] = num;
                break;
            }
        }
        if (flag == 0){
            newArr[arr.length] = num;
        }
        else {
            for(int i = flag + 1; i < newArr.length; i++){
                newArr[i] = arr[i-1];
            }
        }
        //  4.遍历数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }


    }
}
