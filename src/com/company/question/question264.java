package com.company.question;
/* 题目描述
编写一个程序，找出第 n 个丑数。
丑数就是只包含质因数 2, 3, 5 的正整数。
示例:
输入: n = 10
输出: 12
   解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
说明:  
    1 是丑数。
    n 不超过1690。
 */
public class question264 {
    public static void main(String[] args) {

    }
    public static int nthUglyNumber(int n) {
        //定义一个数组存储丑数序列
        int[] dp = new int[n];
        dp[0] = 1;
        int min = Integer.MAX_VALUE;
        //定义三个指针，分别对应质因数2、3、5.
        int i2 = 0,i3 = 0,i5 = 0;
        for (int i = 1; i < n; i++) {
            //取得最小值作为下一个丑数
            min = Math.min(dp[i2] * 2,Math.min(dp[i5] * 5,dp[i3] * 3));
            //判断是那一个质因数参与得到丑数，将其指针向后移动一位
            if(min == dp[i3] * 3) i3++;
            if(min == dp[i5] * 5) i5++;
            if(min == dp[i2] * 2) i2++;
            //将丑数存入丑数序列
            dp[i] = min;
        }
        return dp[n - 1];
    }
}
