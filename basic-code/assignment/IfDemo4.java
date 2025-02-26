package com.assignment.ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
        /*
        需求:
        题目4（较难）
        某商场购物可以打折，具体规则如下：
        ​	普通顾客购不满100元不打折，满100元打9折；
        ​	会员购物不满200元打8折，满200元打7.5折；
        ​	不同打折规则不累加计算。
        请根据此优惠计划进行购物结算，
        键盘录入
        顾客的类别（0表示普通顾客，1表示会员）
        购物的折前金额（整数即可），
        输出应付金额（小数类型）。
         */

        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        // 2.顾客类别
        int type = getTypeCustomer(sc);
        // 3.购物金额
        System.out.println("请输入购物金额:");
        double price = sc.nextDouble();
        // 4.应付金额
        double discountPrice = getPrice(type,price);
        System.out.println("应付金额为:" + discountPrice);

    }

    /**
     * 获取顾客类别
     * @param sc 键盘录入对象
     * @return 顾客类别
     */
    public static int getTypeCustomer(Scanner sc) {
        int type = -1;
        while (true) {
            System.out.println("请输入顾客类别(0表示普通顾客，1表示会员):");
            type = sc.nextInt();
            if(type == 0 || type ==1) {
                return type;
            }
            System.out.println("输入错误,请重新输入");
        }
    }

    /**
     * 根据用户类别来计算用户应付金额
     * @param type 用户类别
     * @param price 用户购物金额
     * @return 用户应付金额
     */
    public static double getPrice(int type, double price){

         return type == 0 ? (price < 100 ? price : price * 0.9):
                 (price < 200 ? price * 0.8 : price * 0.75);
//        if(type == 0){
//            if(price < 100){
//                return price;
//            }
//            else{
//                return price * 0.9;
//            }
//        }
//        else{
//            if(price < 200){
//                return price * 0.8;
//            }
//            else{
//                return price * 0.75;
//            }
//        }
    }
}
