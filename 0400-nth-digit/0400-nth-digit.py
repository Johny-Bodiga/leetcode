class Solution:
    def findNthDigit(self, n: int) -> int:
        if n>=1 and n<=9:
            return n
        sum=0
      #  if n==2147483647:
        #    return 2
        for i in range(1,10):
            num=9*(10**(i-1))*i 
            sum+=num
            if n<sum:
                f=(10**(i-1))-1
                sum-=num 
                sum=n-sum
                f+=(sum)//(i)
                if sum%(i)==0:
                    return f%10 
                else:
                    f+=1
                    return int(str(f)[sum%(i)-1]) 
                
        return 0
        


        