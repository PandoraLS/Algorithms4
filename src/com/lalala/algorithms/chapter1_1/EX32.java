package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class EX32 {
    public static void main(String[] args) {
        //输入的流按照数组的方式展示出来
        double[] dataflow = {0.1, 1.0, 7.0, 8.0, 8.1, 8.2, 9.0, 11.0, 15.0, 30.0, 33.0, 39.0, 40.0, 45.0, 49.0, 50.0, 60.0, 75.0, 88.0, 100.0};

//    int N = StdIn.readInt(); //分成N段
//    double l = StdIn.readDouble();
//    double r = StdIn.readDouble();
        int N = 5;
        double l = 0.0;
        double r = 60.0;
        int seg = (int) (r - l) / N;//每段的间距是seg
        int[] num = new int[N];//用于记录落入每段的数量
        //0-12，13-24，25-36，37-48，49-60;
        for (int i = 0; i < N; i++) { //l+i*seg
            int count = 0;
            for (int j = 0; j < dataflow.length; j++) {
                if (l + seg * i <= dataflow[j] && dataflow[j] < l + seg * i + seg) {
                    count++;
                }
            }
            num[i] = count;
            System.out.print(num[i] + " ");
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = num[i] / 20.0;
            double rw = 0.5 / N;
            double rh = num[i] / 20.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }

//        int M = 100;
//        double[] a = new double[M];
//        for (int i = 0; i < M; i++) {
//            a[i] = StdRandom.uniform(0.0, 1.0);
////            System.out.print(a[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i < M; i++) {
//            double x = 1.0 * i / M; //横坐标的取值范围是0.0~1.0，x为矩形的中点
//            double y = a[i] / 2.0; //纵坐标的取值范围是在0.0~1.0之间，y为矩形的中点
//            double rw = 0.5 / M; // 矩形半宽, 这里共有100个矩形（横坐标范围是0.0~1.0），那么每个矩形的半宽就是0.5/100
//            double rh = a[i] / 2.0; //矩形的半高,a[i]为实际高度
//            StdDraw.filledRectangle(x, y, rw, rh);
//        }
    }


}
