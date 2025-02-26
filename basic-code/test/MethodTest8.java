package com.itheima.test;

public class MethodTest8 {
    public static void main(String[] args) {
        /*
        需求:
        定义一个方法copyOfRange(int [] arr,int from ,int to)
        将数组arr中从索引from(包含)到索引to(不包含)的元素复制到新数组中,
        将新数组返回
         */
        // 1.定义数组
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        // 2.调用方法
        int [] arr2 = copyOfRange(arr,3,5);
        // 3.遍历数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    public static int[] copyOfRange(int [] arr,int from,int to){
        // 定义新的数组
        int [] newArr = new int [to - from];
        // 遍历数组
        // 伪造索引的思想 index
        for (int i = from,j = 0; i < to; i++,j++) {
            newArr[j] = arr[i];
        }
        return newArr;
    }
 }
