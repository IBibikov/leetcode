import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leetcode1636SortArraybyIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>
                (new Comparator<Map.Entry<Integer, Integer>>() {
                    public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                        return e1.getValue() != e2.getValue() ? e1.getValue()-e2.getValue() : e2.getKey()-e1.getKey();
                    }
                });
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            pq.offer(e);
        }
        int[] arr = new int[nums.length];
        int j = 0;
        while (!pq.isEmpty()) {
            Map.Entry<Integer, Integer> e = pq.poll();
            for (int i = 0; i < e.getValue(); i++) {
                arr[j++] = e.getKey();
            }
        }
        return arr;

    }
}
