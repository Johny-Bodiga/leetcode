class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        d={}
        for i in range(len(mat)):
            l=0
            h=len(mat[0])-1
            mid=0
            ans=0
            while l<=h:
                mid=(l+h)//2
                if mid==len(mat[0])-1 and mat[i][mid]==1:
                    ans=len(mat[0])
                    break
                elif mat[i][mid]==1 and mat[i][mid+1]==0:
                    ans=mid+1
                    break
                elif mat[i][mid]==0:
                    h=mid-1
                else:
                    l=mid+1
                
            d[i]=ans
        d=dict(sorted(d.items(),key=lambda item:item[1]))
        
        l=[]
        for i in d.keys():
            l.append(i)
        return l[:k]
