package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @Auther: lisen
 * @Date: 2019/3/8 15:19
 * @Description:
 */
public class TestVisualAccumulator {
    public static void main(String[] args) {
        int T = 2000;
        VisualAccumulator a = new VisualAccumulator(T,1.0);
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.uniform());
        }
        StdOut.println(a);
    }
}
