class Solution {
    public int maxAscendingSum(int[] nums) {
        int i=1,n=nums.length,ans=nums[0],ma=Integer.MIN_VALUE,l=0,r=0;
        while(i<n){
           if(nums[i-1]<nums[i]){
             ans+=nums[i];
           }
            else{
                ma=Math.max(ma,ans);
                ans=nums[i];
            }
           i++;
        }
        ma=Math.max(ma,ans);
        return ma;
    }
}