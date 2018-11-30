package com.lalala.algorithms.chapter1_1;

public class EX11 {
    public static void printBooleanMatrix(boolean[][] matrix) {
        System.out.print(' ');
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) { //二维矩阵的行数
            System.out.print(i);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] a = {
                {true, true, false, false, true},
                {false, false, false, true, false},
                {false, true, false, false, true},
                {true, false, false, true, false},
                {true, true, false, false, true}

        };
        printBooleanMatrix(a);

    }
}
