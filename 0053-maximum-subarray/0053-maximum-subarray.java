class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,f=0,l=0,sum=0,m=Integer.MIN_VALUE;
        while(l<n){
            sum+=nums[l];
            m=Math.max(sum,m);
                while(sum<0){
                    sum-=nums[f];
                    f++;
                }
            
            
            l++;
        }
        return m;
    }
}