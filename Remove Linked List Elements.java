/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode start=new ListNode();
        start.next = head;
        ListNode left=start;
        while(left.next!=null ){
            if(left.next==null) return null;
            else{
                if(left.next.val==val){
                    left.next=left.next.next;
                }
                else left=left.next;
            }
  
    }
        return start.next;
}
}
