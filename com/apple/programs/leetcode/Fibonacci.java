package com.apple.programs.leetcode;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args){
        int n = 7;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int value = fibonacciSeriesUsingTable(n,dp);
        System.out.print(value);
    }

    public static int fibonacciSeries(int n,int[] dp ){

        if(n == 0 || n ==1){
            dp[n] = n;
            return n;
        }


        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = fibonacciSeries(n - 1,dp) + fibonacciSeries(n-2,dp);
    }

    public static int fibonacciSeriesUsingTable(int n,int[] dp){
        dp[0] = 0;
        dp[1] =1;

        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
