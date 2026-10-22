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
    public void flatten(TreeNode root) {
        preorder(root) ;
    }

    private TreeNode preorder(TreeNode root){
        if(root == null) return null ;
        TreeNode head = root ;
        TreeNode right = root.right ;
        root.right = preorder(root.left) ;
        while(root.right != null){
            root.left = null ;
            root = root.right ;
        }
        root.right = preorder(right) ;
            root.left = null ;
        return head ;
    }
}