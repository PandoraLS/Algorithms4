package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.Count;

/**
 * C(n,k) = C(n-1,k) + C(n-1,k-1)
 */
public class EX27 {
    private static long COUNT = 0;
    private static long COUNT2 = 0;
    private static double[][] MATRIX;

    /**
     * 求解二项分布的值P{X=k}=C(N,k)*p^k*(1-p)^(n-k)
     *
     * @param N 实验总次数N
     * @param k 出现事件A的次数为k次
     * @param p 每次出现事件A的概率是p
     * @return 递归求解该二项分布的值
     */
    public static double binomial(int N, int k, double p) {
        COUNT++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static double bin(int N, int k, double p) {
        COUNT2++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        if (MATRIX[N][k] == -1) {//将计算结果存起来，已经计算过的直接拿过来用，无需再递归计算
            MATRIX[N][k] = (1.0 - p) * bin(N - 1, k, p) + p * bin(N - 1, k - 1, p);
        }
        return MATRIX[N][k];
    }

    public static double betterBinomial(int N, int k, double p) {
        MATRIX = new double[N + 1][k + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                MATRIX[i][j] = -1;
            }
        }
        return bin(N, k, p);
    }

    public static void main(String[] args) {
        System.out.println("result: " + binomial(10, 5, 0.2) + ", count = " + COUNT);
        System.out.println("result: " + betterBinomial(10, 5, 0.2) + ", count = " + COUNT2);
    }
}
