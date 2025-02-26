package com.itheima.assignment;

import java.util.Random;

public class ArrayDemo1 {
    public static void main(String[] args) {
        /*
        需求:
        现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，
        从数组的最大索引位置开始到最小索引位置，
        依次表示整数的个位、十位、百位。。。依次类推。
        请编写程序计算，这个数组所表示的整数值。例如：
        数组：{2, 1, 3, 5, 4}
        // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的
        表示的整数为：21354
         */

        // 1.定义数组,该数组中每个元素都是[0-9]之间的数字
        int [] arr = new int[5];
        // 随机生成0~9的随机数
        Random r =new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2.定义一个变量,用来记录最终的结果
        int num = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
    }
}
