/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false; // No cycle
        ListNode slow = head; 
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast =  fast.next.next; 
            if(slow==fast){  // Detect cycle
                slow=head;
                int pos=0; // just to get the cycle position , no need in ques.
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                    pos++; // for index of the cycle
                }
                return true;
            }
        }
        return false;
        
    }
}
