package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

// 寻求一种方法，使得程序可以自己找到对应的N的值，

/**
 * 流程：
 * 1. 计算投筛子的各种情况以及其分布律
 * 2. 统计频率得到的按照之前分布律的结果
 * 3. 计算随机事件对应的频率
 */
public class EX35 {
    public static void main(String[] args) {
        int SIDES = 6;
        double[] dist = new double[2 * SIDES + 1];
        int[] num = new int[2 * SIDES + 1];
        double frequency;
        int N = 450000; //这个N大概是405500附近，可以使得isAccurate = true
        boolean isAccurate = true;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                dist[i + j] += 1.0; //计算所有的两个数的和，并将结果存储到数组中
            }
        }
        System.out.println("probability:");
        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] /= 36.0; // dist[k]下标是从[2]~[12]，所以之前dist的数组长度是[2 * SIDES + 1]
            System.out.printf("%6.3f", dist[k]);
        }

        for (int i = 0; i < N; i++) {
            num[StdRandom.discrete(dist)]++;
        }
        // StdRandom.discrete(dist)的用法是根据特定的一个离散分布产生对应的int值，比如dist这个分布，dist中的元素下标以及下标所对应的
        // 概率，然后将N次实验，按照这个概率分布方式，分别落到每个数值上。
        
        System.out.println();
        System.out.println("Frequency:");
        for (int i = 2; i <= 2 * SIDES; i++) {
            frequency = (double) num[i] / N;
            System.out.printf("%6.3f", frequency);
            if (Math.abs(frequency - dist[i]) > 0.001) {
                isAccurate = false;
            }
        }

        System.out.println();
        System.out.println("isAccurate = " + isAccurate);
    }
}
