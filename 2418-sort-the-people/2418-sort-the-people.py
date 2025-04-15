class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        d=dict()
        l=[]
        for i in range(len(heights)):
            d[i]=heights[i]
        d=sorted(d.items(), key=lambda x:x[1])
        d=d[::-1]
        d=dict(d)
        for i in d.keys():
            l.append(names[i])
        return l
