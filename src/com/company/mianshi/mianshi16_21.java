package com.company.mianshi;

import java.util.Arrays;

public class mianshi16_21 {
    public static void main(String[] args) {

    }
    public static int[] findSwapValues(int[] array1, int[] array2) {
        int[] ans = new int[2];
        int sum = Math .abs(Arrays.stream(array1).sum() - Arrays.stream(array2).sum());
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] + array2[j] == sum){
                    ans[0] = array1[i];
                    ans[1] = array2[j];
                    return ans;
                }
            }
        }
        return ans;
    }
}
