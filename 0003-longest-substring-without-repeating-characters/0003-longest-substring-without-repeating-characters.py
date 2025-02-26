class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        d={}
        c=0
        m=0
        ind=0
        #print(len(s))
        for i in range(len(s)):
            if s[i] not in d:
                d[s[i]]=i
                c+=1
            else:
                m=max(m,c)
                while( s[i] in d and ind<=d[s[i]] and len(d)>0 and  s[ind] in d):
                    d.pop(s[ind])
                    ind+=1
                d[s[i]]=i
                c=len(d)
                m=max(m,c)
                #print(d,ind)
                
                
        m=max(m,c)
        return m