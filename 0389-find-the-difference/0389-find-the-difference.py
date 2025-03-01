class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        for i in range(len(s)):
            if s[i] in t:
                t=t.replace(s[i],'',1)
        return t
        
        
            