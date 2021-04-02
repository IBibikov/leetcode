public class l160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null && headB==null) return null;
        ListNode Apoint= headA;
        ListNode Bpoint= headB;
        while (Apoint != Bpoint){
            if (Apoint ==null){
                Apoint=headB;
            }else Apoint=Apoint.next;
            if (Bpoint ==null){
                Bpoint=headA;
            }else Bpoint=Bpoint.next;
        }
        return Apoint;
    }
}
