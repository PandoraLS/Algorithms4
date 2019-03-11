package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.*;

/**
 * @Auther: lisen
 * @Date: 2019/3/11 15:50
 * @Description:
 */
public class EX03 {
    public static void main(String[] args) {
        int N = 4;
        double min = .2;
        double max = 0.5;

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        Point2D[] leftTopPoints = new Point2D[N];
        Point2D[] rightBottomPoints = new Point2D[N];
        Interval2D[] interval2DS = new Interval2D[N];

        for (int i = 0; i < N; i++) {
            double a = StdRandom.uniform(min, max);
            double b = StdRandom.uniform(min, max);
            double left, right, top, bottom;
            Interval1D x, y;
            if (a < b) {
                left = a;
                right = b;
            } else {
                left = b;
                right = a;
            }
            x = new Interval1D(left, right);
            a = StdRandom.uniform(min, max);
            b = StdRandom.uniform(min, max);
            if (a < b) {
                bottom = a;
                top = b;
            } else {
                bottom = b;
                top = a;
            }
            y = new Interval1D(bottom, top);
            leftTopPoints[i] = new Point2D(left, top);
            rightBottomPoints[i] = new Point2D(right, bottom);
            interval2DS[i] = new Interval2D(x, y);
            interval2DS[i].draw();
        }
        int containNum = 0, intervalNum = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                if (j > i && interval2DS[i].intersects(interval2DS[j])) {
                    intervalNum++;
                }
                if (j != i && interval2DS[i].contains(leftTopPoints[j]) && interval2DS[i].contains(rightBottomPoints[j])) {
                    containNum++;
                }
            }
        }
        System.out.println("interval:"+intervalNum);
        System.out.println("contain:"+containNum);
    }
}
