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
    int maxLen=0;
    public int findDfs(TreeNode root){
        int left=0;
        int right=0;

        if(root.left==null&&root.right==null){
            return 1;
        }

        if(root.left!=null){
           left= findDfs(root.left);
        }

        if(root.right!=null){
           right= findDfs(root.right);
        }

        maxLen=Math.max(maxLen,left+right);


        return Math.max(left+1,right+1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        findDfs(root);

        return maxLen;
    }
}
