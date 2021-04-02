public class l1422 {
    public int maxScore(String s) {
        int zero=0,one=0,res=0;
        for(char c :s.toCharArray() ){
            if (c=='1')one ++;

        }
        for (int i=0;i<s.length()-1;i++){
            if (s.charAt(i)=='1') one--;
            else zero++;
            res=Math.max(res,one+zero);
        }
        return res;

    }
}
