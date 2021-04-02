import java.util.Collections;
import java.util.LinkedList;

public class leetcode589TreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output_arr= new LinkedList<>();
        if (root==null){
            return output_arr;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            Node node =stack.pollLast();
            output_arr.add(node.val);
            Collections.reserve(node.children);
            for (Node child:node.children){
                stack.add(child);
            }
        }
        return output_arr;
    }
}
