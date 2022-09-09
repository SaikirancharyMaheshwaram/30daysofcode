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
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode left = head;
         while(left != null) {
        	 if (left.next == null) break;
        	 
        	 if (left.val == left.next.val) {
        		 left.next = left.next.next;
        	 } 
             
             else {
        		 left = left.next;
        	 }
         }
         
         return head;
    }
}
