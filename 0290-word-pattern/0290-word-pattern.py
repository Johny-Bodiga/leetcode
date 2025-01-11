class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        l=[]
        l=list(s.split(" "))
        if len(pattern)!=len(l):
            return False
        else:
            d={}
            d1={}
            st=""
            st1=""
            for i in range(len(l)):
                d[pattern[i]]=l[i]
                d1[l[i]]=pattern[i]
            for i in range(len(l)):
                st+=d[pattern[i]]
                st1+=d1[l[i]]
                if(i!=len(l)-1):
                    st+=" "
            if(st==s and st1==pattern):
                return True
            else:
                return False

