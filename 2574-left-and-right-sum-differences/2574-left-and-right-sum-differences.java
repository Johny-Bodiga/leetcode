class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length,i=0,arr[]=new int[n],s=0,f=0;
        for(i=0;i<n;i++)
        s+=nums[i];
        for(i=0;i<n;i++){
            
            arr[i]=Math.abs(s-(2*f)-nums[i]);
            f+=nums[i];
        }
        return arr;
    }
}