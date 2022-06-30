package 二三五;

public class Solution {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

//    int pFind = 0;
//    int qFind = 0;
//TreeNode parent = null;
//    int level = 0;
//    int bothUp = 0;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode parent = root;

        while (true){

            if (parent.val > p.val && parent.val > q.val) {
                parent = parent.left;
            } else if (parent.val < p.val && parent.val < q.val) {
                parent = parent.right;
            } else {
                break;
            }
        }
        return parent;
    }

//    public void lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
//
//        level++;
//        if (root == p) {
//            pFind = level;
//            if (qFind != 0) {
//                return;
//            }
//        }
//
//        if (root == q) {
//            qFind = level;
//            if (pFind != 0) {
//                return;
//            }
//        }
//
//        if (root == null) {
//            return;
//        }
//
//        lowestCommonAncestor1(root.left, p, q);
//        level--;
//        lowestCommonAncestor1(root.right, p, q);
//        level--;
//
//        if (pFind != 0 && qFind != 0) {
//            if (pFind < qFind) {
//                parent = p;
//                pFind = 0;
//                qFind = 0;
//                return;
//            }
//            else if (qFind < pFind) {
//                parent = q;
//                pFind = 0;
//                qFind = 0;
//                return;
//            }
//            else{
//                bothUp = 1;
//            }
//
//        }
//        else if (bothUp == 1) {
//            parent = root;
//        }
//    }

//    public void lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
//
//
//        if (root == p) {
//            pFind = level;
//            if (qFind == 1) {
//                return;
//            }
//        }
//
//        if (root == q) {
//            qFind = level;
//            if (pFind == 1) {
//                return;
//            }
//        }
//
//        if (root == null) {
//            return;
//        }
//
//        System.out.println(level);
//
//        lowestCommonAncestor1(root.left, p, q);
//
//        lowestCommonAncestor1(root.right, p, q);
//
//
//        if (pFind == 2 && qFind == 2) {
//                parent = root;
//                pFind = 0;
//                qFind = 0;
//                return;
//        }
//    }
}
