package com.company.mianshi;

public class mianshi17_09 {
    public static void main(String[] args) {

    }
    public static int getKthMagicNumber(int k) {
        int[] dp = new int[k];
        dp[0] = 1;
        int min = Integer.MAX_VALUE;
        int i3 = 0,i5 = 0,i7 = 0;
        for (int i = 1; i < k; i++) {
            min = Math.min(dp[i] * i3,Math.min(dp[i] * i5,dp[i] * i7));
            if(min == dp[i] * i3) i3++;
            if(min == dp[i] * i5) i5++;
            if(min == dp[i] * i7) i7++;
            dp[i] = min;
        }
        return dp[k];
    }
}
