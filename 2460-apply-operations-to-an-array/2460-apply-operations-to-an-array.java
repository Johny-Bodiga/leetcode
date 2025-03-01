class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0,n=nums.length,f=0;
        for(i=0;i<n-1;i++){
            if(nums[i]==nums[i+1])
            {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        i=0;
        //System.out.println(nums[0]);
        while(i<n && f<n){
            if(nums[i]==0){
                f=i;
                while(f<n && nums[f]==0){
                    f++;
                }
                if(f<n){
                nums[i]=nums[f];
                nums[f]=0;
                }
            }

            i++;
        }
        return nums;
    }
}