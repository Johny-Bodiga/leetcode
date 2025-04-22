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
    public ListNode rotateRight(ListNode head, int k) {
        int c=0;
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head,temp1=null;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        c+=1;
        temp=head;
        k=k%c;
        while(c!=k){
            c-=1;
            if(c==k)
            {
                temp1=temp.next;;
                temp.next=null;
            }
            temp=temp.next;
            
        }
       temp=temp1;
       while(temp!=null){
        if(temp.next==null){
            temp.next=head;
            break;
        }
        temp=temp.next;
       }
      // System.out.println(temp1.val);
        return temp1;
    }
}