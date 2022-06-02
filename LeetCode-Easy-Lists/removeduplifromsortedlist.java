import java.util.*;
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
/**
 Given the head of a sorted linked list, delete all duplicates such that each element appears 
 only once. Return the linked list sorted as well.

 */
public class removeduplifromsortedlist {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode trav = head;
        if(head==null){
            return null;
        }else if(head.next==null){
            return head;
        }
        ListNode trav2 = head.next;
        while(trav2!=null){
            if(trav.val==trav2.val){
                trav.next = trav2.next;
                trav2 = trav2.next;
            }else{
                trav = trav.next;
                trav2 = trav2.next;
            }
        }
        return head;
    }
    
}
