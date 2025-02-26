package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        需求:键盘录入一个大于等于2的整数X,计算并返回X的平方根
        结果只保留整数部分,小数部分将被舍去
         */
        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        // 2.计算
        for (int i = 0; i < num / 2; i++) {
            if(i * i > num){
                System.out.println(i-1);
            }
        }
    }
        /**
         * Calculate the integer square root of a given number using binary search.
         * @param num The input number.
         * @return The integer square root of the input number.
         */
        public static int integerSquareRoot(int num) {
            if (num < 2) {
                return num;
            }
            int left = 2, right = num / 2;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long square = (long) mid * mid;
                if (square > num) {
                    right = mid - 1;
                } else if (square < num) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
            return right;
        }
    }
