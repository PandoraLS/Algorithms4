package com.lalala.algorithms.chapter1_1;

public class EX13 {
    public static void transpositionMatrix(int[][] matrix) {
        int hang = matrix.length;
        int lie = matrix[0].length;
        int k = 0;
        int[][] b = new int[lie][hang];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < lie; j++) {
                k = matrix[i][j];
                b[j][i] = k;
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) { //二维矩阵的行数
//            System.out.print(i);
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%4d",b[i][j]);
            }
            System.out.println();
        }

    }

    /**
     * 两层for循环，内层循环变化的比外层快。使得内层循环是行，外层循环是列，这样输出a[行][列]就是先变化行，后变化列了。
     * @param matrix
     */
    public static void printtranspositionMatrix(int[][] matrix){
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.printf("%4d",matrix[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        System.out.println("。。。");
        transpositionMatrix(a);
        System.out.println("答案提供的方法：");
        printtranspositionMatrix(a);
    }
}
