package com.Questions.Brainstorm;

public class findTheMaxFrequencyCharInAString {
     public static void main(String[] args) {
        String a = "abc def abc asdasd";
        int l = a.length();
        int maxFreq=0;
        char maxChar=' ';
        for(int i=0;i<l;i++){
            char fixedChar=a.charAt(i);
            int currentFreq=0;
            for (int j = 0; j < l; j++) {
                if(a.charAt(j)==fixedChar){
                    currentFreq++;
                }
                
            }
            if (currentFreq>maxFreq) {
                maxFreq=currentFreq;
                maxChar=fixedChar;
            }

        }
        System.out.println("char: "+ maxChar +" with max frequency "+maxFreq);
     }
    
}