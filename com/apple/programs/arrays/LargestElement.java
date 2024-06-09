package com.apple.programs.arrays;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args)
    {
        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("The Largest element in the array is: " + ArraSort(arr1));

        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The Largest element in the array is: " + RecursiveSort(arr2));
    }

    public static int ArraSort(int[] arr){
        //TimeComplexity nlog(n)
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int RecursiveSort(int[] p){
        //time complexity n
        int max = Integer.MAX_VALUE;
        for(int i=0;i<p.length;i++){
            if(max<p[i]){
                max = p[i];
            }
        }
        return max;
    }
}
