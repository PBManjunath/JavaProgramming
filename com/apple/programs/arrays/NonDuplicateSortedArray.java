package com.apple.programs.arrays;

import java.util.HashSet;

public class NonDuplicateSortedArray {
    public static void main(String[] args){
        int arr[] = {1,1,2,2,2,3,3};
       /* int k = Bruteforce(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        */

        BetterApproach(arr);;
    }

    public static int Bruteforce(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        int k = hashSet.size();

        for(int i: hashSet){
            arr[i++] = i;
        }
        return k;
    }

    public static void BetterApproach(int[] arr){

        int i=0;
        for(int j=0;j< arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]);
        }

    }
}
