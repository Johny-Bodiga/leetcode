class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        l=[0]*100001
        for i in nums:
            l[i]+=1
        for i in range(len(nums)-k):
            if l[nums[i]]>1:
                for j in range(i+1,k+i+1):
                    if nums[i]==nums[j]:
                        return True
        return False
