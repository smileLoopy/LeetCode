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
    public boolean isPalindrome(ListNode head) {

        // Compare
        if(head == null || head.next ==null) {
            return true;
        }

        ListNode middle = findMiddle(head);
        ListNode secondHalfList = reverseList(middle);
        ListNode firstHalfList = head;

        ListNode p1 = firstHalfList;
        ListNode p2 = secondHalfList;

        boolean isPalindrome = true;

        while (p2 != null) {
            if(p1.val != p2.val) {
                isPalindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return isPalindrome;
    }

            
        // Find Middle
        private ListNode findMiddle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            System.out.println("slow.val" + slow.val);
            return slow;
        }

        // Reverse it
        private ListNode reverseList (ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }
    }
