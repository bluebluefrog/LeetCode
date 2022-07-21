package 一;

import java.util.HashMap;
import java.util.Map;

public class Solution {

//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//
//        int l = 0;
//        int r = nums.length - 1;
//        while (l < nums.length) {
//            if (l == r) {
//                l++;
//                r = nums.length - 1;
//            } else if (nums[l] + nums[r] == target) {
//                result[0] = l;
//                result[1] = r;
//                return result;
//
//            } else {
//                r--;
//            }
//        }
//        return result;
//    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = new int[]{2,7,11,15};
        int[] ints = s.twoSum(result, 9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
