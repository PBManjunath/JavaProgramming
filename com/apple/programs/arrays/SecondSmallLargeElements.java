package com.apple.programs.arrays;

import java.util.Arrays;

public class SecondSmallLargeElements {
    public static void main(String[] args)
    {
        int arr1[] = {2, 5, 1, 3, 0};
        int arr2[] = {8, 10, 5, 7, 9};

        BruteForce(arr1);
        BetterApproach(arr1);
    }

    public static void BruteForce(int[] arr){
        Arrays.sort(arr);
        System.out.println("Second Largest Element: "+arr[arr.length-2]);
        System.out.println("Second smallest Element: "+arr[1]);
    }

    public static void BetterApproach(int[] arr){

        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(max1 < arr[i] ) max1 = arr[i];
            if(min1 > arr[i]) min1 = arr[i];
        }
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(max1 > arr[i] && max2 < max1) {
                max2 = arr[i];
            }
            if(min2 < arr[i] && min2 > min1 ){
                min2 = arr[i];
            }
        }
        System.out.println("Second Largest Element: "+max2);
        System.out.println("Second smallest Element: "+min2);
    }
}
