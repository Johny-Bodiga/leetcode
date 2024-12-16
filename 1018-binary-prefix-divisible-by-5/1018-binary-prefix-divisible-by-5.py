class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        l=[]
        ans=0
        c=0
        s=0
        for i in range(len(nums)-1,-1,-1):
            s|=(nums[i]<<c)
            c+=1
        for i in range(len(nums)):
            if s%5==0:
                l.append(True)
            else:
                l.append(False)
            s=s>>1
        return l[::-1]
        