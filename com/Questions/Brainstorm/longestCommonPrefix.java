package com.Questions.Brainstorm;

public class longestCommonPrefix {
    public String longestCommonPrefixAns(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

            }
        }
        if (prefix.isEmpty()) {
            return "";
        }

        return prefix;
    }

    public static void main(String[] args) {
        longestCommonPrefix foo = new longestCommonPrefix();
        String s[] = { "flower", "flow", "floight" };
        System.out.println(foo.longestCommonPrefixAns(s));
    }
}
