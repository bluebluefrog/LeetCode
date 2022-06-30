package 二十七;

public class Solution {
    public int removeElement(int[] nums, int val) {

        int j = 0;
        int i = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }


    public static void main(String[] args) {

        Solution s = new Solution();
        int[] array=new int[]{3,2,2,3};

        s.removeElement(array, 3);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}