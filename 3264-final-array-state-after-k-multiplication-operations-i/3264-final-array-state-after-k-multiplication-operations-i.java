class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int m=0,i=0,j=0,ind=0;
        for(i=0;i<k;i++){
            ind=0;
            m=Integer.MAX_VALUE;
            for(j=0;j<nums.length;j++){
                if(nums[j]<m){
                    m=nums[j];
                    ind=j;
                }
            }
            nums[ind]*=multiplier;
        }
        return nums;
    }
}