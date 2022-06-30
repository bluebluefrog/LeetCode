package 十四;

public class Solution {


    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int minLength=Integer.MAX_VALUE;

        if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
                prefix = strs[i];
            }
        }

        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].equals(prefix)) {
              while (!strs[i].equals(prefix)){
                  if (strs[i].equals("")|| prefix.equals("")) {
                      return "";
                  }
                  else if (strs[i].length() == prefix.length()) {
                      prefix = prefix.substring(0, prefix.length() - 1);
                      strs[i] = strs[i].substring(0, strs[i].length() - 1);
                  }else {
                      strs[i] = strs[i].substring(0, strs[i].length() - 1);
                  }
              }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        String[] arr=new String[]{"a","ac"};
        System.out.println(s.longestCommonPrefix(arr));
    }
}
