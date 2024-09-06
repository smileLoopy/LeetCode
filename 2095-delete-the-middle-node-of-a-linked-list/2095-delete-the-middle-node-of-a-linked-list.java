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

         // 1 -> 3 -> 4 -> 7 -> 1 -> 2 -> 6
        
        if (head == null || head.next == null) {
            return null;
        }

        int length = 0;
        ListNode current = head; // current = 1
        while (current != null) {// 1 != null, 3 != null, 4 != null, 7 != null, 1 != null, 
                                 // 2 != null, 6 != null, null

            length++; // 1, 2, 3, 4, 5, 6, 7
            current = current.next; // 3, 4, 7, 1, 2, 6, null
        }

        // Find the Middle 
        int middleIndex = length / 2; // 7 / 2 = 3
        ListNode prev = null;
        current = head; // current = 1
        
        
        for (int i = 0; i < middleIndex; i++) { // 3 tiems 0, 1, 2
            prev = current; // 1, 3, 4
            current = current.next; // 3, 4, 7 -> This is the middle value
        }

        if (prev != null) {
            prev.next = current.next; // 4 -> 1 -> Remove the middle value [4 1 2 6] 끊어버려
        }
        
        // prev [1, 3, 4]
        // current [1, 2, 6]
        
        return head; // 1 -> 3 -> 4 -> 1 -> 2 -> 6
        
    }
}