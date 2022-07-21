package 一零一;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<Integer,String> map = new HashMap();
    boolean result = true;
    public boolean isSymmetric(TreeNode root) {
        dfsLeft(root.left,"left");
        dfsRight(root.right,"right");
        return result == true ? map.size() == 0 : result;
    }

    public void dfsLeft(TreeNode root,String leftRight){
        if (root == null) {
            return;
        }
        map.put(root.val, leftRight);
        dfsLeft(root.left,"left");
        dfsLeft(root.right,"right");
    }

    public void dfsRight(TreeNode root,String leftRight){
        if (root == null) {
            return;
        }

        String test = map.remove(root.val);
        if (test == null || test == leftRight) {
            result = false;
            return;
        }
        dfsRight(root.left,"left");
        dfsRight(root.right,"right");

    }
}
