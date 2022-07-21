package 一零四;

public class Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int maxDepth = Integer.MIN_VALUE;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root,0);
        return maxDepth;
    }

    public void dfs(TreeNode root,int depth) {
        if (root == null) {
            if (maxDepth < depth) {
                maxDepth = depth;
            }
            return;
        }
        depth++;
        dfs(root.left, depth);
        dfs(root.right, depth);

    }
}
