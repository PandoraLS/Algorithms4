package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * 1. 定义题目涉及的变量和数组
 * 2. 计算不同N情况下，T次数量的求和,对每次实验，对不同的N(4个)，比较的是b[k]和a.sort()中的值
 * 3. 求平均值
 */
public class EX39 {
    public static void main(String[] args) {
        int T = 10;
        int[] num = new int[4];
        for (int i = 0; i < T; i++) {
            int N = 100;
            for (int j = 0; j < 4; j++) {
                N *= 10;
                int[] a = new int[N];
                int[] b = new int[N];
                for (int k = 0; k < N; k++) {
                    a[k] = StdRandom.uniform(100000, 1000000);
                    b[k] = StdRandom.uniform(100000, 1000000);
                }
                Arrays.sort(a);
                for (int k = 0; k < N; k++) {
                    if (BinarySearch.indexOf(a, b[k]) != -1) {
                        num[j]++;
                    }
                }
            }
        }
        System.out.println("\tN\t\tAverage");
        int N = 100;
        for (int i = 0; i < 4; i++) {
            N *= 10;
            System.out.printf("%7d\t\t%9.2f\n", N, (double) num[i] / T);
        }
    }
}
