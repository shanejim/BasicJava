package com.shanejim.javabasis.util;

import java.util.Random;

public class LearnRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i <= 20; i++) {
            int num = rand.nextInt(10);
            System.out.println("第 " + (i + 1) + " 个随机数是：" + num);
        }
    }
}
