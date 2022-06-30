package 六十六;

public class Solution {

    public int[] plusOne(int[] digits) {
//        StringBuilder numString=new StringBuilder();
//        for (int i = 0; i < digits.length; i++) {
//            numString.append(digits[i]);
//        }
//        Float num=Float.parseFloat(numString.toString());
//        num++;
//        String s = Float.toString(num);
//        int[] result = new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            result[i] = Character.getNumericValue(s.charAt(i));
//        }

        int i = digits.length - 1;
        while (i >= 0) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            } else if (digits[i] + 1 == 10) {
                digits[i] = 0;
            }
            i--;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = new int[]{0};
        int[] ints = s.plusOne(result);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
