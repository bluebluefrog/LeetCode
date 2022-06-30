package 一一八;

import java.util.*;

public class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> yanghui = new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        l.add(1);
        yanghui.add(0,l);
        for (int i = 1; i < numRows; i++) {
            List<Integer> array = new ArrayList<>();
            array.add(0, 1);
            for (int j = 1; j < i; j++) {
                array.add(j, yanghui.get(i - 1).get(j - 1) + yanghui.get(i - 1).get(j));
            }
            array.add(i, 1);
            yanghui.add(i, array);
        }
        return yanghui;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> generate = s.generate(3);
        for (int i = 0; i < generate.size(); i++) {
            for (int j = 0; j < generate.get(i).size(); j++) {
                System.out.println(generate.get(i).get(j));
            }
        }
    }

}
