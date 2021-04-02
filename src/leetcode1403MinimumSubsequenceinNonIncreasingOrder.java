import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class
leetcode1403MinimumSubsequenceinNonIncreasingOrder {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int temp=0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        for (int i=0;i<nums.length;i++){
            while(s>temp){
                s-=nums[nums.length-1-i];
                temp+=nums[nums.length-1-i];
                list.add(nums[nums.length-1-i]);
            }
        }
        return list;
    }
}
