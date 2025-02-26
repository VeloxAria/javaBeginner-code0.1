package com.itheima.assignment;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        //  题目1(训练)
        //
        //身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
        //
        //​	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
        //
        //​	女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
        //
        //现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？

        // 1.录入身高
        double fHeight = 177;
        double mHeight = 165;
        // 2.计算
        double sHeight = (fHeight + mHeight) * 1.08 / 2;
        double dHeight = (fHeight * 0.923 + mHeight) / 2;
        // 3.输出
        System.out.println("儿子的身高:" + sHeight);
        System.out.println("女儿的身高:" + dHeight);

        //  题目2（训练）
        //
        //红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。那么红茶和绿茶现在的钱一样多，请问对么？
        //
        //### 训练提示
        //
        //1. 用什么知识点来计算她们现在的钱有多少？
        //2. 如何对比两个人的钱数？

        // 1.录入变量信息
        int redMoney = 21;
        int greenMoney =24;
        // 2.逻辑
        redMoney = redMoney * 2 + 3;
        greenMoney *=2;
        // 3.判断
        boolean result = redMoney == greenMoney;
        System.out.println(result);


        // 题目3（综合）
        //
        // 某小伙想定一份外卖，商家的优惠方式如下：
        // 鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
        // 订单满30元8折优惠。鱼香肉丝优惠价16元
        // 但是优惠价和折扣不能同时使用。
        // 那么这个小伙要点这三样东西，最少要花多少钱？

        // 1.录入变量信息
        int fyp = 24;
        int fhp =8;
        int r = 3;
        double full30Discount = 0; // 订单满30元8折优惠策略总金额
        double fypDiscount = 0; // 鱼香肉丝优惠策略总金额

        // 2.计算不同策略的价格
        // 订单满30元8折优惠
        double sum = fyp + fhp + r;
        if (sum >= 30) {
            full30Discount = sum * 0.8;
        }
        else{
            full30Discount = sum;
        }
        //   鱼香肉丝优惠价16元
        fypDiscount = 16 + fhp + r;

        // 3.判断哪种策略更省钱
        double minPrice = Math.min(full30Discount, fypDiscount);
        System.out.println("最少要花" + minPrice + "元");

        //题目7：
        //
        //需求：
        //
        //​	键盘录入一个三位数，求这个三位数每一位的数字和。
        //
        //​	举例：
        //
        //​		键盘录入123。那么每一位数字相加为：1 + 2 + 3，和为：7。

        // 1.录入三位数
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();
        // 2.获取位值
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        // 3.求和
        int sum1 = ge + shi + bai;
        System.out.println(sum1);

    }
}
