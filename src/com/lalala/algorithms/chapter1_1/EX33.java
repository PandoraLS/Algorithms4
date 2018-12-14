package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class EX33 {
    public static void main(String[] args) {

        //terminal输入方式
//        int h, w;
//        System.out.print("The length of array x: ");
//        h = StdIn.readInt();
//        double[] x = new double[h];
//        for (int i = 0; i < x.length; i++) {
//            x[i] = StdIn.readDouble();
//        }
//        System.out.print("The length of array y: ");
//        w = StdIn.readInt();
//        double[] y = new double[w];
//        for (int i = 0; i < y.length; i++) {
//            y[i] = StdIn.readDouble();
//        }
//        System.out.print("The height and width of matrix a: ");
//        h = StdIn.readInt();
//        w = StdIn.readInt();
//        double[][] a = new double[h][w];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = StdIn.readDouble();
//            }
//        }
//        System.out.print("The height and width of matrix b: ");
//        h = StdIn.readInt();
//        w = StdIn.readInt();
//        double[][] b = new double[h][w];
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                b[i][j] = StdIn.readDouble();
//            }
//        }
        //terminal输入方式end

        //test以及结果
        double[] x = {1.0, 2.0, 3.0};
        double[] y = {1.0, 2.0, 3.0};
        double[] z = {1.0, 2.0, 3.0, 4.0};
        double[][] a = {
                {1.0, 2.0, 3.0},
                {1.0, 2.0, 3.0},
                {1.0, 2.0, 3.0},
                {1.0, 2.0, 3.0}
        };
        double[][] b = {
                {1.0, 2.0, 3.0, 4.0},
                {1.0, 2.0, 3.0, 4.0},
                {1.0, 2.0, 3.0, 4.0}

        };
        //test 结果，向量与矩阵相乘的结果并没有给出来
//        两向量点乘：14.0
//        两矩阵之积：
//        6.0 12.0 18.0 24.0
//        6.0 12.0 18.0 24.0
//        6.0 12.0 18.0 24.0
//        6.0 12.0 18.0 24.0
//        矩阵转置：
//        1.0 1.0 1.0 1.0
//        2.0 2.0 2.0 2.0
//        3.0 3.0 3.0 3.0
//        矩阵向量之积：
//        14.0 14.0 14.0 14.0
//        向量与矩阵之积：
//        10.0 20.0 30.0
        System.out.println("两向量点乘：" + Matrix.dot(x, y));

        System.out.println("两矩阵之积：");
        double[][] s = Matrix.mult(a, b);
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("矩阵转置：");
        double[][] transpose = Matrix.transpose(a);
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("矩阵向量之积：");
        double[] array = Matrix.mult(a, x);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("向量与矩阵之积：");
        array = Matrix.mult(z, a);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
