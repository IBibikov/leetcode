import java.util.Arrays;

public class leetcode1051HeighChecker {
    public int heightChecker(int[] heights) {
        int a[] = new int [heights.length];
        for (int i=0;i<heights.length;i++){
            a[i]=heights[i];
        }
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if (a[i]!=heights[i]){
                count++;
            }
        }
        return count; }
}
