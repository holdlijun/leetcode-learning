package cn.ipoo;

import org.junit.jupiter.api.Test;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(array, 3);
    }

    /**
     * 题库算法-26题
     * 初级算法-数组-01题
     * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
     * <p>
     * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
     * <p>
     * 你不需要考虑数组中超出新长度后面的元素。
     *
     * @param nums
     * @return
     */
    @Test
    public static int removeRepeatArray(int[] nums) {
        if (nums == null || nums.length < 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                if (j - i > 1) {
                    nums[i + 1] = nums[j];
                }
                i++;
            }
        }
        return i + 1;
    }

    /**
     * 题库算法-122题
     * 初级算法-数组-02题
     * 买卖股票的最佳时机 II
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     * 输入: [7,1,5,3,6,4]
     * 输出: 7
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
     * 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    public static void rotate(int[] nums, int k) {
        while (k > 0) {
            System.out.println("k:" + k);
            int temp = k;
            nums[temp - k] = nums[nums.length - k];
            k--;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
}
