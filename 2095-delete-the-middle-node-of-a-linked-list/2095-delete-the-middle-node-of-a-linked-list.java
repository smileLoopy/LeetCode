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
       
        /*
        
        //Check the nodes
        if (head == null || head.next == null) {
            return null;
        }

        ListNode middlePrev = null;
        ListNode currentNode = head; // 1
        ListNode followerNode = head; // 1

        while (followerNode != null && followerNode.next != null) {// 1 & 3, 4 & 7, 1 & 2, 6 & null
            middlePrev = currentNode; // 1, 3, 4
            currentNode = currentNode.next; // 3, 4, 7
            followerNode = followerNode.next.next; // 4, 1, 6
        }

        // Now, currentNode points to the middle node

        // Delete the middle node by adjusting pointers
        if (middlePrev != null) {
            middlePrev.next = currentNode.next;// 4 -> 7 to 4 -> 1 
            // 1 -> 3 -> 4 -> 1 -> 2 -> 6
        } else {
            head = head.next;
        }

        return head;
        
        */
        
        // Second solution 
        // 1 -> 3 -> 4 -> 7 -> 1 -> 2 -> 6
        
        if (head == null || head.next == null) {
            return null;
        }

        int length = 0;
        ListNode current = head; // 1
        while (current != null) {// 1 != null, 3 != null, 4 != null, 7 != null, 1 != null, 
                                 // 2 != null, 6 != null, null

            length++; // 1, 2, 3, 4, 5, 6, 7
            current = current.next; // 3, 4, 7, 1, 2, 6, null
        }

        // Find the Middle 
        int middleIndex = length / 2; // 7 / 2 = 3
        ListNode prev = null;
        current = head; // 1
        
        
        for (int i = 0; i < middleIndex; i++) { // 3 tiems 0, 1, 2
            prev = current; // 1, 3, 4
            current = current.next; // 3, 4, 7 -> This is the middle value
        }

        if (prev != null) {
            prev.next = current.next; // 4 -> 1 -> Remove the middle value [4 1 2 6] 끊어버려
        }
        
        // prev [4,1,2,6]
        // current [7,1,2,6]
        
        return head; // 1 -> 3 -> 4 -> 1 -> 2 -> 6
        
    }
}