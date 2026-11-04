class Solution {
    public ListNode middleNode(ListNode head) {
        // Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        // Move pointers until fast reaches the end
        while (fast != null && fast.next != null) {
            // Move slow pointer one step
            slow = slow.next;
            // Move fast pointer two steps
            fast = fast.next.next;
        }

        // Return the middle node
        return slow;
    }
}