class Solution {
    public int[] runningSum(int[] nums) {
        int i=0,s=0,arr[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            s+=nums[i];
            arr[i]=s;
        }
        return arr;
    }
}