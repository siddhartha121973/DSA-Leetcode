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
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        if(head == null){
            return head;
        }

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        ListNode fnode = head;
        ListNode snode = head;

        int num1 = 1;
        int num2 = 1;
        while(num1 < k){
            fnode = fnode.next;
            num1++;
        }
        int pos = size - k +1;
        while(num2 < pos){
            snode = snode.next;
            num2++;
        }
        
        int value = fnode.val;
        fnode.val = snode.val;
        snode.val = value;

        return head;
    }
}