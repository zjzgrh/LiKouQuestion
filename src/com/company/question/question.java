package com.company.question;

import java.util.Arrays;

//16题描述
/*
给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
找出 nums 中的三个整数，使得它们的和与 target 最接近。
返回这三个数的和。假定每组输入只存在唯一答案。

例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.

与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/3sum-closest
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class question {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int ans = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        int begin,end,sum;
        for(int i = 0; i < nums.length; i++){
            begin = i + 1;
            end = nums.length - 1;
            while(begin < end){
                sum = nums[i] + nums[begin] + nums[end];
                if(Math.abs(sum - target) < Math.abs(ans - target))
                    ans = sum;
                if(sum - target > 0)
                    end--;
                else if(sum - target < 0)
                    begin++;
                else
                    return sum;
            }
        }
        return ans;
    }
}
