public class l1529 {
    public int minFlips(String target) {
        char prev ='0';
        int res=0;
        for(char c : target.toCharArray()){
            if (prev!=c){
                prev=c;
                res++;
            }
        }
        return res;
    }
}
