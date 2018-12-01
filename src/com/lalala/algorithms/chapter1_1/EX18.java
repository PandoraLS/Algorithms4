package com.lalala.algorithms.chapter1_1;

public class EX18 {
    /**
     * 求a*b
     * @param a：乘数a
     * @param b：乘数b
     * @return a*b
     */
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    /**
     * 求幂指数
     * @param a：底数
     * @param b：指数
     * @return a^b
     */
    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a * a, b / 2);
        return mystery2(a * a, b / 2) * a;
    }

    public static void main(String[] args) {
        int a = mystery(2,25);
        int b = mystery(3,11);
        int c = mystery2(2,25);
        int d = mystery2(3,11);
        System.out.println(a);
        System.out.println(b);
        System.out.println(mystery(a, b) == a * b);
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(mystery2(2, 25) == Math.pow(2, 25));
    }

}
