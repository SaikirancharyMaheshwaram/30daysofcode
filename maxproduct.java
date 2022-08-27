class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int i=nums.length-1;
        int ans=nums[i]*nums[i-1]*nums[i-2];
        ans=Math.max(ans,(nums[0]*nums[1]*nums[i]));
        
     return ans;   
    }
}
