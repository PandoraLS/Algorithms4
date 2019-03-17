package com.lalala.algorithms.chapter1_3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * @Auther: lisen
 * @Date: 2019/3/17 10:42
 * @Description:
 */

/**
 * 使用方式，需要一行一个字符的输入，然后按Ctrl+Z，用户体验效果差
 * eg：计算(1+((2+3)8(4*5)))
 * C:\Education\code\Algorithms4\src>java com.lalala.algorithms.chapter1_3.Evaluate
 * (
 * 1
 * +
 * (
 * (
 * 2
 * +
 * 3
 * )
 * *
 * (
 * 4
 * *
 * 5
 * )
 * )
 * )
 *
 *
 * ^Z
 * 101.0
 */

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("(")) ;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            } else vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());
    }
}
