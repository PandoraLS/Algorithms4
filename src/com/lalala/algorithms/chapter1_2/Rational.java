package com.lalala.algorithms.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

/**
 * @Auther: lisen
 * @Date: 2019/3/12 10:58
 * @Description:
 */
public class Rational {
    private int numerator; //分子
    private int denominator;//分母
    private static int MAX = 2147483647;//2^31 - 1
    private static int MIN = -2147483647;

    public Rational(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        int commonDivisor = euclid(numerator, denominator);//计算公因子（最大公约数）

        //约分
        this.numerator = numerator / commonDivisor;
        this.denominator = denominator / commonDivisor;
    }

    private int euclid(int p, int q) {//欧几里得算法保证分子分母没有公因子(最大公约数)
        if (p == 0 || q == 0) {
            return 1;
        }
        p = Math.abs(p);
        q = Math.abs(q);
        if (p < q) {
            int t = p;
            p = q;
            q = t;
        }
        if (p % q == 0) {
            return q;
        } else {
            return euclid(q, p % q);
        }
    }

    public Rational plus(Rational b) {
        assert isPlusOverflow(numerator * b.denominator, b.numerator * denominator) : "Plus overflow";
        assert isTimesOverflow(denominator, b.denominator) : "Times overflow";
        return new Rational(numerator * b.denominator + b.numerator * denominator, denominator * b.denominator);
    }

    public Rational minus(Rational b) {
        return new Rational(numerator * b.denominator - b.numerator * denominator, denominator * b.denominator);
    }

    public Rational times(Rational b) {
        assert isTimesOverflow(numerator, b.numerator) : "Times overflow";
        assert isTimesOverflow(denominator, b.denominator) : "Times overflow";
        return new Rational(numerator * b.numerator, denominator * b.denominator);
    }

    public Rational divides(Rational b) {
        return new Rational(numerator * b.denominator, denominator * b.numerator);
    }

    /**
     * @param a
     * @param b
     * @return true 程序继续 false 抛出异常 http://www.cnblogs.com/mereder/p/9380623.html
     */
    private boolean isPlusOverflow(int a, int b) {
        if (a > 0 && b > 0) {
            return !(a + b < 0);
        } else if (a < 0 && b < 0) {
            return !(a + b > 0);
        }
        return true;
    }

    private boolean isTimesOverflow(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (a == 0 || b == 0) {
            return false;
        } else {
            return a * b < MAX;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (this.getClass() != object.getClass()) return false;
        Rational that = (Rational) object;
        if (this.numerator != that.numerator) return false;
        if (this.denominator != that.denominator) return false;
        return true;
    }

    @Override
    public String toString() {
        if (Math.abs(numerator) % Math.abs(denominator) == 0) {
            return String.valueOf(numerator / denominator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    public static void main(String[] args) {
        int numerator = 4;
        int denominator = 5;
        Rational a = new Rational(numerator, denominator);
        numerator = -2;
        denominator = 3;
        Rational b = new Rational(numerator, denominator);

        System.out.println("Rational a  " + a);
        System.out.println("Rational b  " + b);
        System.out.println("a + b  " + a.plus(b));
        System.out.println("a - b  " + a.minus(b));
        System.out.println("a * b  " + a.times(b));
        System.out.println("a / b  " + a.divides(b));
        System.out.println("a = b? " + a.equals(b));
    }


}
