class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        s=""
        c=0
        if(len(word1)>len(word2)):
            n=len(word2)
            c=1
        else:
            n=len(word1)
            c=2
        for i in range(n):
            s+=word1[i]+word2[i]
        if(c==1):
            s+=word1[n:]
        elif(c==2):
            s+=word2[n:]
        return s
