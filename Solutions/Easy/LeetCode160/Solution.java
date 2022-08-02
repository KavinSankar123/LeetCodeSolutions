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
        ListNode currA = headA;
        ListNode currB = headB;
        
        while (currA != currB) {
            if (currA == null) 
                currA = headB;
            else
                currA = currA.next;
            
            if (currB == null) 
                currB = headA;
            else
                currB = currB.next;
        }
        
        return currA;
        
        
        
        
    // Alernative Solution: Time complexity --> O(N) where N is the number of nodes in the longest list
    //                      Space complexity --> O(M + N) where M and N are the nodes in both lists
        
        
//         ListNode currA = headA;
//         ListNode currB = headB;
        
//         HashMap<ListNode, Integer> map = new HashMap();
        
//         while(currA != null || currB != null) {
//             if (currA != null) {
//                 if (map.containsKey(currA))
//                     return currA;
//                 else {
//                     map.put(currA, 1);
//                 }
//                 currA = currA.next;
//             }
            
//             if (currB != null) {
//                 if (map.containsKey(currB))
//                     return currB;
//                 else {
//                     map.put(currB, 1);
//                 }
//                 currB = currB.next;
//             }
//         }
        
//         return null;
    }
}
