package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * @Auther: lisen
 * @Date: 2019/3/11 17:54
 * @Description:
 */
public class EX04 {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
}
