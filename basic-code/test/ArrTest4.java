package com.itheima.test;

import java.util.Random;

public class ArrTest4 {
    public static void main(String[] args) {
        /*
        需求:
        生成10个1~100之间的随机数存入数组
        求所有元素的和
        求所有元素的平均数
        统计有多少个元素比平均数小
         */

        // 1.定义数组
        int [] arr = new int[10];
        // 2.生成随机数并存入数组
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        // 3.求所有元素的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // 4.求所有元素的平均数
        double avg = (double) sum / arr.length;
        // 5.统计有多少个元素比平均数小
        int count = 0;
        for (int i : arr) {
            if(i < avg){
                count++;
            }
        }
        System.out.println("所有元素的和" + sum);
        System.out.println("所有元素的平均数" + avg);
        System.out.println("有" + count + "个元素比平均数小");
    }
}
