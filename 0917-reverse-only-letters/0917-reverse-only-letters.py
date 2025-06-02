class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        ans=""
        li=[i for i in s]
        l=0
        h=len(s)-1
        temp=""
        while(l<h):
            while l<len(s) and not s[l].isalpha():
                l+=1
            while h>=0 and not s[h].isalpha():
                h-=1
            if l<len(s) and h>=0 and s[l]==li[l] and s[h]==li[h]:
                temp=li[l]
                li[l]=li[h]
                li[h]=temp
                print(li)
            l+=1
            h-=1
        
           
            


        for i in li:
            ans+=i
        return ans
           

            
            
                
           