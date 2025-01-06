class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int f=0,l=0,n=nums.length,m=nums.length,sum=0,c=0;
      while(l<n){
        sum+=nums[l];

        if(sum>=target){
            c=1;
        m=Math.min(m,l-f+1);
        }
        
        
        while(sum>target){
            sum-=nums[f];
            f++;
            if(sum>=target){
            c=1;
        m=Math.min(m,l-f+1);
        }
            
        }
        if(sum>=target){
            c=1;
        m=Math.min(m,l-f+1);
        }
        l++;
      }
      if(c==1)
      return m;
      else
      return 0;
    }
}