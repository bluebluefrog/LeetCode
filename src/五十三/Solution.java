package 五十三;

public class Solution {

    public int maxSubArray(int[] nums) {

//        if (nums.length == 1) {
//            return nums[0];
//        }

//        int i =0;
//        int j = nums.length - 1;
//        while (i <= j) {
//            int compareNum = 0;
//
//            for (int k = 0; k <= j; k++) {
//
//                if (nums[k] > maxNum) {
//                    maxNum = nums[k];
//                }
//                compareNum += nums[k];
//                if (compareNum > maxNum) {
//                    maxNum = compareNum;
//                }
//
//            }
//
//            compareNum = 0;
//            for (int k = j; k > i; k--) {
//                if (nums[k] > maxNum) {
//                    maxNum = nums[k];
//                }
//                compareNum += nums[k];
//                if (compareNum > maxNum) {
//                    maxNum = compareNum;
//                }
//            }
//
//            i++;
//            j--;

        int temp = nums[0];
        int maxNum = temp;
        int i = 1;
        while (i < nums.length) {

            if (temp + nums[i] > nums[i]) {
                maxNum = Math.max(temp + nums[i], maxNum);
                temp = temp + nums[i];
            } else {
                int max = Math.max(temp, maxNum);
                maxNum= Math.max(max, nums[i]);
                temp = nums[i];
            }
            i++;
        }
        return maxNum;
    }

    public int maxSubArray1(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp += nums[j];
                if (temp > max) max = temp;
            }

        }
        return max;
    }

//    public int maxSubArray(int[] nums) {
//
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < nums.length; j++) {
//                sum += nums[j];
//                if (sum > maxNum) {
//                    maxNum = sum;
//                }
//            }
//
//        }
//        return maxNum;
//    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = new int[]{31,-41,59,26,-53,58,97,-93,-23,84};
        int number = s.maxSubArray1(array);
        System.out.println(number);

    }
}
