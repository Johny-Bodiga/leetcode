class Solution:
    def arrangeCoins(self, n: int) -> int:
        f=1
        l=n
        while f<=l:
            mid=(f+l)//2 
            ans=(mid*(mid+1))//2 
            ans1=((mid-1)*(mid))//2
            if ans1<=n and ans>n:
                return mid-1
            elif ans==n:
                return mid
            elif ans>n:
                l=mid-1
            else:
                f=mid+1 
        return mid
        