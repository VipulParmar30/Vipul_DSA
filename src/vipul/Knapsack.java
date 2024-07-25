package vipul;

import java.util.Arrays;

public class Knapsack {
    public static void main(String[] args) {
        int W=4;
        int[] values={1,2,3};
        int[] weight={4,5,1};
        int N=weight.length;
        System.out.println(knapSack(W,weight,values,N));
    }
    static int max(int a,int b){
        return (a>b?a:b);
    }
    static int knapSack(int W, int[] wt, int[] val, int n)
    {
        int [][] dp=new int [n+1][W+1];
        //initializing the matrix with -1
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <W; j++) {
                dp[i][j]=-1;
            }
        }
        for(int[] row:dp)
            System.out.println(Arrays.toString(dp));

        return knapsackrec(W,wt,val,n,dp);
    }
    static int knapsackrec(int W,int[]wt,int[]val,int n,int[][]dp){
        if(n==0 || W==0)
            return 0;
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]>W){
            return dp[n][W]=knapsackrec(W,wt,val,n-1,dp);
        }
        return dp[n][W]=max((val[n-1]+knapsackrec(W-wt[n-1],wt,val,n-1,dp)),knapsackrec(W,wt,val,n-1,dp));
    }
}
