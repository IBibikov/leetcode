import java.util.LinkedList;
import java.util.Queue;

public class leetcode559MaximumDepthofNTree {
    public int maxDepth(Node root) {
        if (root==null){
            return 0;
        }
        int depth=0;
        Queue<Node> queue= new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            for (int i=0;i<size;i++){
                Node cur=queue.poll();
                for(Node child :cur.children){
                    queue.offer(child);
                }
            }
            depth++;
        }
        return depth;
    }
}
