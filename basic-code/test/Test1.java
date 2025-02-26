package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        /*
        需求:
        游戏规则:从任意一个数字开始报数,当你报的数字是7的倍数
        或者包含7的时候(数字的十位是7或者数字的个位是7),
         */

        for (int i = 0; i < 100; i++) {
            if(i % 7 ==0 || i / 10 % 10 == 7 || i % 10 == 7)
                System.out.println("过");
        }
    }
}
