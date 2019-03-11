package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdDraw;

/**
 * @Auther: lisen
 * @Date: 2019/3/11 21:02
 * @Description:
 */
public class VisualCounter {
    private int count; //当前计数值
    private int n; // 当前操作数
    private int N; //操作数的限制
    private int max; //count的最大值限制

    public VisualCounter(int n, int max) {
        N = n;
        this.max = max;
        count = 0;
        this.n = 0;

        StdDraw.setXscale(0, N);
        StdDraw.setYscale(-max, max);
        StdDraw.setPenRadius(0.01);
        StdDraw.point(0, 0);
    }

    public void increment() {
        if (n + 1 > N) {
            System.out.println("operate too much");
            return;
        }
        if (count + 1 > max) {
            System.out.println("exceed the max");
            return;
        }
        count++;
        n++;
        StdDraw.point(n, count);
    }

    public void decrement() {
        if (n + 1 > N) {
            System.out.println("operate too much");
            return;
        }
        if (count - 1 < -max) {
            System.out.println("exceed the min");
            return;
        }
        count--;
        n++;
        StdDraw.point(n, count);
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        VisualCounter counter = new VisualCounter(40, 10);
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
        for (int i = 0; i < 15; i++) {
            counter.decrement();
        }
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
        System.out.println(counter.getCount());
    }
}
