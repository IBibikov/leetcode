public class leetcode104MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        return getDepth(root);
    }

    private int getDepth(TreeNode root)
    {
        if(root == null) return 0;

        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
