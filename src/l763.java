public class l763 {
    public List<Integer> partitionLabels(String S) {
        int last[] = new int[26];
        for(int i =0;i<S.length();i++){
            last[S.charAt(i) - 'a']=i;
        }
        int k=0;
        int anch=0;
        List<Integer> ans = new ArrayList();
        for(int i=0;i<S.length();i++){
            k=Math.max(k, last[S.charAt(i)-'a']);
            if (i==k){
                ans.add(i-anch +1);
                anch=i+1;
            }
        }
        return ans;
    }
}
