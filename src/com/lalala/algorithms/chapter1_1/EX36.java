package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

public class EX36 {
    public static void main(String[] args) {
        int M = 5, N = 10000;
        int[] a = new int[M];
        int[][] num = new int[M][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[j] = j;
            }
            StdRandom.shuffle(a);
            for (int j = 0; j < M; j++) {
                num[a[j]][j]++;
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
