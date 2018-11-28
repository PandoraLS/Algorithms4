package com.lalala.algorithms.chapter1_1;

import edu.princeton.cs.algs4.*;

public class EX05 {
    public static void main(String[] args){
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if(x>0 && x < 1 && y > 0 && y < 1) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
}
