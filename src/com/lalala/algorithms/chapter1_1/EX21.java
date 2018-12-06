package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class EX21 {
    public static void main(String[] args) {
        System.out.println("intput count");
        int n = StdIn.readInt();
        String[] nameArray = new String[n];
        int[] intergerArray = new int[n];
        int[] intergerArray2 = new int[n];
        for (int i = 0; i < n; i++) {
            nameArray[i] = StdIn.readString();
            intergerArray[i] = StdIn.readInt();
            intergerArray2[i] = StdIn.readInt();
        }

        System.out.println("------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("|%s|%4d|%4d|%6.3f|", 
                    nameArray[i], intergerArray[i], intergerArray2[i], (float) intergerArray[i] / intergerArray2[i]);
            System.out.println();
        }
        System.out.println("------------------------");
    }
}
/*
5
lala1 123 3
lala2 135 3
lala3 146 3
lala4 111 3
lala5 123 3

System.out.println("------------------------");

*/

