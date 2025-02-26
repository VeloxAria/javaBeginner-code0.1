package com.itheima.task;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        /*
        需求:
        一个大V直播抽奖，
        奖品是现金红包，分别有
        {2,588,888,1000,10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现的概率各不相同,且八十次保底。
        概率:
        2    70%
        588  18%
        888  8%
        1000 2%
        10000 1%
         */
        int [] prize = {2,588,888,1000,10000};

        drawCount++;
        Random random = new Random();
        int prize;
        // 判断是否达到必出终极大奖的次数
        if (drawCount % GUARANTEED_DRAW_COUNT == 0) {
            prize = PRIZES[4];
            drawCount = 0; // 重置计数器
        } else {
            // 其他奖项的概率分布
            int randomNum = random.nextInt(100);
            if (randomNum < 70) {
                prize = PRIZES[0]; // 2元，概率70%
            } else if (randomNum < 85) {
                prize = PRIZES[1]; // 588元，概率15%
            } else if (randomNum < 93) {
                prize = PRIZES[2]; // 888元，概率8%
            } else {
                prize = PRIZES[3]; // 1000元，概率7%
            }
        }

    }
}
