class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        l=[0]*26
        c=0
        for i in text:
            l[ord(i)-97]+=1
        while l[ord('b')-97]>0 and l[ord('a')-97]>0 and l[ord('l')-97]>1 and l[ord('o')-97]>1 and l[ord('n')-97]>0:
            l[ord('b')-97]-=1
            l[ord('a')-97]-=1
            l[ord('l')-97]-=2
            l[ord('o')-97]-=2
            l[ord('n')-97]-=1
            c+=1
        return c
            