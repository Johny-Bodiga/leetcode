class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        d={}
        for i in arr:
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        for i in arr:
            if (i*2 in d and i!=0) or (i==0 and d[0]>1):
                return True
        return False