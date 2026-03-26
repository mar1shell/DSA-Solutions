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
    public int sumNumbers(TreeNode root) {
        return sumNumbersRec(root, 0);
    }

    private int sumNumbersRec(TreeNode node, int currNum) {
        currNum = currNum * 10 + node.val;
        
        if (node.left == null && node.right == null) {
            return currNum;
        }

        int leftSum = (node.left != null) ? sumNumbersRec(node.left, currNum) : 0;
        int rightSum = (node.right != null) ? sumNumbersRec(node.right, currNum) : 0;

        return leftSum + rightSum;
    }
}