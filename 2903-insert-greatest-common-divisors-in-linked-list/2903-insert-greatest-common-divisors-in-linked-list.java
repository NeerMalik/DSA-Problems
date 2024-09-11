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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode node1=head;
        while(node1.next!=null && node1!=null){
            int gcdval=gcd(node1.val,node1.next.val);
            ListNode gcd1=new ListNode(gcdval);
           gcd1.next=node1.next;
            node1.next=gcd1;
        node1=gcd1.next;
        }
        return head;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;

    }
}