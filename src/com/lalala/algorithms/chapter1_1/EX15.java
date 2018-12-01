package com.lalala.algorithms.chapter1_1;

/**
 * 本例子中，使用的数组是a={1, 1, 2, 3, 1, 7, 5, 3, 2, 2, 2};a[i]的值是result数组的下标：result[a[i]]
 * a[i]的值如果相同，比如a[1]=1;a[3]=1;a[5]=1，那么result[a[i]]++;就可以计算出a[i]中有多少个1，并用result[1]来计数。
 * 如果a[i]不在[0,M]内，那么得到的这个数组根本不会出现此a[i]的值。eg: M=15，那么a[i]=21就不会出现在result[i]数组中。
 */
//{1, 1, 2, 3, 1, 7, 5, 3, 2, 2, 2}
//histogram

public class EX15 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 1, 7, 5, 3, 2, 2, 2};
        int[] b = {1, 1, 2, 3, 1, 7, 5, 3, 2, 2, 2};
        int[] result = histogram(a, 15);
        int[] result2 = histogram(b, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%3d",result[i]);
        }
        System.out.println();
        for (int i = 0; i < result2.length; i++) {
            System.out.printf("%3d",result2[i]);
        }
    }

    public static int[] histogram(int[] matrix, int M) {
        int[] matrix2 = new int[M];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] >= 0 && matrix[i] < M)
                matrix2[matrix[i]]++;
        }
        return matrix2;
    }
}
