package com.Questions;

public class returnPositionOfSpecificCharacter {
    public static void main(String[] args) {
        String str ="Hello world";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='o'){
                System.err.print(i+" ");
            }
        }
    }
}
