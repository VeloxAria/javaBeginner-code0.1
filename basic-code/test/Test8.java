package com.itheima.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int week = sc.nextInt();

        switch (week)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            //case 5 -> System.out.println("工作日");
            case 6:
            //case 7 -> System.out.println("休息日");
           // default -> System.out.println("输入错误");
        }
        switch (week)
        {
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("输入错误");
        }
    }
}
