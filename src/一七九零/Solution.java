package 一七九零;

import java.util.ArrayList;

public class Solution {

//        public boolean areAlmostEqual(String s1, String s2) {

//                if (s1.equals(s2)) {
//                        return true;
//                }
//
//                for (int i = 0; i < s1.length(); i++) {
//                        if(s1.charAt(i) == s2.charAt(i)){
//                                continue;
//                        }else{
//                                String ns2 = "";
//                                int l = 0;
//                                while (!ns2.equals(s1)) {
//                                        int subIndex = s1.indexOf(s2.charAt(i), l);
//                                        if (subIndex <= 0) {
//                                                return false;
//                                        }
//                                        char[] chars = s2.toCharArray();
//                                        char aChar = chars[subIndex];
//                                        chars[subIndex] = chars[i];
//                                        chars[i] = aChar;
//                                        ns2 = String.valueOf(chars);
//                                        if (l >= ns2.length()) {
//                                                return false;
//                                        }
//                                        l++;
//                                }
//                                return true;
//                        }
//                }
//
//                return true;
//        }

        public boolean areAlmostEqual(String s1, String s2) {

                ArrayList<Integer> diff = new ArrayList<>();

                for (int i = 0; i < s1.length(); i++) {

                        if (s1.charAt(i) != s2.charAt(i)) {
                                if (diff.size() >= 2) {
                                        return false;
                                }
                                diff.add(i);
                        }
                }

                if (diff.isEmpty()) {
                        return true;
                }
                if (diff.size() != 2) {
                        return false;
                }

                return s1.charAt(diff.get(0)) == s2.charAt(diff.get(1)) && s1.charAt(diff.get(1)) == s2.charAt(diff.get(0));
        }

        public static void main(String[] args) {
                Solution solution = new Solution();
                boolean b = solution.areAlmostEqual("attack", "atatck");
                System.out.println(b);
        }

}

