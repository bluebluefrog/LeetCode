package 七二四;

public class Solution {

//    public int pivotIndex(int[] nums) {
//        int arr[] = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            int rTotal=0;
//            int lTotal=0;
//            for (int j = i + 1; j < nums.length; j++) {
//                rTotal += nums[j];
//            }
//            for (int j = 0; j < i; j++) {
//                lTotal += nums[j];
//            }
//            if (rTotal == lTotal) {
//                return i;
//            }
//
//        }
//        return -1;
//    }

    public int pivotIndex(int[] nums) {

        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            
            if (sum == total - nums[i] - sum) {
                return i;
            }
            sum += nums[i];
        }

        return -1;
    }
}
