package com.lalala.algorithms.chapter1_2;

/**
 * @Auther: lisen
 * @Date: 2019/3/11 18:02
 * @Description:
 */
public class EX06 {
    public static void main(String[] args) {
        String s = "ACTGACG";
        String t = "TGACGAC";
        if(s.length() == t.length() && s.concat(s).indexOf(t) >=0){
            System.out.println("yes");
        }
    }
}
