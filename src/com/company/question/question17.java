package com.company.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//题目描述
/*
给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
示例:
输入："23"
输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class question17 {
    public static void main(String[] args) {

        String s = "234";
        System.out.println(letterCombinations(s));
    }

//    public static List<String> letterCombinations(String digits) {
//        List<String> ans = new ArrayList<>();
//        HashMap<Integer,String> data = new HashMap<>();
//        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9};
//        String[] eng = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        for(int i = 0; i < 8; i++){
//            data.put(nums[i],eng[i]);
//        }
//        System.out.println("hash:" + data);
//        String[] s = new String[digits.length()];
//        for (int i = 0; i < digits.length(); i++) {
//            s[i]= data.get(Integer.valueOf(String.valueOf(digits.charAt(i))));
//        }
//
//        return ans;
//    }
public static List<String> letterCombinations(String digits) {
    List<String> ans = new ArrayList<>();
    int[] nums = {2, 3, 4, 5, 6, 7, 8, 9};
    String[] eng = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    return ans;
}
}
