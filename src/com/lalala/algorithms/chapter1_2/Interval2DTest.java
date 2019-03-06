package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.*;

/**
 * @Auther: lisen
 * @Date: 2019/3/7 00:44
 * @Description: page47 Interval2D测试用例
 */
public class Interval2DTest {
    public static void main(String[] args) {
        double xlo = .2;
        double xhi = .5;
        double ylo = .5;
        double yhi = .6;
        int T = 10000;

        Interval1D xinterval = new Interval1D(xlo, xhi);
        Interval1D yinterval = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(xinterval, yinterval);
        box.draw();

        Counter c = new Counter("hits");

        for (int t = 0; t < T; t++) {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x, y);
            if (box.contains(p)) c.increment();
            else p.draw();
        }
        StdOut.println(c);
        StdOut.println(box.area());

    }
}
