import java.util.HashMap;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class leetcode1207UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashSet <Integer> set = new HashSet();
        for(int uniq:arr){
            if(map.containsKey(uniq)){
                map.put(uniq,map.get(uniq)+1);
            }else{
                map.put(uniq,1);
            }
        }
        for(int element : map.values())
        {
            set.add(element);
        }

        if(set.size() == map.size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
