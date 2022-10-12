package 一六九;

import java.util.HashMap;
import java.util.Map;

public class Solution {

//        public int majorityElement(int[] nums) {
//
//            if (nums.length == 1) {
//                return nums[0];
//            }
//
//            int most = Integer.MIN_VALUE;
//            int num = 0;
//            Map<Integer, Integer> map = new HashMap<>();
//
//            for (int i = 0; i < nums.length; i++) {
//
//                if (map.containsKey(nums[i])) {
//                    if (most < map.get(nums[i])) {
//                        most = map.get(nums[i]);
//                        num = nums[i];
//                    }
//                    map.put(nums[i], map.get(nums[i]) + 1);
//                }else{
//                    map.put(nums[i], 1);
//                }
//            }
//
//            return num;
//        }

    public int majorityElement(int[] nums) {

        int num = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                num = nums[i];
                count++;
            }else {
                count = (num == nums[i]) ? count + 1 : count - 1;
            }
        }

        return num;
    }




    public static void main(String[] args) {

        Solution s = new Solution();
        int i = s.majorityElement(new int[]{8,8,7,7,7});
        System.out.println(i);
    }
}
