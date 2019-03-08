package com.lalala.algorithms.chapter1_2;

/**
 * @Auther: lisen
 * @Date: 2019/3/8 15:11
 * @Description:
 */
public class Accumulator {
    private double total;
    private int N;

    public void addDataValue(double val) {
        N++;
        total += val;
    }

    public double mean() {
        return total / N;
    }

    public String toString() {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }
}
