class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,n=nums.length,f=0;
        for(i=1;i<n;i++){
            if(nums[f]!=nums[i]){
                  nums[f+1]=nums[i];
                  f++;
            }
        }
        return f+1;
    }
}