package com.itheima.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        // 需求:键盘录入两个数字,表示范围
        // 统计这个范围中,
        // 既能被3整除,又能被5整除数字有多少个

        // 1.键盘录入
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请输入一个数字表示范围的结束");
        int end = sc.nextInt();
        // 2.统计
        int count = 0;
        for(int i = start; i <= end; i++) {
            if(i % 3 ==0 && i % 5 ==0) {
                count++;
            }
        }
        System.out.println("满足要求的数字有:" + count + "个");
    }
}
