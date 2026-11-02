class Solution {
    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        dfs(root);
        return maxDiameter;
    }

    private int dfs(TreeNode node) {
        // Base case: empty node
        if (node == null) {
            return 0;
        }

        // Get heights of left and right subtrees
        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);

        // Update max_diameter if current node gives larger value
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return height of current node's subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }
}