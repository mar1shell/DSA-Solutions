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
    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeafRec(root, 0);
    }

    private int sumRootToLeafRec(TreeNode node, int currSum) {
        currSum = currSum * 2 + node.val;

        if (node.left == null && node.right == null) {
            return currSum;
        }

        int leftSum = (node.left != null) ? sumRootToLeafRec(node.left, currSum) : 0;
        int rightSum = (node.right != null) ? sumRootToLeafRec(node.right, currSum) : 0;
        
        return leftSum + rightSum;
    }
}