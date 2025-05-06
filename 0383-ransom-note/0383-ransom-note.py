class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        l1=[0]*26
        l2=[0]*26
        for i in ransomNote:
            l1[ord(i)-97]+=1
        for i in magazine:
            l2[ord(i)-97]+=1
        for i in ransomNote:
            if not l1[ord(i)-97]<=l2[ord(i)-97]:
                return False
        return True