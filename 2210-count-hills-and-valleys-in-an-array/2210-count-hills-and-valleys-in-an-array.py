class Solution:
    def countHillValley(self, nums: List[int]) -> int:
        ans=0
        
        n=len(nums)
        for i in range(len(nums)):
            f=i-1 
            l=i+1 
            flag1=-1
            flag2=-1
            while(f>=0):
                if(nums[f]!=nums[i]):
                    flag1=nums[f]
                    break
                f-=1 
            while l<n:
                if(nums[l]!=nums[i]):
                    flag2=nums[l]
                    break
                l+=1 
            if(((flag1>nums[i] and flag2>nums[i]) or (flag1<nums[i] and flag2<nums[i])) and
            (flag1!=-1 and flag2!=-1) and (i!=0 and nums[i-1]!=nums[i])):
                    ans+=1 
                    print(i)
        return ans

        