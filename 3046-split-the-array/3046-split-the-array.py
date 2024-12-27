class Solution:
    def isPossibleToSplit(self, nums: List[int]) -> bool:
        d={}
        for i in nums:
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        for i in nums:
            if d[i]>2:
                return False
        return True