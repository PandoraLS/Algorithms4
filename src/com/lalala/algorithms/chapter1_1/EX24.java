package com.lalala.algorithms.chapter1_1;

public class EX24 {
    public static void main(String[] args) {
        System.out.println("result: " + euclid(105, 24));
        System.out.println("result: " + euclid(1111111, 1234567));

    }

    public static int euclid(int p, int q) {
        System.out.printf("    ");
        System.out.printf("p = %d, q = %d\n", p, q);
        if (q == 0) return p;
        int r = p % q;
        return euclid(q, r);
    }
}
