package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class EX26 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        int t = 0;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }


}
