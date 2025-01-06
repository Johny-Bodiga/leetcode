class Solution {
    public int majorityElement(int[] nums) {
        int c=1,i=1,n=nums[0],n1=nums.length/2;
        while(i<nums.length){
            if(n==nums[i])
            c++;
            else
            c--;
            System.out.println(c);
            if(c==0){
                c=0;
                n=nums[i+1];
                System.out.println(n);
            }
            else if(c>n1)
            return n;
        i++;
        }
        return n;
    }
}