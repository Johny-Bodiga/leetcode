class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        max=-(2**31)
        ind=0
        for i in range(len(nums)):
            if nums[i]>max:
                max=nums[i]
                ind=i
        return ind