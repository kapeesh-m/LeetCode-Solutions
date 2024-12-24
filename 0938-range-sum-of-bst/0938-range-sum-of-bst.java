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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int cou=0;
        int ans=inorder(root,low,high,cou);
        return ans;
    }
    public int inorder(TreeNode node,int low,int high,int count){
        if(node!=null){
            count=inorder(node.left,low,high,count);
            if(node.val>=low&&node.val<=high){
                count+=node.val;
            }
            count=inorder(node.right,low,high,count);
        }
        return count;
    }
}