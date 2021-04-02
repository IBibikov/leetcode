import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode1002FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        List<String> common = new ArrayList();
        int min[]= new int[26];
        Arrays.fill(min,Integer.MAX_VALUE);
        for(String current :A){
            int[] char_frek=new int[26];

            for(char c: current.toCharArray()){
                char_frek[c-'a']++;
            }
            for(int i=0;i<26;i++){
                min[i]=Math.min(min[i], char_frek[i]);
            }
        }
        for(int i=0;i<26;i++){
            while(min[i]>0){
                common.add(""+(char)(i+'a'));
                min[i]--;
            }
        }

        return common;
    }
}
