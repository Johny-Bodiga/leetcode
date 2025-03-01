class Solution {
    public int maxProduct(int[] nums) {
        int pre=1,suf=1,i=0,n=nums.length,m1=nums[0],m2=nums[n-1];
        for(i=0;i<n;i++){
            pre*=nums[i];
            suf*=nums[n-i-1];
            m1=Math.max(m1,pre);
            m2=Math.max(m2,suf);
            if(pre==0)
            pre=1;
            if(suf==0)
            suf=1;
        }
        return Math.max(m1,m2);

    }
}