package com.Questions;

import java.util.Scanner;

public class returnPositionOfSpecificWordInASentence {
    public static boolean match(String s, String t, int startIndex){
        int i = startIndex;
        int j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)!=t.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();

        String target=sc.next();

        String [] words =s.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(target)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //   above we are finding the position of the target word in the sentence
        //   OR
        //   below we are finding the position where the target string matches as a substring
        // considering all characters of the sentence as separate elements
        for (int i = 0; i < s.length(); i++) {
            if(match(s,target,i)==true){
                System.err.print(i+" ");
            }
        }
    }
}
