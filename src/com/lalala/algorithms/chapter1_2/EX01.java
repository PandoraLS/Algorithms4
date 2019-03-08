package com.lalala.algorithms.chapter1_2;

/**
 * @Auther: lisen
 * @Date: 2019/1/15 17:54
 * @Description:
 */

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;


public class EX01 {

    public static void main(String[] args) {
        int N = 100;
        double x0 = 0.2;
        double y0 = 0.3;
        
        //设置画布大小和画笔半径
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setPenRadius(0.01);

        //画出每一个点
        Point2D points[] = new Point2D[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point2D(Math.random(), Math.random());
            points[i].draw();
        }
//        StdDraw.show();

        //单独画一个点
        Point2D p = new Point2D(x0, y0);
        StdDraw.setPenColor(StdDraw.RED); //设置画笔颜色
        StdDraw.setPenRadius(0.03);
        p.draw();


        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setPenRadius(0.002);
        if (N > 1) {
            //计算某一点p到其他所有点的距离，并画出连线
            double min = points[0].distanceTo(points[1]);
            for (int i = 0; i < N - 1; i++) {
                p.drawTo(points[i]); //p点到其他N-1个点的线
//                StdDraw.show();
                for (int j = i + 1; j < N; j++) {
//                    p.drawTo(po);
                    if (points[i].distanceTo(points[j]) < min) {
                        min = points[i].distanceTo(points[j]);
                    }
                }
            }
            System.out.println("min : " + min);
        }
    }
}
