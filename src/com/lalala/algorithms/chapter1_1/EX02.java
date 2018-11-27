package com.lalala.algorithms.chapter1_1;

public class EX02 {
    public static void main(String[] args){
        System.out.println((1+2.236)/2);
        System.out.println(1+2+3+4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1+2+"3");
        System.out.println("1" + 2 + 3);
    }
}
/**
 * 嗯，这是一个叫做操作顺序的东西。
 * 计算出1 + 2等于3，然后将字符串“3”附加到其上，将前3个转换为字符串并打印“33”。
 * 在第二个实例中，“1”已经是一个字符串，因此添加数字会将它们转换为匹配的字符串，因此附加“2”然后附加“3”并打印“123”。
 * PS Strings优先，因为它们具有比整数更高的转换优先级，因此它将整数转换为字符串而不是字符串转换为整数，如第二个示例所示
 * */