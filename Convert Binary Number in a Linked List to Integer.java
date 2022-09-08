class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode left=head;
        int sum=0;
        ArrayList<Integer> arr =new ArrayList<Integer>();
        while(left!=null){
            arr.add(left.val);
            left=left.next;
                }
        int s=arr.size();
        int j=s-1;
        for(int i=0;i<s;i++){
            sum=sum+(int)(arr.get(i)*Math.pow(2,j));
            j--;
            }
        return sum; 
    }
}
