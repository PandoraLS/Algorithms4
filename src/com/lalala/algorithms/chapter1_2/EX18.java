package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

/**
 * @Auther: lisen
 * @Date: 2019/3/12 17:19
 * @Description:
 */
public class EX18 {
    private double m;
    private double s;
    private int N;

    public void addDataValue(double x) {
        N++;
        s = s + 1.0 * (N - 1) / N * (x - m) * (x - m);
        m = m + (x - m) / N;
    }

    public double mean() {
        return m;
    }

    public double var() {
        return s / (N - 1);
    }

    public double stddev() {
        return Math.sqrt(this.var());
    }

    public static void main(String[] args) {
        EX18 accumulator = new EX18();
        In inW = new In("data/tinyW.txt");
        int[] whitelist = inW.readAllInts();
        double[] whitelist2 = new double[whitelist.length];
        for (int i = 0; i < whitelist.length; i++) {
            whitelist2[i] = new Double(whitelist[i]);
        }
        while (!inW.isEmpty()) {
            accumulator.addDataValue(StdIn.readDouble());
        }
        System.out.println("Mean: " + accumulator.mean());
        System.out.println("Var: " + accumulator.var());
        System.out.println("Stddev: " + accumulator.stddev());
    }
}
