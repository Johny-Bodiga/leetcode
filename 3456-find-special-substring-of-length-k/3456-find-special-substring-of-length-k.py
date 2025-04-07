class Solution:
    def hasSpecialSubstring(self, s: str, k: int) -> bool:
        n=len(s)
        c=1
        for i in range(0,n-1):
            if s[i]==s[i+1]:
                c+=1
            else:
                if c==k:
                    return True
                c=1
        return False
