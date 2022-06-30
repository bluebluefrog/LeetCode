package 三十四;

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int first = searchFirst2(nums,target);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = searchLast2(nums,target);

        return new int[]{first, last};

    }

    private int searchLast(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid] != nums[mid + 1]) {
                    return mid;
                }
                l = mid + 1;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    private int searchFirst(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid] != nums[mid - 1]) {
                    return mid;
                }
                r = mid - 1;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    private int searchLast2(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = ((l + r) + 1) / 2;
            if (nums[mid] == target) {
                l = mid;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (nums[r] == target) {
            return r;
        }
        return -1;
    }

    private int searchFirst2(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                r = mid;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (nums[l] == target) {
            return l;
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = new int[]{5,7,7,8,8,10};
        Solution s = new Solution();
        int[] ints = s.searchRange(arr, 8);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}

