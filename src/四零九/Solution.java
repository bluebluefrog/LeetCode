package 四零九;

import java.util.HashMap;
import java.util.Map;

public class Solution {

//    public int longestPalindrome(String s) {
//
//        Map<Character,Integer> map = new HashMap();
//
//        for (int i = 0; i < s.length(); i++) {
//            Integer count = map.get(s.charAt(i));
//            if (count == null) {
//                map.put(s.charAt(i), 1);
//            }else{
//                map.put(s.charAt(i), ++count);
//            }
//        }
//
//        int hightSingle=0;
//        int totalDouble = 0;
//
//
//        for (Character key : map.keySet()) {
//            Integer count = map.get(key);
//            if(count % 2 != 0){
//                count -= 1;
//                hightSingle=1;
//            }
//            totalDouble += count;
//        }
//        return hightSingle + totalDouble;
//    }

    public int longestPalindrome(String s) {

        int[] count = new int[128];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        int ans = 0;

            for (int v: count) {
                ans += v / 2 * 2;
                if (v % 2 == 1 && ans % 2 == 0) {
                    ans++;
                }
            }

        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }
}
