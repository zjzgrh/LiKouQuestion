package com.company.mianshi;

import java.util.HashMap;
import java.util.Map;

public class mianshi17_10 {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(ans == nums[i])
                count++;
            else{
                count--;
                if(count == -1){
                    ans = nums[i];
                    count = 0;
                }
            }
        }
        return ans;
    }
}
