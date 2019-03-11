package com.lalala.algorithms.chapter1_2;

/**
 * @Auther: lisen
 * @Date: 2019/3/11 18:18
 * @Description:
 */
public class EX07 {
    public static String mystery(String s) {
        //输出字符串的逆序
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N / 2);
        String b = s.substring(N / 2, N);
        System.out.println(b+"------"+a);
        return mystery(b) + mystery(a);
    }

    public static void main(String[] args) {
        String s = "helloworld";
        System.out.println(mystery(s));
    }
}
