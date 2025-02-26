package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入一个整数表示小明的成绩");
        int score = sc.nextInt();
        // 2. 根据不同的情况,给出不同的奖励
        if(score >=0 && score <=100)
        {
            if(score >= 95 && score <= 100) {
                System.out.println("奖励一辆宝马");
            } else if(score >= 90 && score <= 94)
            {
                System.out.println("奖励一台iphone");
            } else if(score >= 85 && score <= 89)
            {
                System.out.println("奖励一台ipad");
            } else if(score >= 80 && score <= 84)
            {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("揍一顿");
            }
        }else{
            System.out.println("成绩不合法");
        }


    }
}
