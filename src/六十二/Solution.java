package 六十二;

public class Solution {

//    public int uniquePaths(int m, int n) {
//
//        if (m == 1) {
//
//            return 1;
//        }
//        if (n == 1) {
//
//            return 1;
//        }
//
//        int num1=uniquePaths(m-1,n);
//        int num2=uniquePaths(m,n-1);
//        return num1 + num2;
//    }

    public int uniquePaths(int m, int n) {

        int arr[][] = new int[m + 1][n + 1];

        //初始
        //1 1 1
        //1 2 3
        //1 3 6
        for (int i = 0; i < m; i++) {
            arr[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            arr[0][j] = 1;
        }
//
// 初始
// arr[0][1]=1;
// 0 1 0 0
// 0 1 2 3
// 0 1 3 6

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                int num= arr[i - 1][j] + arr[i][j - 1];
                arr[i][j] = num;
            }
        }
        return arr[m - 1][n - 1];
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.uniquePaths(3,3));
    }
}


