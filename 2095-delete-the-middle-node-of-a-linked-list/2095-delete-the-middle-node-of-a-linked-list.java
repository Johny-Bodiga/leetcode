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
    public ListNode deleteMiddle(ListNode head) {
        int c=1,c2=1;
        ListNode temp=head;
        while(temp.next!=null){
        c++;
        temp=temp.next;
        }
        if(c==1)
        return null;
        if(c==2)
        head.next=null;
        else
        {
        c=c/2;
        c++;
        }
        temp=head;
        while(temp.next!=null){
            if(c2==c){
                temp.val=temp.next.val;
                temp.next=temp.next.next;
                break;
            }
            c2+=1;
            temp=temp.next;
        }
        return head;
    }
}