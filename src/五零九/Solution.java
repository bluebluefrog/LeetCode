package 五零九;

public class Solution {

//    public int fib(int n) {
//        if (n == 1) {
//            return 1;
//        }
//
//        if (n == 0) {
//            return 0;
//        }
//
//
//        return fib(n - 1) + fib(n - 2);
//    }

//        public int fib(int n) {
//
//            if (n < 2) {
//                return n;
//            }
//
//            int[] arr = new int[n + 1];
//
//            arr[0] = 1;
//            arr[1] = 1;
//            for (int i = 2; i < arr.length; i++) {
//                arr[i] = arr[i - 1] + arr[i - 2];
//            }
//            return arr[n - 1];
//        }

    public int fib(int n) {

        if (n < 2) {
                return n;
            }

        int p = 0, q = 0, r = 1;


        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
