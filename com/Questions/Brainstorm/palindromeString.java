package com.Questions.Brainstorm;

public class palindromeString {
    public static void main(String[] args) {
         String s ="ababaa";
         int i=0;
         int j=s.length()-1;
         boolean flag = true;
         while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
            }
            i++;
            j--;
         }
         if (flag==true) {
             System.out.println("Palindeome");
         } else {
            System.out.println("not a palindrome");
         }

    }
}
