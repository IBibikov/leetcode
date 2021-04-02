import java.util.TreeMap;

public class leetcode1122RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for(int i: arr1) {
            if(treeMap.containsKey(i)) {
                treeMap.put(i, treeMap.get(i) + 1);
            } else {
                treeMap.put(i, 1);
            }
        }

        int i = 0;
        for(int k: arr2) {
            if(treeMap.containsKey(k)) {
                for(int j = 0; j < treeMap.get(k); j++) {
                    arr1[i++] = k;
                }
                treeMap.put(k, -1);
            }
        }

        for(int k: treeMap.keySet()) {
            if(treeMap.get(k) != -1) {
                for(int j = 0; j < treeMap.get(k); j++) {
                    arr1[i++] = k;
                }
            }
        }

        return arr1;
    }
}
