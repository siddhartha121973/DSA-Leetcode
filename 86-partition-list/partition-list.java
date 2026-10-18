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
    public ListNode partition(ListNode head, int x) {
        ListNode lesshead = new ListNode(-1);
        ListNode lesstail = lesshead;
        ListNode greaterhead = new ListNode(1);
        ListNode greatertail = greaterhead;
       
        ListNode temp = head ;

        while(temp != null){
            if(temp.val < x){
                ListNode insert = temp ;
                temp = temp.next;
                insert.next = null;
                lesstail.next = insert;
                lesstail = insert;

            } 
            else{
                ListNode insert = temp ;
                temp = temp.next;
                insert.next = null;
                greatertail.next = insert;
                greatertail = insert;
            }
        }

        lesstail.next = greaterhead.next;
        greatertail.next = null; 
        lesshead = lesshead.next;

        return lesshead;
    }
}