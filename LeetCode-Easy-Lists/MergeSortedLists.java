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
  *You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
  */
public class MergeSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null){
            return null;
        }else if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        ListNode trav1 = list1;
        ListNode trav2 = list2;
        ListNode x = new ListNode(Math.min(trav1.val,trav2.val),null);
        ListNode trav3 = x;
        if(trav1.val<trav2.val){
            trav1=trav1.next;
        }else{
            trav2 = trav2.next;
        }
        while(trav1!=null && trav2!=null){
            if(trav1.val<trav2.val){
                trav3.next= new ListNode(trav1.val,null);
                trav3 = trav3.next;
                trav1 = trav1.next;
            }else{
                  trav3.next = new ListNode(trav2.val,null);
                trav3 = trav3.next;
                trav2 = trav2.next;
            }
        }
        if(trav1!=null){
            trav3.next = trav1;
        }else{
            trav3.next = trav2;
        }
        return x;
        
    }
    
}
