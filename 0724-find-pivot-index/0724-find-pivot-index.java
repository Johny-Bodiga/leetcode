class Solution {
    public int pivotIndex(int[] nums) {
        int i=0,s=0,n=nums.length,re=0,fi=0,temp=0,pi=-1;
        for(i=0;i<n;i++){
            s+=nums[i];
        }
        if(s-nums[0]==0)
        return 0;
        
             
        for(i=0;i<n-1;i++){
            re+=nums[i];
            temp=nums[i+1];
            fi=s-temp-re;
            if(re-fi==0){
                return i+1;
            }
            
        }
        return pi;
    }
}