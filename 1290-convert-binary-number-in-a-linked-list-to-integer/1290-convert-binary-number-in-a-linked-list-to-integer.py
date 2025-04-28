# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: Optional[ListNode]) -> int:
        s=""
        while(head!=None):
            s+=str(head.val)
            head=head.next
        s=int(s)
        num=0
        c=0
        while s>0:
            num+=(s%10)*pow(2,c)
            c+=1
            s=s//10
        return num

        