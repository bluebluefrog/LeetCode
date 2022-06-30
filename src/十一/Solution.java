package 十一;

public class Solution {

    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;

//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                if (height[i] >= height[j]) {
//                    max = height[j] * (j - i) > max ? height[j] * (j - i) : max;
//                }
//                else if (height[i] <= height[j]) {
//                    max = height[i] * (j - i) > max ? height[i] * (j - i) : max;
//                }
//            }
//        }
        int r = 0;
        int l = height.length-1;
        int area=Integer.MIN_VALUE;
        while (r < l) {
            area = Integer.min(height[r], height[l]) * (l - r);
            max=Integer.max(area,max);
            if (height[r] >= height[l]) {
                l--;
            } else {
                r++;
            }
        }
        return max;

    }
}
