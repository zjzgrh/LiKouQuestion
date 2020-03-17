package com.company.mianshi;

import java.util.Arrays;

public class mianshi03 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == nums[i+1])
                return nums[i];
        }
        return 0;
    }
}
