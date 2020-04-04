package com.shanejim.javabasis.util;

import java.util.Arrays;

public class LearnArray {
    public static void main(String args[]) {
        //注意区分数组变量和数组对象，

        //静态初始化
        double[] myListOne = {1.9, 2.9, 3.4, 3.5};

        //动态初始化
        int size = 5;
        double[] myListTest = new double[size];
        myListTest[0] = 5.6;
        myListTest[1] = 4.5;
        myListTest[2] = 3.3;
        myListTest[3] = 13.2;
        myListTest[4] = 4.0;

        forShowArray(myListTest);
        foreachShowArray(myListTest);

        //升序排序
        Arrays.sort(myListTest);

        //用二分法查找算法在给定数组中搜索给定值的对象。
        //如果查找值包含在数组中，则返回搜索键的索引；否则返回 (-(插入点) - 1)
        int index = Arrays.binarySearch(myListTest, 111);   //-6
        int index2 = Arrays.binarySearch(myListTest, 4.5);   //2

        boolean isEqual = Arrays.equals(myListOne, myListTest);     //false

        //将指定的值分配给数组指定范围中的每个元素
        Arrays.fill(myListTest, 2.2);
        foreachShowArray(myListTest);

    }

    /**
     * for循环遍历数组
     */
    private static void forShowArray(double[] thisArray) {
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < thisArray.length; i++) {
            total += thisArray[i];
        }
        System.out.println("总和为： " + total);
    }

    /**
     * foreach循环遍历数组
     */
    private static void foreachShowArray(double[] thisArray) {
        // 打印所有数组元素
        for (double element : thisArray) {
            System.out.println(element);
        }
    }

}
