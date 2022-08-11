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
        if (list1 == null && list2 == null)
            return null;
        else if (list1 == null) {
            return list2;
        }
        else if (list2 == null) {
            return list1;
        }
        
        
        ListNode merged = new ListNode();
        ListNode mCurr = merged;
            
        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                mCurr.next = list1;
                
                list1 = list1.next;
                mCurr = mCurr.next;
                
                if (list1 == null)  {
                    mCurr.next = list2;
                }  
            }
            else if (list1.val >= list2.val) {
                mCurr.next = list2;
                
                list2 = list2.next;
                mCurr = mCurr.next;
                
                if (list2 == null) {
                    mCurr.next = list1;
                }
            }
        }
        
        return merged.next;
    }
}
