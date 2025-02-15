package com.Questions.Brainstorm;
/*
 *write a Java program to reverse a given string using recursive method
 */

import java.util.Scanner;

public class reverseString {
    public String iterativeReverse(String a) {
        String s = "";
        char[] arr = a.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            s += arr[i];
        }
        return s;
    }

    public StringBuffer stringreverse2(String a) {
        return new StringBuffer(a).reverse();
    }

    static String recursiveReverse(String a) {
        if ((a == null) || (a.length() <= 1)) {
            return a;
        }
        return recursiveReverse(a.substring(1)) + a.charAt(0);
        /*
         * s= Khushboo
         * 1->recursiveReverse("Khushboo");
         * 2->recursiveReverse("hushboo") + K;
         * 3->(recursiveReverse("ushboo")+h )+ k;
         * 4->((recursiveReverse("shboo")+u)+h )+ k;
         * 5->(((recursiveReverse("hboo")s+)+u)+h )+ k;
         * 6->((((recursiveReverse("boo")+h)s+)+u)+h )+ k;
         * 7->(((((recursiveReverse("oo")+b)+h)s+)+u)+h )+ k;
         * 8->((((((recursiveReverse("o")+o)+b)+h)s+)+u)+h )+ k;
         * 9->((((((return o +o)+b)+h)s+)+u)+h )+ k;
         */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseString foo = new reverseString();
        System.out.println("Enter your string");
        String s = sc.next();
        // iterative Reverse
        System.out.println(foo.iterativeReverse(s));
        // using stringBuffer
        System.out.println(foo.stringreverse2(s));
        // using recursion
        System.out.println(reverseString.recursiveReverse(s));

        sc.close();
    }
}
