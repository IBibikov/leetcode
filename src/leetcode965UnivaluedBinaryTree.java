public class leetcode965UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        boolean leftCh = root.left==null ||root.left.val==root.val && isUnivalTree(root.left);
        boolean rigthCh = root.right==null || root.right.val == root.val && isUnivalTree(root.right);
        return leftCh && rigthCh;
    }
}
