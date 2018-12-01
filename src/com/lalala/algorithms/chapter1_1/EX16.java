package com.lalala.algorithms.chapter1_1;

public class EX16 {
    public static void main(String[] args) {
        int n = 6;
        String s = exR1(n);
        System.out.println(s);
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
