public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
       
        int a=0,b=0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != null){
            a++;
            temp1 = temp1.next;
        }
         while(temp2 != null){
            b++;
            temp2 = temp2.next;
        }
        
        int diff = Math.abs(a-b);
        
     
        temp1=headA;
        temp2=headB;
        
        if(a > b) {
            while(diff-- > 0)
                temp1 = temp1.next;
        }
        else {
            while(diff-- > 0)
                temp2 = temp2.next;
        }
        
        
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1 == null || temp2 == null)
                return null;
        }
        return temp1;
    }
}
