package com.Questions.Brainstorm;

public class reverseTheOrderOfWords {
    public static void reverse(String words[]) {
        int i=0;
        int j= words.length-1;
        while(i<j){
            String temp = words[i];
            words[i]= words[j];
            words[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        
        String s ="kabi max"; 
        int l= s.length();
        String currentword="";
        int count= 0;

        for (int i = 0; i < l; i++) {
            if(s.charAt(i)==' '){
                count++;
            }
        }
        count+=1;
        String words[] = new String[count];

        int index=0;
        for (int i = 0; i < l; i++) {
            if(s.charAt(i)!= ' '){
                currentword = currentword +s.charAt(i);
            }
            else{
                words[index]=currentword;
                currentword="";
                index++;
            }
        }
        words[index]= currentword;
        reverse(words);

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+" ");
        }


    }
}
