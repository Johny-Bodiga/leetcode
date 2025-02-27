class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        d={}
        for i in words:
            if i not in d:
                d[i]=1
            else:
                d[i]+=1
        d=dict(sorted(d.items()))
        d=dict(sorted(d.items(), key=lambda item: item[1], reverse=True))
        re=[]
        print(d)
        #re.append()
        d=dict(list(d.items())[:k])
        for i in d.keys():
            re.append(i)
        return re
        