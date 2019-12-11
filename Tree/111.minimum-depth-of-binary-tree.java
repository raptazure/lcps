/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null ^ root.right == null)
            return 1 + Math.max(minDepth(root.right), minDepth(root.left));
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
// @lc code=end

