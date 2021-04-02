public class l317 {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        HashMap<Integer,Integer> map = new HashMap();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Queue<Integer> heap = new PriorityQueue<>((n1,n2)-> map.get(n1)-map.get(n2));
        for(int i:map.keySet()){
            heap.add(i);
            if(heap.size()>k) heap.poll();
        }
        int[] res = new int [k];
        for(int i =k-1;i>=0;--i){
            res[i] =heap.poll();

        }
        return res;


    }
}
