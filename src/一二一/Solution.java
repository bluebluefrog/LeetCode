package 一二一;

public class Solution {


    int buyTime = Integer.MAX_VALUE;
//    int sellTime = Integer.MIN_VALUE;

    int profit = Integer.MIN_VALUE;
//
//    public int maxProfit(int[] prices) {
//
//        for (int i = prices.length - 1; i >= 0; i--) {
//
//            for (int j = 0; j <= i; j++) {
//
//                int max = Math.max(prices[i] - prices[j], profit);
//                profit = max;
//            }
//        }
//
//        return profit <= 0 ? 0 : profit;
//    }

//    public int maxProfit(int[] prices) {
//
//        int minValue = Integer.MAX_VALUE;
//        int maxProfit = 0;
//
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minValue) {
//                minValue = prices[i];
//            } else if (prices[i] - minValue > maxProfit) {
//                maxProfit = prices[i] - minValue;
//            }
//        }
//        return maxProfit;
//    }

    public int maxProfit(int[] prices) {

        int maxProfit = Integer.MIN_VALUE;
        int buyStock = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyStock) {
                buyStock = prices[i];
            }
            if (prices[i] - buyStock > maxProfit) {
                maxProfit = prices[i]-buyStock;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = new int[]{2,4,1};
        System.out.println(s.maxProfit(array));
    }
}
