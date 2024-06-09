package com.apple.programs.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args){
        int[] number = {0,0,1,1,1,2,2,3,3,4};
        int[] nums1 = {1,2,3};
        int[] nums2 ={4,5,6};
       /* int[] sum = sumUsingMap(num,9);
        Arrays.stream(sum).forEach(System.out::println);
        */

       findMedianSortedArrays(nums1,nums2);


    }


    public static int[]  twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {};
    }

    public static int removeDuplicates(int[] number){
        int[] num = Arrays.stream(number).distinct().toArray();
        for(int i =0;i< num.length;i++){
            System.out.println(num[i]);
        }
        return  num.length;
    }

    public static int[] sumUsingMap(int[] number,int target){
        Map<Integer,Integer> numToMap = new HashMap<>();
        for(int i =0;i<number.length;i++){
            if(numToMap.containsKey(target - number[i])){
                return new int[] {numToMap.get(target - number[i]),i} ;
            }
            numToMap.put(number[i],i);
        }
        return new int[] {};
    }

    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int leng = nums1.length + nums2.length;
        int len = nums1.length;
        int[] nums3 = new int[leng];
        for(int i = 0; i < nums1.length ; i++) {
            nums3[i] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++) {
            nums3[len+i] =  nums2[i];
        }

        if(leng%2 == 0){
            int g = leng/2;
            double l = (nums3[g-1] + nums3[g])/2;
            System.out.println(l);
        }
        else {
            int j = leng/2;
            System.out.println(nums3[j]);
        }
    }
}
