package com.itheima.task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        需求:
        键盘录入一个正整数
        定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
        在main方法中打印该数字是几位数
        演示格式如下:
        (1)演示一:
            请输入一个整数:1234
            控制台输出:1234是4位数字
        (2)演示二:
            请输入一个整数:34567
            控制台输出:34567是5位数字
         */
        // 1.键盘录入一个正整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();
        // 2.调用方法
        int count = getCount(num);
        // 3.打印结果
        System.out.println(num + "是" + count + "位数字");
    }

    /**
     * 计算数字位数
     * @param num 传入的正整数
     * @return 返回位数
     */
    public static int getCount(int num){
        int count = 0;
        while(num != 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
