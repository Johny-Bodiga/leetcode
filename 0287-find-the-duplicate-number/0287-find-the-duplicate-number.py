class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        n=[]
        n=nums
        n.sort()
        for i in range(0,len(nums)-1):
            if nums[i]==nums[i+1]:
                return nums[i]
            