class Solution {
    public int singleNonDuplicate(int[] nums) {
        int sum=0,i=0;
        for(i=0;i<nums.length;i++)
        sum^=nums[i];
        return sum;
    }
}