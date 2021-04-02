public class l938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int res =0;

        Stack<TreeNode> s= new Stack();

        s.push(root);

        while (!s.isEmpty()){
            TreeNode node=s.pop();
            if (node!=null){
                if (node.val>=low && node.val<=high){
                    res+=node.val;
                }
                if (node.val>low && node.left !=null){
                    s.push(node.left);
                }
                if (node.val<high && node.right !=null){
                    s.push(node.right);
                }
            }
        }
        return res;
    }
}
