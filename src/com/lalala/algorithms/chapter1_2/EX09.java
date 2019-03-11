package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Auther: lisen
 * @Date: 2019/3/11 19:58
 * @Description:
 */
/**
 * javac com\lalala\algorithms\chapter1_2\EX09.java
 * java com.lalala.algorithms.chapter1_2.EX09 ..\data\tinyW.txt 12
 */


public class EX09 {
    public static int rank(int key, int[] a, Counter counter) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            counter.increment();
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
//        In in = new In(args[0]);
//        int key = Integer.parseInt(args[1]);
//        int[] whitelist = in.readAllInts();
//        Counter c = new Counter("binary search");
//
//        Arrays.sort(whitelist);
//        rank(key,whitelist,c);
//        System.out.println(c);
        
        //tinyW.txt中的数据：84 48 68 10 18 98 12 23 54 57 33 16 77 11 29
        In inW = new In("data/tinyW.txt");
        int key2 = 12;
        int[] whitelist2 = inW.readAllInts();
        Counter c2 = new Counter("binary serach2");
        
        Arrays.sort(whitelist2);
        rank(key2,whitelist2,c2);
        System.out.println(c2);
    }
}
