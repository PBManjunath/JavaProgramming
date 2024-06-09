package com.apple.programs.strings;

import java.util.Arrays;

public class AnagramsString {
    public static void main(String[] args){

        String Str1 = "INTEGER";
        String Str2 = "TEGERNl";
        char[] char1 = Str1.toCharArray();
        Arrays.sort(char1);
        char[] char2 = Str2.toCharArray();
        Arrays.sort(char2);


        int size1 = char1.length;
        int size2 = char2.length;

        if( size1 == size2){

            for(int i =0;i<size1;i++){
                if(char1[i] != char2[i]){
                   System.out.println(" Strings are not anagram");
                   return;
                }
            }
            System.out.println("Strings are anagram");
        }

    }
}
