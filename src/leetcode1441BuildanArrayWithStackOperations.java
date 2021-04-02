import java.util.ArrayList;
import java.util.List;

public class leetcode1441BuildanArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int c =1;
        for (int i=0;i<target.length;i++){
            while (target[i]>c){
                list.add("Push");
                list.add("Pop");
                c++;
            }
            list.add("Push");
            c++;
        }
        return list; }
}
