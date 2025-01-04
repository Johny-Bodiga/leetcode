class Solution:
    def hasMatch(self, s: str, p: str) -> bool:
        prefix, suffix = p.split('*')
        
        
        if prefix=="" and suffix=="":
            return True
        
       
        
        for i in range(len(s)):
            if s[i:].startswith(prefix) or prefix=="":
                j=i
            
                #print(s[len(prefix)+j:])
                if suffix in s[len(prefix)+j:] or suffix=="" :
                    return True
    
        
    
    # If both conditions are satisfied
        return False
                        
                    
                    
                    

                
        