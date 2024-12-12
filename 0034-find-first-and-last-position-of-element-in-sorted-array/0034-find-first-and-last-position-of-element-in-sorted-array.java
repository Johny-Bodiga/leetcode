class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0,c=0,f=-1,l=-1;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target && c==0)
               {
                f=i;
                c=1;
               }
            if(nums[i]==target)
            l=i;
        }
        int arr[]=new int[2];
        arr[0]=f;
        arr[1]=l;
        return arr;
    }
}