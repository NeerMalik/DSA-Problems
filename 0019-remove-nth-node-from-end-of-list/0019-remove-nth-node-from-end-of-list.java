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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode node=head;
        
        if(head==null){
            return head;
        }
        if(head.next==null){
            head=null;
            return head;
        }
        
        while(node!=null){
            size++;
            node=node.next;
        }
        
        node=head;
        int stsize=size-n;
        if(stsize==0){
            head=head.next;
            return head;
        }
        for(int i=0;i<stsize-1;i++){
            
            node=node.next;
        }

                node.next=node.next.next;

        
        return head;
    }
}