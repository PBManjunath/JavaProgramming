package com.apple.programs.strings;

public class StringPrograms {

    public static void main(String[] args){
        String s = "i am Geeks for Geeks and a Geek";
        EvenLength(s);

        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;

        InsertAtIndex(originalString,stringToBeInserted,index);

        String s1 = "abbA";
        isPalindrome(s1);
    }

    public static void EvenLength(String s){
        String[] s1 = s.split(" ");

        for(String s2 : s1){
            if(s2.length()%2 == 0){
                System.out.println(s2);
            }
        }
    }

    public static void InsertAtIndex(String s1,String s2,int index){
        StringBuffer newString = new StringBuffer(s1);
        newString.insert(index+1,s2);
        System.out.println(newString);

        String frontString = s1.substring(index+1);
        String backString = s1.substring(index,s1.length());
        String newString2 = frontString+s2+backString;
        System.out.println("new String "+ newString2);

    }

    public static void isPalindrome(String s1){
       int size = s1.length();
        for(int i =0;i<size;i++){

            if(s1.charAt(i) != s1.charAt(size-(i+1))){
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Is a panlindrome");
    }
}
