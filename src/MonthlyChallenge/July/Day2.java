package MonthlyChallenge.July;

import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        //Level order traversal II
        TreeNode root = new TreeNode(5, new TreeNode(3), new TreeNode(2));
        LinkedList<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new ArrayDeque<>(0);
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.add(node.right);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }


    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
