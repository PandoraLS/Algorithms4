package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdOut;
/**
 * 输出结果是前16项斐波那契数列
 * */
public class EX06 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.print(i);
            System.out.print(": ");
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
