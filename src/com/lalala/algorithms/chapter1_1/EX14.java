package com.lalala.algorithms.chapter1_1;

public class EX14 {
    private static int lg(int n) {
        int shiftRightCount = 0;
        do {
//            n >>= 1;
            n = n / 2; //和 n >>= 1的效果是一样的。
            System.out.println(n);
            shiftRightCount++;
        } while (n != 0);
        return shiftRightCount - 1;
    }

    private static int lg2(int n) { 
        int shiftRightCount = 0;
        while (n != 0) {//while用在哪并没有太大的区别
            n = n / 2;
            System.out.println(n);
            shiftRightCount++;
        }
        return shiftRightCount - 1;
    }

    public static void main(String[] args) {
        int value = 2018;
        System.out.printf("the result of method log is :%s\r\n", lg2(value));
    }
}


