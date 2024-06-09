package com.apple.programs.strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "this is an amazing program";
        String[] stri = s.split(" ");
        for (int i =0;i< stri.length;i++) {
            System.out.print(stri[stri.length - (i+1)]+" ");
        }


    }

}
