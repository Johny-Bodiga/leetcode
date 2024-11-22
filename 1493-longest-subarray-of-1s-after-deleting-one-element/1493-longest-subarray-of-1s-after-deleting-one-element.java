class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,n=nums.length,l=0,ans=0,c=0;
        for(i=0;i<n;i++){
            if(nums[i]!=1)
             c++;
            while(c>1){
               if(nums[l]==0)
                 c--;
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans-1;
    }
}