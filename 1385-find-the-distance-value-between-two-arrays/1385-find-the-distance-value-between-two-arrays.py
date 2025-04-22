#import math
class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        c=0
        c1=0
        for i in range(len(arr1)):
            c1=0
            for j in range(len(arr2)):
                if abs(arr1[i]-arr2[j])<=d:
                    c1=1
                    break
                
            if c1==0:
                c+=1
        return c
