package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

/**
 * 为 BinarySearch 的测试用例添加一个参数：+ 打印出标准输入中不在白名单上的值； -，则打印出标准输入中在名单上的值。
 * 要点分析
 * 很多人没有看懂这个问题，在这里给大家解释一下：
 * 简单说就是为BinarySearch测试用例添加一个参数
 * 该参数为‘+’时，输入要查找的数字，如果没有找到，则打印这个数字，如果找到了，则不打印
 * 该参数为‘-’时，输入要查找的数字，如果没有找到，则不打印，如果找到了，则打印这个数字
 */
public class EX23 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 7, 8, 11, 13, 14};
        System.out.println("+ or - ?");
        char arg = StdIn.readChar();
        System.out.println("input keys:");
        StdIn.readLine();
        String[] keys = StdIn.readLine().split(" ");
        for (int i = 0; i < keys.length; i++) {
            if(rank(Integer.parseInt(keys[i]),a) != -1 && arg == '-'){
                //parseInt（String s） - 返回一个整数（仅十进制）
                // != -1 && arg == '-'，如果查找到keys[i]且arg=='-'，则打印出查找到的值
                System.out.printf("%s ",keys[i]);
            }else if(rank(Integer.parseInt(keys[i]),a) == -1 && arg == '+'){
                // == -1 && arg == '+'，如果未查找到keys[i]且arg=='+'，则打印出未查找到的值
                System.out.printf("%s ",keys[i]);
            }
        }
        System.out.println();

    }
}
