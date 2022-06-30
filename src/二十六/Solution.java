package 二十六;

public class Solution {

//    public int removeDuplicates(int[] nums) {
//
//        int[] temp = new int[nums.length];
//
//        int cur = Integer.MAX_VALUE - 1;
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != cur) {
//                temp[j] = nums[i];
//                 cur = nums[i];
//                j++;
//            }
//        }
//
//        for (int i = 0; i < temp.length; i++) {
//            nums[i] = temp[i];
//            System.out.println(nums[i]);
//        }
//        return j;
//    }

    public int removeDuplicates(int[] nums) {

        int p = 0;
        for (int q = 1; q < nums.length; q++) {
            if (nums[p] != nums[q]) {
                nums[p + 1] = nums[q];
                p++;
            }
        }

        return p + 1;
    }

//    public int removeDuplicates(int[] nums) {
//
//        Set temp = new HashSet();
//
//
//        for(int i=0;i<nums.length;i++){
//            temp.add(nums[i]);
//        }
//
//        Iterator iterator = temp.iterator();
//
//        int i = 0;
//        while (iterator.hasNext()) {
//            nums[i] = (int) iterator.next();
//            i++;
//        }
//
//        return nums.length;
//    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nus = new int[]{1, 1, 2};
        int length = solution.removeDuplicates(nus);
        System.out.println(length);
    }
}
