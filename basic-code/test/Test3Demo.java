package com.itheima.test;

import java.util.Scanner;

public class Test3Demo {
    // 练习(残血版)
    // 您和您的约会对象在餐厅里面正在约会
    // 键盘录入两个整数,表示你和你约会对象衣服的时髦度.(手动录入0~10之间的整数,不能录入其他)
    // 如果你的时髦度大于你的对象的时髦程度,相亲就成功,输出True
    // 否者输出False
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        // 1.输入时髦度
//        System.out.println("请输入男生的时髦度");
//        int boyFashion = sc.nextInt();
//
//        System.out.println("请输入女生的时髦度");
//        int girlFashion = sc.nextInt();
//        // 2.比较时髦度
//        boolean result = boyFashion > girlFashion;
//        System.out.println(result);
//
        // ps: 本地配置版本(!Full)

        choiceLove();

    }

    private static void menu()
    {
        System.out.println("请输入您的选择");
        System.out.println("1.男生");
        System.out.println("2.女生");
        System.out.println("3.Exit");
    }
   private static int getFashion(Scanner sc)
   {
       System.out.println("请输入0~10之间的整数");
       int num = sc.nextInt();
       if(num >= 0 && num <= 10){
           return num;
       }
       else{
           System.out.println("输入错误!请重新输入!");
           return -1;
       }
   }
   private static void choiceLove() {
       Scanner sc = new Scanner(System.in);

       int boyFashion = -1;
       int girlFashion = -1;
       int count = 0;
       int bCount = 0;
       int gCount = 0;
       int loveBattle =0;

       while (true) {
           menu();
           int choice = sc.nextInt();

           if (choice == 1) {
               System.out.println("请输入男生的时髦度");
               boyFashion = getFashion(sc);
               if (boyFashion == -1) {
                   continue;
               }
               System.out.println("录入成功!");
               count++;
               bCount++;
           } else if (choice == 2) {

               if (gCount == 1) {
                   loveBattle = girlFashion;
               }
               System.out.println("请输入女生的时髦度");
               girlFashion = getFashion(sc);
               if (boyFashion == -1) {
                   continue;
               }
               System.out.println("录入成功!");
               count++;
               gCount++;
           } else if (choice == 0) {
               System.out.println("欢迎您下次游玩~");
               return;
           } else {
               System.out.println("您的输入有误,请重新输入");
           }

           if (count == 2) {
               // 恋爱战争
               if(bCount == 2){

               }
               if(gCount == 2){
                  // loveBattle
               }

               // 用户个性化设置
               // 雄性
               boolean result = boyFashion > girlFashion;
               if (result) {
                   System.out.println("相亲成功!");
               } else {
                   System.out.println("相亲失败!");
               }
           }
       }

   }
}
