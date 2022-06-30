package 一三六;

import java.util.HashMap;

public class Solution {

    public int singleNumber(int[] nums) {
        //[4,1,2,1,2]
        //[2,2,1]
//        int unicNumber = 0;
//        for (int i = 0; i < nums.length; i++) {
//            unicNumber ^= nums[i];
//        }
//        return unicNumber;

        HashMap hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer count= (Integer)hashmap.get(nums[i]);
            if (count == null) {
                hashmap.put(nums[i], 1);
            }
            else{
                hashmap.put(nums[i], ++count);
            }
        }
        System.out.println(hashmap);
        for (int i = 0; i < nums.length; i++) {
            Integer count= (Integer)hashmap.get(nums[i]);
            if (count == 1) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr1=new int[]{4,1,2,1,2};
        int[] arr2=new int[]{2,2,1};
        Solution s= new Solution();

        System.out.println(s.singleNumber(arr2));
//        System.out.println(4^1);
//        System.out.println(5^2);
//        System.out.println(7^1);
//        System.out.println(6^2);
    }
}
