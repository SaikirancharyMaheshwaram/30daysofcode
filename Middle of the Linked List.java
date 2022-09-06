class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode mid=head;
        ListNode last=head;
        while(last!=null && last.next!=null) //loop stops if either last node is null or the node next to last node null
        { 
            mid=mid.next;// it will move one node at a time
            last=last.next.next; //it move 2 nodes at a time and at the end of list the mid will be at middle
        }
    
        return mid;
    }
    
}
