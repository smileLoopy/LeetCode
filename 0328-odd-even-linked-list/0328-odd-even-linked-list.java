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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) {
            return head; //Prevent NullPointerException
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode odd = oddHead;
        ListNode even = evenHead;

        while (even != null && even.next != null) {
            odd.next = even.next; // Link odd nodes
            odd = odd.next; // Move odd pointer
            even.next = odd.next; // Link even nodes
            even = even.next; // Move even pointer
        }

        odd.next = evenHead; // Connect the end of the odd list to the head of the even list

     return head;

    }
}