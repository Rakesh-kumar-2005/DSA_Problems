package Tree;

/*

Description:
    This program calculates the maximum depth (or height) of a binary tree using recursion...
    The depth of a binary tree is the length of the longest path from the root node to any leaf node...

Problem Statement:
    -> Given a binary tree, find its maximum depth (height)...
    -> The maximum depth is the number of nodes along the longest path from the root node to the farthest leaf node...
    -> For example, in a balanced tree with a root and two levels below, the maximum depth would be 3...

Approach:
    > Recursive Tree Traversal:
        1. Use a recursive depth-first approach to traverse the tree...
        2. Calculate the height of left and right subtrees independently...
        3. Determine the maximum height between left and right subtrees...
        4. Add 1 to account for the current node...

Algorithm Steps:
    -> maxDepth() Method:
        1. Base case: If the root is null (empty tree), return 0...
        2. Recursively calculate the height of the left subtree...
        3. Recursively calculate the height of the right subtree...
        4. Find the maximum of left and right subtree heights...
        5. Return the maximum height + 1 (adding one for the current node)...
        
    -> Main Method Flow:
        1. Create a sample binary tree with 7 nodes (complete binary tree of height 3)...
        2. Call maxDepth() with the root node to calculate the height...
        3. Print the calculated height of the tree...

Key Characteristics:
    -> Uses post-order traversal (processes left and right before current node)...
    -> Demonstrates divide-and-conquer approach to tree problems...
    -> Handles the base case of an empty tree appropriately...
    -> Uses Math.max() to find the maximum of two values...
    -> The height is defined as the number of nodes along the longest path...

Implementation Details:
    -> The package is named "Tree"...
    -> Defines a static inner class TreeNode to represent each node in the binary tree...
    -> Each TreeNode contains:
       - An integer value (val)...
       - References to left and right child nodes...
    -> Constructs a sample binary tree with 7 nodes in the main method...
    -> Uses a private static method for the recursive algorithm...
    -> Returns the height as an integer...

Time and Space Complexity:
    -> Time Complexity: O(n) where n is the number of nodes in the tree...
       (Each node is processed exactly once)...
    -> Space Complexity: O(h) where h is the height of the tree...
       (Due to the recursion stack, in worst case O(n) for skewed trees)...

Potential Improvement:
    -> Could implement an iterative approach using a queue (BFS) or stack (DFS) to avoid recursion...
    -> Could add validation or error handling for edge cases...
    -> Could be extended to return the deepest nodes along with the height...
    -> Could incorporate a method to visualize the tree structure...

*/

public class Maximum_Depth_Of_A_Binary_Tree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        int maxHeight = Math.max(leftHeight, rightHeight);

        return maxHeight + 1;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int height = maxDepth(root);

        System.out.println("Height of the Tree is : " + height);
    }
}
