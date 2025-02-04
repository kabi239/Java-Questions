package com.Questions;
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equalsIgnoreCase(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PalindromeNumber foo = new PalindromeNumber();
        System.out.println(foo.isPalindrome(-101));
    }
}
