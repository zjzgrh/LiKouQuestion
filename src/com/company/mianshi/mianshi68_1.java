package com.company.mianshi;

public class mianshi68_1 {
    public static void main(String[] args) {

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        else if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left,p,q);
        else
            return root;
    }
}
