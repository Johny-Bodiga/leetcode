class Solution:
    def isHappy(self, n: int) -> bool:
        c=100
        while c>1:
            c=0
            n1=0
            while n>0:
                c+=1
                n1+=(n%10)*(n%10)
                n=n//10
            n=n1
            if n1==1:
                return True
        return False
        