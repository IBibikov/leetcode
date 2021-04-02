import java.util.HashMap;

public class leetcode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }

        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}
