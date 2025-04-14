class Solution {
    public int minOperations(int[] nums, int k) {
        int i=0,n=nums.length,sum=0;
        for(i=0;i<n;i++){
            sum+=nums[i];
        }
       
        return sum%k;
    }
}