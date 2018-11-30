package com.lalala.algorithms.chapter1_1;

public class EX09 {
    public static void main(String[] args) {
        System.out.println("网上找的方法：");
        String s = "";
        int N = 89;
        while (N > 0) {
            s = String.valueOf(N % 2) + s; //最先输出的放在最后一位
            N = N / 2;
        }
        System.out.println(s);

        System.out.println("答案的提示方法：");
        int M = 89;
        String string = "";
        for (int n = M; n > 0; n /= 2)
            string = (n % 2) + string;
        System.out.println(string);
        
        System.out.println("java内置方法：");
        int Q = 89;
        String StringQ = "";
        StringQ = Integer.toBinaryString(Q);
        System.out.println(StringQ);
        
    }
}
