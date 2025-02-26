package com.assignment.switchdemo;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        /*
        需求:
        题目1
        模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，
        并打印运算结果。
        要求：
        ​	键盘录入三个整数,其中前两个整数代表参加运算的数据，
                第三个整数为要进行的运算
                (1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)
        ​		请输入第一个整数: 30
        ​		请输入第二个整数: 40
        ​		请输入您要进行的运算: 1
                (1:表示加法,2:表示减法,3:表示乘法,4:表示除法)
        ​		控制台输出:30+40=70

         */

        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println("请输入您要进行的运算");
        System.out.println("1:表示加法,2:表示减法,3:表示乘法,4:表示除法");
        System.out.println("===>>:");
        int num3 = sc.nextInt();
        // 2.执行
        switch(num3){
            case 1 -> System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
            case 2 -> System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
            case 3 -> System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
            case 4 -> System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
            default -> System.out.println("输入错误");
        }
    }
}
