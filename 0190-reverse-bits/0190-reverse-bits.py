class Solution:
    def reverseBits(self, n: int) -> int:
        c=31
        ans=0
        while n>0:
            ans|=(n%2)<<c
            c-=1
            n=n>>1
        return ans