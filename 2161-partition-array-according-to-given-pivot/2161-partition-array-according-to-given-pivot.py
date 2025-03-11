class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        l=[]
        l1=[]
        l2=[]
        for i in nums:
            if i<pivot:
                l.append(i)
            elif(i>pivot):
                l1.append(i)
            else:
                l2.append(i)

        l+=l2+l1
        return l
