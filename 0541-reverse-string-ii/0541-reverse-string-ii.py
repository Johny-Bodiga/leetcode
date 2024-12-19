class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        re=""
        n=len(s)
        i=0
        st=""
        while(i<n):
            if(i%(2*k)==0):
                st=s[i:(i+k)]
                re+=st[::-1]
                i+=k
            else:
                re+=s[i]
                i+=1
        return re
            
            
