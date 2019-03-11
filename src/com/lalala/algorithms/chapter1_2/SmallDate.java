package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * @Auther: lisen
 * @Date: 2019/3/8 22:43
 * @Description: [算法]由日期格式函数产生的若干思考 y * 512 + m * 32 + d https://blog.csdn.net/cook2eat/article/details/45373527
 */
public class SmallDate {
    private final int value;

    public SmallDate(int m, int d, int y) {
        value = y * 512 + m * 32 + d;
        // 简单猜测计算了一下，输入条件应该限定在：m 取值范围在[0,15] (2^4-1)， d 取值范围在[0,31] (2^5-1).
    }

    public int month() {
        return (value / 32) % 16;
        // 除以32后，剩下 y*2^4 + m（d消掉了，2^4 = 2^9 / 2^5），接着再用16(即2^4)取余,得m
    }

    public int day() {
        return value % 32;
        // 用32取余自然剩下余数d
    }

    public int year() {
        return value / 512;
        // 用512除法自然得到y
    }

    @Override
    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public static void main(String[] args) {
        int m = 10;
        int d = 31;
        int y = 2012;
        SmallDate date = new SmallDate(m, d, y);
        StdOut.println(date);
    }
}
