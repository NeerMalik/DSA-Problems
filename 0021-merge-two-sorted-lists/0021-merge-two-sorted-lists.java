class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode head = list1;
        ListNode head2 = list2;

        while (head != null && head2 != null) {
            if (head.next == null || head.next.val > head2.val) {
                ListNode next1 = head.next;
                head.next = head2;
                head = head2;
                head2 = next1;
            } else {
                head = head.next;
            }
        }

        return list1;
    }
}
