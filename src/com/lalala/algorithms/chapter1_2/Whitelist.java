package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @Auther: lisen
 * @Date: 2019/3/8 16:43
 * @Description:
 */
public class Whitelist {
    public static void main(String[] args) {
        In inW = new In("data/tinyW.txt");
        In inT = new In("data/tinyT.txt");
        int[] whitelist = inW.readAllInts();
        
        StaticSETofInts set = new StaticSETofInts(whitelist);
        
        while (!inT.isEmpty()) {
            int key = inT.readInt();
            if (!set.contains(key)) {
                StdOut.println(key);
            }
        }
    }
}
