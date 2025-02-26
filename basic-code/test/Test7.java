package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*
        需求:
        商场都会有VIP的会员制,根据不同的会员等级会有不同的折扣
        假设商品的总价为1000元
        键盘录入会员的级别,根据不同的级别计算折扣后的价格
        会员1级:9折
        会员2级:8折
        会员3级:7折
        非会员:不打折,要打也是看亚撒西~~
         */
        // 1.定义变量记录总价
        int price = 1000;
        // 2.键盘录入会员的级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员的级别");
        int level = sc.nextInt();
        // 3.根据级别来计算实际要支付的价格
        if(level==0){
            System.out.println("非会员,不打折,要打也是看亚撒西~~");
        }
        else if(level==1){
            System.out.println("会员1级,9折");
            System.out.println("实际要支付的价格为:" + price*0.9);
        }
        else if(level==2){
            System.out.println("会员2级,8折");
            System.out.println("实际要支付的价格为:" + price*0.8);
        }
        else if(level==3){
            System.out.println("会员3级,7折");
            System.out.println("实际要支付的价格为:" + price*0.7);
        }
    }
}
