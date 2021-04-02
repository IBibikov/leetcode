public class leetcode509FibonacciNumber {
    public int fib(int N) {
        if (N<=1){
            return N ;
        }
        if (N==2){
            return 1;
        }
        int cur=0;
        int prev=1;
        int next=1;
        for(int i=3;i<=N;i++){
            cur=prev+next;
            next=prev;
            prev=cur;
        }
        return cur;
    }
}
