class Solution {
    public int maxAscendingSum(int[] nums) {
        int i=0,sum=nums[0],m=Integer.MIN_VALUE;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                sum+=nums[i+1];
            }
            else{
                m=Math.max(sum,m);
                sum=nums[i+1];
            }
        }
        m=Math.max(sum,m);
        return m;
    }
}