/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode l1=headA;
        int l1_len=0;
        ListNode l2=headB;
        int l2_len=0;
        // length for listA
        while(l1!=null){
            l1_len++;
            l1 = l1.next;
        }
        // length for listB
        while(l2!=null){
            l2_len++;
            l2 = l2.next;
        }
        int diff=0;
        // reset to head
        l1=headA;
        l2=headB;
        if(l1_len>=l2_len){
            diff=l1_len-l2_len;
            for(int i=0;i<diff;i++){
                l1=l1.next;
            }
        }else{
            diff=l2_len-l1_len;
            for(int i=0;i<diff;i++){
                l2=l2.next;
            }
        }
        // above will make that each list start with equal no. of element
        // check intersection of two LL
         while(l1!=null && l2!=null){
            if(l1==l2){
                return l1;
            }
            l1 = l1.next;
            l2=l2.next;
        }
        return null;
    }
}
