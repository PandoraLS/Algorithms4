package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Arrays;

//{7, 1, 5, 1, 9, 5, 7, 7, 5, 1}

public class EX28 {
    public static void main(String[] args) {
        int[] whitelist = {1, 3, 3, 3, 1, 1, 9, 7, 1, 3, 7, 9, 3, 7};
        Arrays.sort(whitelist);
        for (int i = 0; i < whitelist.length; i++) {
            System.out.print(whitelist[i] + " ");
        }
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println();
        for (int i = 0; i < whitelist.length - 1; i++) {
            if (whitelist[i] != whitelist[i + 1]) {
                list.add(whitelist[i]);
            }
        }
        list.add(whitelist[whitelist.length - 1]);
        int[] whitelist2 = new int[list.size()];
        for (int i = 0; i < whitelist2.length; i++) {
            whitelist2[i] = list.get(i);
            System.out.print(whitelist2[i] + " ");
        }
        System.out.println();
        System.out.println(BinarySearch.indexOf(whitelist2, StdIn.readInt()));
    }
}
