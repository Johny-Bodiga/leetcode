class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int i=0,sum=0,m=0;
        for(i=0;i<nums.length-1;i++){
            m=Math.max(m,Math.abs(nums[i]-nums[i+1]));
        }
         m=Math.max(m,Math.abs(nums[i]-nums[0]));
         return m;
    }
}