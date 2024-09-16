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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
         int position=0;
         ListNode prev=null;
        ListNode node=head;
        for(int i=0; node!= null && i<left-1;i++){
prev=node;
node=node.next;
        }
        ListNode last=prev;
        ListNode newEnd=node;
        ListNode nextNode= node.next;
       
      for(int i=0;i<(right-left+1) && node!=null ;i++  ){
        node.next=prev;
        prev=node;
        node=nextNode;
        if(nextNode!=null){
            nextNode=nextNode.next;
        }
    }
    if(last!=null){
        last.next=prev;
    }
    else{
        head=prev;
    }
        newEnd.next=node;
        return head;
         
    }
}