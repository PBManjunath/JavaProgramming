package com.apple.programs.arrays;

public class LeftRotateByOne {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        Bruteforce(array);
    }

    public static void Bruteforce(int[] arr){
        int j = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = j;
        for(int i:arr){
            System.out.print(i);
        }
    }
}
