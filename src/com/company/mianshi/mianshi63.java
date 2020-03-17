package com.company.mianshi;

public class mianshi63 {
    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {
//        int res = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                res = Math.max(res,prices[j] - prices[i]);
//            }
//        }
//        return res;
        int res = 0;
        int k = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[k] < prices[i]){
                res = Math.max(res,prices[i] - prices[k]);
            }else{
                k = i;
            }
        }
        return res;
    }
}
