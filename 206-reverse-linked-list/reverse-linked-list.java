class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: if list is empty or has only one node, it's already reversed
        if (head == null || head.next == null) {
            return head;
        }
        
        // Reverse the rest of the list
        ListNode newHead = reverseList(head.next);
        
        // Make the next node point back to the current node
        head.next.next = head;
        // Break the original forward link to avoid cycles
        head.next = null;
        
        return newHead;
    }
}
