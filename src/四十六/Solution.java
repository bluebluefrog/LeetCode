package 四十六;

import java.util.*;

public class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, new ArrayList<>(), new boolean[nums.length]);
        return result;
   }

    public void dfs(int[] nums,List<Integer> path,boolean[] isVisited) {

        if (nums.length == path.size()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(!isVisited[i]){
                isVisited[i] = true;
                path.add(nums[i]);
                dfs(nums, path, isVisited);
                isVisited[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

//    public List<List<Integer>> permute(int[] nums) {
//        dfs(nums, new ArrayList<>());
//        return result;
//    }
//
//    public void dfs(int[] nums,List<Integer> path) {
//
//        if (nums.length == 0) {
//            result.add(new ArrayList<>(path));
//            return;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            path.add(nums[i]);
//            int[] withOutTarget = listWithoutTarget(nums, nums[i]);
//            dfs(withOutTarget,path);
//            path.remove(path.size() - 1);
//        }
//
//    }
//
//    public int[] listWithoutTarget(int[] nums,int target){
//        int targetIndex = Integer.MIN_VALUE;
//        int[] newArray = new int[nums.length-1];
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==target){
//                targetIndex = i;
//            }
//        }
//        if (targetIndex==Integer.MIN_VALUE){
//            return nums;
//        }
//
//        for (int i = targetIndex; i < nums.length - 1; i++) {
//            nums[i] = nums[i + 1];
//        }
//
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = nums[i];
//        }
//        return newArray;
//    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = new int[]{1,2, 3};
//        int[] ints = s.listWithoutTarget(array, 3);
//
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }
        System.out.println(s.permute(array));
    }
}
