package com.lalala.algorithms.chapter1_1;

public class EX22 {
    /**
     * TODO java中函数名可以相同，但是传输的参数可以不同吗，这样是认为是两个函数吗？
     * 二分查找调用rank
     *
     * @param key 待查找的数字
     * @param a   已存在的有序数组，里面可能包含key，也可能没有key
     * @return 返回对rank函数的调用结果
     */
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    /**
     * 二分查找
     *
     * @param key   待查找的数字
     * @param a     已存在的有序数组，里面可能包含key，也可能没有key
     * @param lo    限定查找范围的下边界
     * @param hi    限定查找范围的上边界
     * @param depth 递归深度计数
     * @return 查找到的key在数组中的位置
     */
    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.printf("     ");
        }
        System.out.println("lo=" + lo + ", hi=" + hi);
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth + 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 12, 15, 18, 22, 26, 29, 35, 36, 37, 41, 42, 45, 48};
        int key = 9;
        int pos = rank(key, a);
        if (pos == -1) {
            System.out.println("not found");
        } else {
            System.out.println("the position is " + pos);
        }
    }
}
