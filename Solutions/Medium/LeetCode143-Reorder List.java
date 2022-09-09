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
    public void reorderList(ListNode head) {
        if(head.next == null)
            return;
        ListNode temp = head.next;
        
        Stack<ListNode> stack = new Stack<>();
        while(temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        
        
        ListNode currHead = head;
        ListNode headNext = head.next;
        
        ListNode tail = stack.pop();
        ListNode prev = null;
        
        while(currHead.next != null && !currHead.next.equals(tail)) {
            if(!stack.isEmpty())
                prev = stack.pop();
             
            currHead.next = tail;
            tail.next = headNext;
            prev.next = null;
            tail = prev;

            currHead = headNext;
            headNext = headNext.next;
        }
    }
}
