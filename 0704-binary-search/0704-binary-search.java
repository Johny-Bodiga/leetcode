class Solution {
    public int search(int[] nums, int target) {
        int mid=0,low=0,high=nums.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target)
            high=mid-1;
            else
            low=mid+1;
        }
        return -1;
    }
}