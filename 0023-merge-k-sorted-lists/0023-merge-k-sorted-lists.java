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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->(a.val-b.val));
        for(ListNode ls :lists){
            ListNode temp = ls;
            while(temp!=null){
                pq.add(temp);
                temp = temp.next;
            }
        } 
        ListNode ans = new ListNode(1);
        ListNode tot = ans;
        while(!pq.isEmpty()){
            ans.next = pq.poll();
            ans = ans.next;
            ans.next = null;
        }
        return tot.next;
    }
}