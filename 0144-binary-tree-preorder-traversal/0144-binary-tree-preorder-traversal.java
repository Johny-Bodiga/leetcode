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
    public List<Integer> preorderTraversal(TreeNode root) {
       Stack<TreeNode> st=new Stack<>();
       List<Integer> l=new ArrayList<Integer>();
       st.push(root);
    while(!st.isEmpty()){
        root=st.pop();
        if(root!=null)
        l.add(root.val);
        if(root!=null && root.right!=null)
        st.push(root.right);
        if(root!=null && root.left!=null)
        st.push(root.left);
    }



       return l;

    }

}