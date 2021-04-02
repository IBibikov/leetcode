public class leetcode821ShortestDistancetoaCharacter {
    public int[] shortestToChar(String S, char C) {
        int n=S.length();
        int res[]=new int [n];
        int c_pos=-n;
        for (int i=0;i<n;i++){
            if (S.charAt(i)==C){
                c_pos=i;
            }
            res[i]=i-c_pos;
        }
        for (int i=n-1;i>=0;i--){
            if (S.charAt(i)==C){
                c_pos=i;
            }
            res[i]=Math.min(res[i],Math.abs(i-c_pos));
        }
        return res;

    }
}
