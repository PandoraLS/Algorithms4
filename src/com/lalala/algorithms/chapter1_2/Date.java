package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * @Auther: lisen
 * @Date: 2019/3/8 16:18
 * @Description:
 */
public class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    @Override //重新实现toString，所以添加一个Override
    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Date that = (Date) x;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }

    public static void main(String[] args) {
        int m = 10;
        int d = 20;
        int y = 2018;
        Date date = new Date(m, d, y);
        StdOut.println(date);
    }
}
