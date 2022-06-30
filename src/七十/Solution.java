package 七十;

public class Solution {

//        public int climbStairs(int n) {
//            if(n==1){
//                return 1;
//            }
//            if(n==2){
//                return 2;
//            }
//            return climbStairs(n - 1) + climbStairs(n - 2);
//        }

//    public int climbStairs(int n) {
//
//        if(n==1){
//            return 1;
//        }
//        if(n==2){
//            return 2;
//        }
//
//        int[] steps = new int[n];
//
//        steps[0] = 1;
//        steps[1] = 2;
//        for (int i = 2; i < steps.length; i++) {
//            steps[i] = steps[i - 1] + steps[i - 2];
//        }
//
//        return steps[n - 1];
//
//    }

    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.climbStairs(1));
    }

}
