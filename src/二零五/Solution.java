package 二零五;

import java.util.HashMap;
import java.util.Map;

public class Solution {

//    public boolean isIsomorphic(String s, String t) {
//        if(!(s.length()==t.length())){
//            return false;
//        }
//        Map<Character,Integer> map = new HashMap();
//
//        int j = 0;
//        String newS = "";
//        for (int i = 0; i < s.length(); i++) {
//            Integer integer = map.get(s.charAt(i));
//            if (integer == null) {
//                map.put(s.charAt(i), j);
//                newS += j + ",";
//                j++;
//            } else {
//                newS += integer+ ",";
//            }
//        }
//
//
//        Map<Character,Integer> map2 = new HashMap();
//        j = 0;
//        String newT = "";
//        for (int i = 0; i < t.length(); i++) {
//            Integer integer = map2.get(t.charAt(i));
//            if (integer == null) {
//                map2.put(t.charAt(i), j);
//                newT += j + ",";
//                j++;
//            } else {
//                newT += integer+ ",";
//            }
//        }
//
//        return newS.equals(newT);
//    }

    public boolean isIsomorphic(String s, String t) {

        if(!(s.length()==t.length())){
            return false;
        }
        Map<Character,Character> map = new HashMap();
        Map<Character,Character> map2 = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char x= s.charAt(i);
            char y = t.charAt(i);
            if ((map.containsKey(x) && map.get(x) != y)||(map2.containsKey(y) && map2.get(y) != x)) {
                return false;
            }
            map.put(x, y);
            map2.put(y, x);
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isIsomorphic("abcdefghijklmnopqrstuvwxyzva"
                ,"abcdefghijklmnopqrstuvwxyzck"));


    }
}
