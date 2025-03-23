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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode temp= new ListNode(100); // Dummy LL
        ListNode curr = temp;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                curr.next=t1; // point to the next means reach arrow 
                t1=t1.next;
            }else{
                curr.next=t2; // point to the next means reach arrow 
                t2=t2.next;
            }
            curr = curr.next; // reach to the LL of arrow of curr
        }// whiile end
        if(t1==null){ //t1 is empty
            curr.next=t2;
        }else{ // t2 empty 
            curr.next=t1;
        }
        return temp.next;
        
    }
}
