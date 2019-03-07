package com.lalala.algorithms.chapter1_2;

/**
 * @Auther: lisen
 * @Date: 2019/3/7 11:43
 * @Description:
 */
public class DealString {
//    public static boolean isPalindrome()
    
    public static void main(String[] args) {
        String s = "lalala.txt.zip";
        int dot = s.indexOf(".");
        String base = s.substring(0, dot);
        String extension = s.substring(dot + 1, s.length());
        System.out.println(base);
        System.out.println(extension);
    }
}
