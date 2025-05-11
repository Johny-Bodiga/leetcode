class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        d={}
        c=0
        for i in range(len(nums)):
            if nums[i] not in d:
                d[nums[i]]=1
            else:
                d[nums[i]]+=1
            if i>k:
                d[nums[c]]-=1
                c+=1
            if d[nums[i]]>=2:
                return True
            #print(d)
        return False
                

