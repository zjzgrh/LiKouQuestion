package com.company.mianshi;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 * 示例 2：
 *
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 *  
 *
 * 限制：
 *
 * 1 <= target <= 10^5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class mianshi57_2 {
    public static void main(String[] args) {
        int n = 10;
        int[][] a = findContinuousSequence(n);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
//    public static List<List<Integer>> findContinuousSequence(int target) {
//        if(target % 2 == 0)
//            return null;
//        int i = 3;
//        int x = 1;
//        List<List<Integer>> ress = new ArrayList<>();
//        List<Integer> res = new ArrayList<>();
//        res.add(target / 2);
//        res.add(target / 2 + 1);
//        ress.add(res);
//        while (target / i - i / 2 > 0){
//            List<Integer> res1 = new ArrayList<>();
//            if(target % i == 0){
//                for (int j = 0; j < i; j++) {
//                    res1.add(target / i - i / 2 + j);
//                }
//               ress.add(res1);
//            }
//            i += 2;
//        }
//        return ress;
//    }
    public static int[][] findContinuousSequence(int target) {
        if(target % 2 == 0){
            int a = 3;
            int b = 0;
            while (target / a - a / 2 >= 0){
                if(target % a == 0){
                    b++;
                }
                a += 2;
            }
            int[][] res1 = new int[b][];
            int i = 3;
            int x = b - 1;
            while (target / i - i / 2 >= 0){
                int q = i;
                if(target / i - i / 2 == 0)
                    q--;
                int[] re11 = new int[q];
                if(target % i == 0){
                    for (int j = 0; j < q; j++) {
                        if(target / i - i / 2  == 0)
                            re11[j] = target / i - i / 2 + j + 1;
                        else
                            re11[j] = target / i - i / 2 + j;
                    }
                    res1[x] = re11;
                    x--;
                }
                i += 2;
            }
            return res1;
        }
        else {
            int num = 3;
            int sum = 1;
            while (target / num - num / 2 > 0){
                if(target % num == 0){
                    sum++;
                }
                num += 2;
            }
            int i = 3;
            int x = sum - 2;
            int[][] res = new int[sum][];
            int[] re = new int[2];
            re[0] = target / 2;
            re[1] = target / 2 + 1;
            res[sum - 1] = re;
            while (target / i - i / 2 > 0){
                int[] re1 = new int[i];
                if(target % i == 0){
                    for (int j = 0; j < i; j++) {
                        re1[j] = target / i - i / 2 + j;
                    }
                    res[x] = re1;
                    x--;
                }
                i += 2;
            }
            return res;
        }
    }
}
