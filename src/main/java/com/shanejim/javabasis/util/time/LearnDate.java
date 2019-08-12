package com.shanejim.javabasis.util.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LearnDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为：" + formatter.format(date));
    }
}
