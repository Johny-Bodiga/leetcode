class Solution:
    def reverseVowels(self, s: str) -> str:
        v=['a','e','i','o','u','A','E','I','O','U']
        v1=[]
        l=[]
        for i in s:
            l.append(i)
            if i in v:
                v1.append(i)
        v1.reverse()
        j=0
        for i in range(0,len(l)):
            if l[i] in v:
                l[i]=v1[j]
                j+=1
        res=""
        for i in l:
            res+=i
        return res
        