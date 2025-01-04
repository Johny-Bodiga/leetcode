class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0,i=0,j=0;
        double m=0;
        while(i<k){
        s+=nums[i];
        i++;
        }
        m=(double)s/k;
        for(i=0;i<nums.length-k;i++){
            s+=nums[k+i]-nums[i];
           
            if((double)s/k>m)
            m=(double)s/k;
        }
        return m;
    }
}             