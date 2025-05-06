class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        l=[0]*101
        c=0
        for i in nums:
            l[i]+=1
        for i in l:
            if i>1:
                c+=(i-1)*(i)//2
        return c

