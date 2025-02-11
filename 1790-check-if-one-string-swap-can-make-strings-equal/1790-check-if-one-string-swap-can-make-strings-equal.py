class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        f=0
        l=0
        c=0
        for i in range(len(s1)):
            if(s1[i]!=s2[i] and c==0):
                f=i
                c=1
                
            elif(s1[i]!=s2[i] and c==1):
                l=i  
                break
        
        
        s3=s1[:f]+s1[l]+s1[f+1:l]+s1[f]+s1[l+1:]
        print(s1,s2,s3,f,l)
        if(s3==s2 or s1==s2):
            return True
        return False
                    
