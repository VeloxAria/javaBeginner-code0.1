package com.itheima.task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        需求:
        在主方法中通过键盘录入三个整数。
        定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。
        执行效果如下：
        请输入第一个整数：10
        请输入第二个整数：30
        请输入第三个整数：20
        从大到小的顺序是： 30 20 10
         */

        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [3];
        for (int i = 0; i < 3; i++) {
            System.out.println(("请输入第" + (i+1) + "个整数："));
            arr[i] = sc.nextInt();
        }
        // 2.执行方法
        printNumber(arr);
    }
    public static void printNumber(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for(int i : arr){
            System.out.print(arr[i] + " ");
        }
    }
}
