class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
int res=0;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
               res=Math.min(i,nums[i]);
                break;
            }
            else res=nums.length;
        }
     return res;   
    }
}
