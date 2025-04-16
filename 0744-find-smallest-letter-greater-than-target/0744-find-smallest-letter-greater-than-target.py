class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        l=0
        h=len(letters)-1
        while l<=h:
            mid=(l+h)//2
            if mid==0 and letters[mid]>=target:
                return letters[mid]
            elif letters[mid-1]<=target and letters[mid]>target:
                return letters[mid]
            elif letters[mid]<=target:
                l=mid+1
            else:
                h=mid-1
        return letters[0]