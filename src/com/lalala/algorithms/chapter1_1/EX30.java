package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class EX30 {
    /**
     * 使用欧几里得算法求最大公约数
     *
     * @param p 因数p
     * @param q 因数q
     * @return p和q的最大公约数
     */
    public static int euclid(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return euclid(q, r);
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = (euclid(i, j) == 1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
