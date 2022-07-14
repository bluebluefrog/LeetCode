package 二十;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                Character pop;
                try {
                     pop= stack.pop();
                }catch (Exception e){
                    return false;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(pop);
                stringBuffer.append(s.charAt(i));
                String str = stringBuffer.toString();
                if (!str.equals("()") && !str.equals("[]") && !str.equals("{}")) {
                    return false;
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isValid("]"));
    }
}
