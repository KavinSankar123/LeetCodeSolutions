/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> values = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        // Recursive Solution
        traverse(root);
        return values;
        
        
        // Iterative Solution
//         TreeNode curr = root;
//         Stack<TreeNode> stack = new Stack<>();
        
//         while (curr != null || !stack.isEmpty()) {
//             while (curr != null) {
//                 stack.push(curr);
//                 curr = curr.left;
//             }
//             curr = stack.pop();
//             values.add(curr.val);
//             curr = curr.right;
//         }
        
//         return values;
    }
       
    
    private void traverse(TreeNode root) {
        if (root == null)
            return;
        traverse(root.left);
        values.add(root.val);
        traverse(root.right);
    }
}
