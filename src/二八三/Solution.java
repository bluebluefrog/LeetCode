package 二八三;

public class Solution {

//    public void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) {
//                nums = moveZeroBack(nums, i);
//            }
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }
//    private int[] moveZeroBack(int[] nums,int index) {
//        for (int i = index; i < nums.length-1; i++) {
//            if (nums[i + 1] != 0) {
//                int temp=nums[i];
//                nums[i]=nums[i+1];
//                nums[i+1]=temp;
//            }
//        }
//        return nums;
//    }


//    public void moveZeroes(int[] nums) {
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//
//        for (int i = j; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//    }

    public void moveZeroes(int[] nums) {

        int right = 0, left = 0;

        while (right < nums.length) {

            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }


    private void swap(int[] nums,int left,int right) {
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums=new int[] {1,1,4,3,12};
        s.moveZeroes(nums);
    }
}
