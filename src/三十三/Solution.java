package 三十三;

public class Solution {

//    题目要求 O(logN)O(logN) 的时间复杂度，基本可以断定本题是需要使用二分查找，怎么分是关键。
//    由于题目说数字了无重复，举个例子：
//    1 2 3 4 5 6 7 可以大致分为两类，
//    第一类 2 3 4 5 6 7 1 这种，也就是 nums[start] <= nums[mid]。此例子中就是 2 <= 5。
//    这种情况下，前半部分有序。因此如果 nums[start] <=target<nums[mid]，则在前半部分找，否则去后半部分找。
//    第二类 6 7 1 2 3 4 5 这种，也就是 nums[start] > nums[mid]。此例子中就是 6 > 2。
//    这种情况下，后半部分有序。因此如果 nums[mid] <target<=nums[end]，则在后半部分找，否则去前半部分找。

    public int search(int[] nums, int target) {

        if (nums.length <= 0) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            //计算mid
            int mid = l + (r - l) / 2;
            //找到返回
            if (target == nums[mid]) {
                return mid;
            }
            //第一类前半部分有序
            else if (nums[0] <= nums[mid]) {
                //查找target是不是在前半区间 需要注意nums[0] <= target维护数组第一个值 target可能是数组第一个值
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                }
                //不在前半区间
                else {
                    l = mid + 1;
                }
            } else {
                //查找target是不是在后半区间 同理维护最后一个值
                if (nums[mid] < target && target <= nums[nums.length - 1]) {
                    l = mid + 1;
                }
                //不在后半区间
                else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public int search2(int[] nums,int searchNum){

        if (nums.length <= 0) {
            return -1;
        }

        if (nums.length == 1) {
            return nums[0] == searchNum ? 0 : -1;
        }

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == searchNum) {
                return mid;
            } else if (nums[mid] < searchNum) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Solution s = new Solution();
        System.out.println(s.search2(arr, 5));

    }
}
