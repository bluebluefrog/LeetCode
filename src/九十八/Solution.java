package 九十八;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public boolean isValidBST(TreeNode root) {

        return dfs(root, null, null);
    }


    public boolean dfs(TreeNode root, TreeNode lower, TreeNode upper) {

        if (root == null) {
            return true;
        }

        if (lower != null) {

            if (root.val <= lower.val) {
                return false;
            }
        }
        if (upper != null) {

            if (root.val >= upper.val) {
                return false;
            }
        }

        return dfs(root.left, lower, root) && dfs(root.right, root, upper);
    }

}

