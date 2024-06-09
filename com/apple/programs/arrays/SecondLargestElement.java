package com.apple.programs.arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args)
    {
        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("The Largest element in the array is: " + BruteForce(arr1));

        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The Largest element in the array is: " + BetterApproach(arr2));
    }

    public static int BruteForce(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    public static int BetterApproach(int[] arr){

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(max1 < arr[i] ){
                max1 = arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i] < max1 && max2 < arr[i]){
                max2 = arr[i];
            }
        }
        return max2;
    }
}
