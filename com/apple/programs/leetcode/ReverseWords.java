package com.apple.programs.leetcode;

import java.util.Arrays;

public class ReverseWords {
    public  static void main(String[] args){
        String s = "the sky is blue";
        String[] rever = s.split("\\s +");
        StringBuilder reverse = new StringBuilder();
        int size = rever.length;
        for(int i = size; i>0 ; i--){
            reverse.append(rever[i-1]);
            reverse.append(" ");

       }
        System.out.println(reverse.toString().trim());
    }
}
