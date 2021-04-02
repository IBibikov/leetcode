package leetcode136;

public class leetcode1290ConvertBinaryNumberinaLinkedListoInteger {
    public int getDecimalValue(ListNode head) {
        int res=head.val;
        while (head.next!=null){
            res=res*2+head.next.val;
            head=head.next;
        }
        return res;

    }
}
