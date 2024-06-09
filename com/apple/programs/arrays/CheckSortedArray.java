package com.apple.programs.arrays;

public class CheckSortedArray {
    public static void main(String[] args)
    {
        // int arr1[] = {2, 5, 1, 3, 0};
        int arr1[] = {7,8,5,10,13,14,15};

        BetterApproach(arr1);

    }

    public static void BetterApproach(int[] arr1){
        var flag = true;
        for(int i =0;i<arr1.length-1;i++){
            if(!(arr1[i] <= arr1[i+1])){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.print("Array is sorted");
        }
        else {
            System.out.print("Array is not sorted");
        }
    }
}
