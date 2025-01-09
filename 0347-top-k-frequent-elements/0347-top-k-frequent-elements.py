class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d={}
        l=[]
        for i in nums:
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        d= dict(sorted(d.items(), key=lambda item: item[1], reverse=True))
        for i in d.keys():
            l.append(i)
        return l[:k]
         



               

        
        
        