package com.lalala.algorithms.chapter1_1;

public class EX13 {
    public static void transpositionMatrix(int[][] matrix){
        int hang = matrix.length;
        int lie = matrix[0].length;
        int k = 0;
        int[][] b = new int[lie][hang];
        for (int i=0;i<hang;i++){
            for(int j=0;j<lie;j++){
                k = matrix[i][j];
                b[j][i] = k;
            }
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) { //二维矩阵的行数
//            System.out.print(i);
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
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
        transpositionMatrix(a);
        printtranspositionMatrix(a);
    }
}
