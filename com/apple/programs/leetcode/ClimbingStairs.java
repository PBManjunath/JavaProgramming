package com.apple.programs.leetcode;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args){
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ways = tabular(n,dp);
        System.out.print(ways);
    }

    public static int UsingMemoization(int n,int[] dp){
        if(n == 0|| n == 1 || n ==2){
            return dp[n] = n;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = UsingMemoization(n-1,dp) + UsingMemoization(n-2,dp);
    }

    public static int tabular(int n,int[] dp){
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
