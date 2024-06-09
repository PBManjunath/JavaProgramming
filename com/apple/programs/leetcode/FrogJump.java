package com.apple.programs.leetcode;

import java.util.Arrays;

public class FrogJump {
    public static void main(String args[]) {

        int height[]={30,10,60,10,60,50};
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(SolveTable(n-1,height,dp));
        System.out.println(solve(n-1,height,dp));
    }

    public static int solve(int n,int[] height, int[] dp){

        if(n == 0 ){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int jumpOne = solve(n-1,height,dp) + Math.abs(height[n]-height[n-1]);
        int jumpTwo = Integer.MAX_VALUE;
        if(n>1) {
            jumpTwo = solve(n-2,height,dp) + Math.abs(height[n-2]-height[n]);
        }
        return dp[n] = Math.min(jumpOne,jumpTwo);
    }

    public static int SolveTable(int n,int[] height,int[] dp){
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            int value2 = Integer.MAX_VALUE;
            int value1 = Math.abs(height[i-1]-height[i]) + dp[i-1];
            if(i>2){
                value2 = Math.abs(height[i-2]-height[i]) + dp[i-2];
            }
            dp[i] = Math.min(value2,value1);
        }
        return dp[n];
    }
}

