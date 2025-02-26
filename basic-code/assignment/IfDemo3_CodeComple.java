package com.assignment.ifdemo;

import java.util.Scanner;

public class IfDemo3_CodeComple {
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

        // 定义方法来模拟实现业务逻辑

        // 1.键盘录入存款金额和存期
        int year = getDepositYear();
        int price = getDepositAmount();
        // 2.计算本息总额
        double totalPrice = calculateTotalPrice(year,price);
        // 3.输出结果
        System.out.println("本息总金额为:" + totalPrice);

    }


    /**
     * 获取用户的本息总额
     * @param year 存期对应的选项
     * @param price 本金
     * @return 本息总额
     */
    private static double calculateTotalPrice(int year,int price){
        switch(year){
            case 1 -> {
                return price + price * 0.0225 * 1;
            }
            case 2 -> {
                return price + price * 0.027 * 2;
            }
            case 3 -> {
                return price + price * 0.0325 * 3;
            }
            case 4 -> {
                return price + price * 0.036 * 5;
            }
            default -> {
                return -1;
            }
        }
    }

    /**
     * 获取用户存取的金额,确保存取的金额不小于10000
     * @return 用户输入的存款金额
     */
    private static int getDepositAmount() {
        Scanner sc =new Scanner(System.in);

        int price;
        while(true){
            System.out.println("请输入您要存入的金额(不少于10000)");
            price = sc.nextInt();
            if (price >= 10000) {
                return price;
            }
            else{
                System.out.println("您输入的金额不足10000,请重新输入");
            }
        }
    }

    /**
     * 获取用户选择的存期
     * @return 用户选择的存取对应的选项
     */
    private static int getDepositYear(){
        Scanner sc = new Scanner(System.in);

        int year;
        while(true){
            System.out.println("存款年利率表如下:");
            System.out.println("存期\t年利率（%）");
            System.out.println("一年\t2.25");
            System.out.println("两年\t2.7");
            System.out.println("三年\t3.25");
            System.out.println("五年\t3.6");
            // 2.选择策略
            System.out.println("请选择存期:");
            System.out.println("1.一年 2.两年 3.三年 4.五年");
            year = sc.nextInt();
            if(year <1 || year >4){
                System.out.println("您输入的存期有误,请重新输入");
            }else {
                return year;
            }

        }


    }
}
