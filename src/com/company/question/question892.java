package com.company.question;

/**
 * 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 *
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 *
 * 请你返回最终形体的表面积。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[[2]]
 * 输出：10
 * 示例 2：
 *
 * 输入：[[1,2],[3,4]]
 * 输出：34
 * 示例 3：
 *
 * 输入：[[1,0],[0,2]]
 * 输出：16
 * 示例 4：
 *
 * 输入：[[1,1,1],[1,0,1],[1,1,1]]
 * 输出：32
 * 示例 5：
 *
 * 输入：[[2,2,2],[2,1,2],[2,2,2]]
 * 输出：46
 *  
 *
 * 提示：
 *
 * 1 <= N <= 50
 * 0 <= grid[i][j] <= 50
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/surface-area-of-3d-shapes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class question892 {
    public static void main(String[] args) {
        int[][] grid1 = {{2}};
        int[][] grid2 = {{1,2},{3,4}};
        int[][] grid3 = {{1,0},{0,2}};
        int[][] grid4 = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] grid5 = {{2,2,2},{2,1,2},{2,2,2}};
        System.out.println("结果是： " + surfaceArea(grid1));
        System.out.println("结果是： " + surfaceArea(grid2));
        System.out.println("结果是： " + surfaceArea(grid3));
        System.out.println("结果是： " + surfaceArea(grid4));
        System.out.println("结果是： " + surfaceArea(grid5));
    }
    //初版
    /*public static int surfaceArea(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    res = res + grid[i][j] * 6 - 2 * (grid[i][j] - 1);
                    if (i - 1 >= 0) {
                        if (grid[i - 1][j] != 0) {
                            res = grid[i - 1][j] >= grid[i][j] ? res - grid[i][j] : res - grid[i - 1][j];
                        }
                    }
                    if (i + 1 < grid.length) {
                        if (grid[i + 1][j] != 0) {
                            res = grid[i + 1][j] >= grid[i][j] ? res - grid[i][j] : res - grid[i + 1][j];
                        }
                    }
                    if (j - 1 >= 0) {
                        if (grid[i][j - 1] != 0) {
                            res = grid[i][j - 1] >= grid[i][j] ? res - grid[i][j] : res - grid[i][j - 1];
                        }
                    }
                    if (j + 1 < grid[0].length) {
                        if (grid[i][j + 1] != 0) {
                            res = grid[i][j + 1] >= grid[i][j] ? res - grid[i][j] : res - grid[i][j + 1];
                        }
                    }
                }
            }
        }
        return res;
    }*/

    //简修版
    public static int surfaceArea(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    res = res + grid[i][j] * 6 - 2 * (grid[i][j] - 1);
                    if (i + 1 < grid.length) {
                        if (grid[i + 1][j] != 0) {
                            res = grid[i + 1][j] >= grid[i][j] ? res - grid[i][j] * 2 : res - grid[i + 1][j] * 2;
                        }
                    }
                    if (j + 1 < grid[0].length) {
                        if (grid[i][j + 1] != 0) {
                            res = grid[i][j + 1] >= grid[i][j] ? res - grid[i][j] * 2 : res - grid[i][j + 1] * 2;
                        }
                    }
                }
            }
        }
        return res;
    }
}
