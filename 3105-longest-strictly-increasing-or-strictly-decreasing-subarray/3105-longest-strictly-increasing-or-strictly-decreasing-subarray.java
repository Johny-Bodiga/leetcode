class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int i=0,m=0,c=1,c1=1,m1=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
            c+=1;
            else
            {
                m=Math.max(m,c);
                c=1;
            }
            if(nums[i]>nums[i+1])
            c1+=1;
            else
            {
                m1=Math.max(m1,c1);
                c1=1;
            }
        }
        m=Math.max(m,c);
        m1=Math.max(m1,c1);
        return Math.max(m,m1);
    }
}