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
    public TreeNode findDfs(TreeNode root){
        TreeNode temp=root;
        TreeNode left=null;
        TreeNode right=null;

        if(temp.left!=null){
            left= findDfs(temp.left);
        }

        if(temp.right!=null){
            right= findDfs(temp.right);
        }

        TreeNode temp2=left;
       temp.left=right;
        temp.right=temp2;

        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp=root;
        if(temp==null){
            return null;
        }
       return findDfs(temp);
    }
}
