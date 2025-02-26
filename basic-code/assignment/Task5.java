package com.itheima.task;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        /*
        一个大V直播抽奖，
        奖品是现金红包，分别有
        {2,588,888,1000,10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
         */

        // 1.定义奖池
        int [] prize = {2,588,888,1000,10000};
        // 2.抽奖
        drawPrize(prize);

    }
    public static void drawPrzie(int [] prize){
        // 1.定义一个数组,用于记录抽奖结果
        boolean [] isUsed = new boolean[prize.length];
        // 2.随机抽奖并保证不重复
        Random r = new Random();
        int count = 0; // 记录已经抽过的奖项个数
        while(count < prize.length){
            int index = r.nextInt(prize.length);
            // 判断该奖项是否已经被抽过
            if(!isUsed[index]){
                isUsed[index] = true;
                count++;
                System.out.println(prize[index] + "元的奖金");
            }
        }
    }
}
