class Solution:
    def myAtoi(self, s: str) -> int:
        l=[]
        ans=""
        c=0
        cnt=0
        l1=['+','-',' ','1','2','3','4','5','6','7','8','9','0']
        for i in s:
            #print(i,ans)
            if ((i=='+' or i=='-') and ans!=""):
                break
            if i=='+' or i=='-':
                cnt+=1
            if cnt>1 and ans=="":
                return 0
            if ans=="" and i=='-':
                c=1
            if i not in l1:
                print("2")
                break
            if cnt>0 and i==' ':
                break
            if i in l1:
                if i!=' ' and i!='+' and i!='-':
                    ans+=i
                if ans!="" and (i==' ' or  i=='+' or i=='-'):
                    break
            
        print(ans)
        if ans=="":
            return 0
        ans=int(ans)
        if c==1:
            ans*=-1
        if ans>2147483647:
            ans=2147483647
        if ans< -2147483648:
            ans=-2147483648
    
        
        return ans
            
            
            

        