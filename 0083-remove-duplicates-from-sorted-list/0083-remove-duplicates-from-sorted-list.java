/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head,temp1=head;
        if(temp==null)
        return head;
        while(temp1.next!=null){
            if(temp1.val!=temp1.next.val){
                temp.next=temp1.next;
                temp=temp.next;
            }
            temp1=temp1.next;
        }
        temp.next=null;
        return head;
    }
}