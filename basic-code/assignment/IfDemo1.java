package com.assignment.ifdemo;

public class IfDemo1 {
    public static void main(String[] args) {
        /*
        需求:
        题目1
        李雷想买一个价值7988元的新手机，
        她的旧手机在二手市场能卖1500元，
        而手机专卖店推出以旧换新的优惠，
        把她的旧手机交给店家，新手机就能够打8折优惠。
        为了更省钱，李雷要不要以旧换新？请在控制台输出。
         */
        int price = 7988;
        int oldPhone = 1500;
        double discount = price * 0.2;

        if(discount > oldPhone){
            System.out.println("打折更省钱");
        }
        else{
            System.out.println("以旧换新更省钱");
        }
    }
}
