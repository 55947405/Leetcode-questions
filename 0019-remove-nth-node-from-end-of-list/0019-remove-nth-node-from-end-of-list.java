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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        int req = size-n;
        if(req==0) return head.next;
        temp = head;
        int count = 1;
        while(temp!=null){
            if(count==req){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
}