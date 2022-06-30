package 九;

public class Solution {

//    public boolean isPalindrome(int x) {
//        System.out.println(x);
//        Integer integer = new Integer(x);
//
//
//
//        int l = 0;
//        int r = integer.toString().length() - 1;
//        while (l <= r) {
//            if (integer.toString().charAt(l)!=integer.toString().charAt(r)) {
//                return false;
//            }
//            l++;
//            r--;
//        }
//        return true;
//    }


        public boolean isPalindrome(int x) {
            System.out.println(x);
            if(x < 0)
                return false;
            int cur = 0;
            int num = x;
            while(num != 0) {
                cur = cur * 10 + num % 10;
                num /= 10;
            }
            return cur == x;
        }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome(1221));
    }
}
