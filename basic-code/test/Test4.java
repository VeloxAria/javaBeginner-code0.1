package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // 在实际开发中如果要根据两种不同的情况执行不同的代码,
        // 就需要使用if...else...结构
        /*需求
          假设,用户在超市实际购买的商品价格是888元
          键盘录入一个整数表示用户实际支付的金额
          如果付款大于等于888元,那么就输出"购买成功"
          如果付款小于888元,那么就输出"购买失败,还差" + (888 - 付款金额) + "元"
         */

        // 1.键盘录入
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你实际支付的金额");
        int money =sc.nextInt();
        // 2.判断
        if(money >= 888){
            System.out.println("购买成功");
        }
        else{
            System.out.println("购买失败,还差" + (888 - money) + "元");
        }

    }
}
