package com.lalala.algorithms.chapter1_1;

public class Matrix {
    public static double dot(double[] x, double[] y) {
        if (x.length == y.length) {
            double s = 0.0;
            for (int i = 0; i < x.length; i++) {
                s += x[i] * y[i];
            }
            return s;
        } else {
            System.out.println("Error");
            return 0.0;
        }
    }

    public static double[][] mult(double[][] a, double[][] b) {
        if (a[0].length == b.length) {
            double[][] s = new double[a.length][b[0].length];
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s[i].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        s[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return s;
        } else {
            System.out.println("Error");
            return null;
        }
    }

    public static double[][] transpose(double[][] a) {
        double[][] s = new double[a[0].length][a.length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = a[j][i];
            }
        }
        return s;
    }

    public static double[] mult(double[][] a, double[] x) {
        if (a[0].length == x.length) {
            double[] s = new double[a.length];
            for (int i = 0; i < s.length; i++) { //确定最终结果s的元素数目==a的行数
                for (int j = 0; j < x.length; j++) { //对应于a的列数==x的元素数目
                    s[i] += a[i][j] * x[j];
                }
            }
            return s;
        } else {
            System.out.println("Error");
            return null;
        }
    }

    public static double[] mult(double[] y, double[][] a) {
        if (y.length == a.length) {
            double[] s = new double[a[0].length];
            for (int i = 0; i < a[0].length; i++) {
                for (int j = 0; j < a.length; j++) {
                    s[i] += a[j][i] * y[j];
                }
            }
            return s;
        }else {
            System.out.println("Error");
            return null;
        }
    }
}
