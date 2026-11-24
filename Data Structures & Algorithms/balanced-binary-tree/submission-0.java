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
    boolean flag=true;
    public int findDfs(TreeNode root){
        int left=0;
        int right=0;
        if(root.left==null&&root.right==null){
            return 0;
        }
        if(root.left!=null){
            left= 1+findDfs(root.left);
        }

        if(root.right!=null){
             right=1+findDfs(root.right);
        }

        if(Math.abs(left-right)>1){
            flag=false;
        }

        return Math.max(left,right);

        
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        findDfs(root);
        return flag;
    }
}
