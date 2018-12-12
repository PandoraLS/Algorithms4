package com.lalala.algorithms.chapter1_1;

import java.util.Arrays;

//{84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 48, 48, 77, 11, 29, 11, 29, 77, 77}
public class EX29 {
    /**
     * 二分查找，找到a[]（有序数组）中和key相等的元素的下标（如果有重复，则返回相等下标的第一个）
     * @param key : 待查找的值key
     * @param a : 从a[]中查找
     * @return : 返回对应的下标
     */
    public static int rank(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key == a[mid]) {
                //最终找到的和key相等的元素一定是a[mid]（如果有的话）
                //当查找到a[mid]==key时，将mid--;是为了确定和key相等的第一个数的下标。
                while (mid >= 0 && a[mid] == key) {
                    mid--;
                }
                return ++mid;
//                return mid;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 返回数组a[]中等于key的元素的数量。
     * @param key : 待查找的值key
     * @param a : 从a[]中查找
     * @return : 返回对应的下标
     */
    public static int count(int key, int[] a) {
        int num = 0;
        int pos = rank(key, a);
        while (a[pos] == a[++pos]) {
            num++;
        }
        return ++num; // 在while中对比的时候会少一次，所以在这边给加上
    }

    public static void main(String[] args) {
        int a[] = {84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 48, 48, 77, 11, 29, 11, 29, 77, 77};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(rank(48,a));
        System.out.println(count(48,a));
    }
}
