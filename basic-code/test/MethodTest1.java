package com.itheima.test;

public class MethodTest1 {
    public static void main(String[] args) {
        /*
        需求:
        定义一个方法,求圆的面积,并将结果在方法中打印出来
         */
    }

    /**
     * 求圆的面积
     * @param r 圆的半径
     */
    public static void getArea(double r){
        double area = Math.PI * r * r;
        System.out.println("Area is "+area);
    }
}
