package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @Auther: lisen
 * @Date: 2019/3/6 15:56
 * @Description: 
 */
public class Flips {
    public static void main(String[] args) {
        int T = 1000;
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int t = 0; t < T; t++) {
            if (StdRandom.bernoulli(0.5))
                heads.increment();
            else
                tails.increment();
        }
        StdOut.println(heads);
        StdOut.println(tails);
        int d = heads.tally() - tails.tally();
        StdOut.println("delta: " + Math.abs(d));
        
        Counter c1 = new Counter("ones");
        c1.increment();
        Counter c2 = c1;
        c2.increment();
        StdOut.println(c1);
    }
}
