public class l169MajorityElement {
    public int majorityElement(int[] nums) {
        int count=nums.length/2;
        for (int num:nums){
            int c=0;
            for (int elem:nums){
                if (elem==num){
                    c++;
                }
            }
            if(c>count){
                return num;
            }
        }
        return -1;
    }

}
