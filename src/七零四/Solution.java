package 七零四;

import javax.xml.bind.annotation.XmlID;
import java.rmi.dgc.VMID;

public class Solution {

    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;


        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            else if (nums[mid] > target) {
                r = mid - 1;

            }
           else{
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println(s.search(arr, 9));
    }
}
