package com.itheima.test;

public class Test10 {
    public static void main(String[] args) {

        /*
        需求:
        世界最高峰是珠穆朗玛峰(8844433米=88444330毫米),
        假如我有一张足够大的纸张,它的厚度是0.1毫米。
        请问,我折叠多少次,就可以保证厚度不低于珠穆朗玛峰的高度?
         */
        double paper = 0.1;
        int count = 0;
        double height = 88444330;
        while(paper < height){
            paper *= 2;
            count++;
        }
        System.out.println("共需折叠" + count + "次");

    }
}
