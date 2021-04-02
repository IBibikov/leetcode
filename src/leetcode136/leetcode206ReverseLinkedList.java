package leetcode136;

public class leetcode206ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev= null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}
