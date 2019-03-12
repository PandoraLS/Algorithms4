package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

/**
 * @Auther: lisen
 * @Date: 2019/3/12 10:39
 * @Description: 
 * 命令行：
 * javac com\lalala\algorithms\chapter1_2\EX15.java
 * java com.lalala.algorithms.chapter1_2.EX15 ..\data\tinyW.txt
 */

//正则表达式手册：http://tool.oschina.net/uploads/apidocs/jquery/regexp.html
public class EX15 {
    public static int[] readInts(String name) {
        In in = new In(name);
        String input = in.readAll(); //这部分代码书上的错误颇多
        String[] words = input.split("\\s+");
        int[] ints = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = readInts(args[0]);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }   
    }
}
