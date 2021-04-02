public class leetcode1047RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
        int i=0;
        char[] stack = new char[S.length()];
        for (int j=0;j<S.length();j++){
            char cur= S.charAt(i);
            if (i>0 && cur==stack[i-1]){
                i--;
            }else {
                stack[i]=cur;
                i++;
            }
        }
        return new String (stack,0,i) ;
    }
}
