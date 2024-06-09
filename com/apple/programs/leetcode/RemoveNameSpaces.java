package com.apple.programs.leetcode;

public class RemoveNameSpaces {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String name = "P B  Manjunath";

        String[] names = name.split("\\s* ");
        for (int i =0;i<names.length;i++){
            System.out.print(names[i]);
        }
    }

}
