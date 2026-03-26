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
    private int TARGET_SUM;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        TARGET_SUM = targetSum;

        if (root == null) return false;

        return hasPathSumRec(root, 0);
    }

    private  boolean hasPathSumRec(TreeNode node, int currSum) {
        currSum += node.val;

        if (node.left == null && node.right == null) return currSum == TARGET_SUM;

        boolean leftBool = (node.left != null) ? hasPathSumRec(node.left, currSum) : false;
        boolean rightBool = (node.right != null) ? hasPathSumRec(node.right, currSum) : false;

        return leftBool || rightBool;
    }
}