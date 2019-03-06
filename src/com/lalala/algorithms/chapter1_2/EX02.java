package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;

import java.util.Comparator;

/**
 * @Auther: lisen
 * @Date: 2019/1/15 17:10
 * @Description: 习题2 Interval1D
 * algs4中给出的class中的unit test都有一定的参考价值
 */
public class EX02 {

    public static void main(String[] args) {
        int N = 4;
        Interval1D[] intervals = new Interval1D[4];
        intervals[0] = new Interval1D(15.0, 33.0);
        intervals[1] = new Interval1D(45.0, 60.0);
        intervals[2] = new Interval1D(20.0, 70.0);
        intervals[3] = new Interval1D(46.0, 55.0);

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    System.out.println(intervals[i] + "  intersects  " + intervals[j]);
                }
            }
        }
    }
}
