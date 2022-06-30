package 一四八零;

public class Solution {

//    public int[] runningSum(int[] nums) {
//
//        int[] arr = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                arr[i] += nums[j];
//            }
//        }
//
//        return arr;
//    }

    public int[] runningSum(int[] nums) {

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                arr[i] = arr[i - 1] + nums[i];
            }
        }

        return arr;
    }
}
