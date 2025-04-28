class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        low=1
        high=max(nums)
        mid=0
        while low<=high:
            mid=(low+high)//2
            ans=0
            for i in nums:
                ans+=ceil(i/mid)
            if ans<=threshold:
                high=mid-1
            else:
                low=mid+1
        return low
                
