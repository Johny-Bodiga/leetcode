class Solution:
    def countLargestGroup(self, n: int) -> int:
        l=[0]*37
        for i in range(1,n+1):
            c=0
            num=i
            while num>0:
                c+=num%10
                num//=10
            l[c]+=1
        m=max(l)
        ans=0
        for i in l:
            if i==m:
                ans+=1
        return ans

