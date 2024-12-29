class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        boo=[]
        m=max(candies)
        for i in candies:
            if extraCandies+i>=m:
                boo.append(True)
            else:
                boo.append(False)
        return boo