class Solution:
    def isHappy(self, n: int) -> bool:
        l=[]
        
        while True:
            n1=0
            while n>0:
                n1+=(n%10)*(n%10)
                n=n//10
            n=n1
            if n1==1:
                return True
            if n1 in l:
                return False
            l.append(n1)
        return False
        