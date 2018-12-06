package com.lalala.algorithms.chapter1_1;

/**
 * 求ln(N!)求对数，按照对数相乘拆成求和的方式，只要有个递归边界，有能体现出
 */
public class EX20 {
    private static double ln(int N){
        if(N==0){
            return 0;
        } else {
            return Math.log(N)+ln(N-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(ln(10));
    }
}
