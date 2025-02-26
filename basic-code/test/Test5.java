package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        // 在实际开发中,电影院选座也会使用到if判断
        // 假设某影院售卖了100张票,票的编号为1-100
        // 其中奇数票号做左侧,偶数票号做右侧
        // 请根据键盘录入的票号,判断该票是坐左侧还是右侧

        // 1.录入票号
        Scanner sc =new Scanner(System.in);
        System.out.println("请输人您的票号");
        int ticket = sc.nextInt();
        // 2.判断
        if(ticket >=0 && ticket <=100){
            if(ticket % 2 ==0){
                System.out.println("您的座位在右侧");
            }
            else{
                System.out.println("您的座位在左侧");
            }
        }
        else {
            System.out.println("票号错误");
        }


    }
}
