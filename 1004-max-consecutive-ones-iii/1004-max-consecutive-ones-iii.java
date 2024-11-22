class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,n=nums.length,l=0,ans=0,c=0;
        for(i=0;i<n;i++){
            if(nums[i]==0)
              c++;
            while(c>k){
                if(nums[l]==0)
                c--;
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}