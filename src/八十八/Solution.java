package 八十八;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        int[] temp = new int[m + n];

        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            temp[m + i] = nums2[i];
        }

        Arrays.sort(temp);

        nums1 = temp;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = new int[]{1, 3, 3};
        int[] arr2 = new int[]{2, 2, 5};
        solution.merge(arr1, 3, arr2, 3);

    }
}
