package com.assignment.ifdemo;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
        /*
        需求:
        题目3（一般难度）
        某银行推出了整存整取定期储蓄业务，
        其存期分为一年、两年、三年、五年，到期凭存单支取本息。
        存款年利率表如下：
        ​	存期		年利率（%）
        ​	一年		2.25
        ​	两年		2.7
        ​	三年		3.25
        ​	五年		3.6
        请存入一定金额（1000起存）,
        存一定年限（四选一），计算到期后得到的本息总额。

        存入金额和存入年限均由键盘录入
        本息计算方式：本金+本金×年利率×年限
         */

        // 1.键盘录入
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter price");
        int price = sc.nextInt();
        System.out.println("存款年利率表如下:");
        System.out.println("存期\t年利率（%）");
        System.out.println("一年\t2.25");
        System.out.println("两年\t2.7");
        System.out.println("三年\t3.25");
        System.out.println("五年\t3.6");
        // 2.选择策略
        System.out.println("请选择存期:");
        System.out.println("1.一年 2.两年 3.三年 4.五年");
        int year = sc.nextInt();
        // 3.计算本息总额
        if(year == 1){
            System.out.println("本息总额为:" + (price + price * 0.0225 * 1));
        }else if(year == 2){
            System.out.println("本息总额为:" + (price + price * 0.027 * 2));
        }
        else if(year == 3){
            System.out.println("本息总额为:" + (price + price * 0.0325 * 3));
        }
        else if(year == 4){
            System.out.println("本息总额为:" + (price + price * 0.036 * 5));
        }
        else{
            System.out.println("输入错误");
        }
    }
}
