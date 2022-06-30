package 三九二;

public class Solution {

    public boolean isSubsequence(String s, String t) {

        int subLenth = 0;
        int j = 0;

        if(s.length()==0){
            return true;
        }


        for (int i = 0; i < t.length(); i++) {
            if (subLenth == s.length()) {
                return true;
            }
            if (s.charAt(j) == t.charAt(i)) {
                subLenth++;
                j++;
            }

        }

        if (subLenth == s.length()) {
            return true;
        }
        return false;
    }
}
