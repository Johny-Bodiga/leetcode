class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        a=arr
        a=set(a)
        l=[]
        for i in a:
            l.append(arr.count(i))
        if(len(l)==len(set(l))):
            return True
        else:
            return False
