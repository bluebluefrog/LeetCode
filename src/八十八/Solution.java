package 八十八;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        int[] temp = new int[m+n];

        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            temp[m + i] = nums2[i];
        }

        for (int i = 0; i < m+n; i++) {
            nums1[i]=temp[i];
        }

        Arrays.sort(nums1);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = new int[]{1, 3, 3};
        int[] arr2 = new int[]{2, 2, 5};
        solution.merge(arr1, 3, arr2, 3);

    }
}
