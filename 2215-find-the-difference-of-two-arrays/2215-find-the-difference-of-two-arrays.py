class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        re=[]
        nums1=list(set(nums1))
        nums2=list(set(nums2))
        nums1.sort()
        nums2.sort()
        n1=[]
        n2=[]
        for i in nums1:
            if i not in nums2:
                n1.append(i)
        for i in nums2:
            if i not in nums1:
                n2.append(i)
        re.append(n1)
        re.append(n2)
        return re
        