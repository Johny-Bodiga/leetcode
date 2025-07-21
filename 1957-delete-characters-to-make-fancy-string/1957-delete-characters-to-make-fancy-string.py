class Solution:
    def makeFancyString(self, s: str) -> str:
        ans=""
        c=0
        f=0
        l=1
        if len(s)==1:
            return s
        while (f<len(s) and l<len(s)):
            if s[f]==s[l]:
                c+=1 
            elif s[f]!=s[l]:
                if c>=1:
                    ans+=s[f]*2
                else:
                    ans+=s[f]
                c=0
                f=l
            l+=1 
        if c>=1:
            ans+=s[len(s)-1]*2 
        elif s[len(s)-2]!=s[len(s)-1]:
            ans+=s[len(s)-1]
         
            
            
       
        return ans
                
