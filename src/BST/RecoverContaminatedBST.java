package BST;

import java.util.ArrayList;
import java.util.List;

public class RecoverContaminatedBST {
    public static void main(String[] args) {
        TreeNode input1 = new TreeNode(-1, null, new TreeNode(-1));
        TreeNode input2 = new TreeNode(-1, new TreeNode(-1, new TreeNode(-1), new TreeNode(-1)), new TreeNode(-1));
        TreeNode input3 = new TreeNode(-1, null, new TreeNode(-1, null, new TreeNode(-1, new TreeNode(-1, null, null), null)));

        FindElements findElements = new FindElements(input1);
        FindElements findElements1 = new FindElements(input2);
        FindElements findElements2 = new FindElements(input3);

        System.out.println(findElements.find(1));
        System.out.println(findElements.find(2));
        System.out.println(findElements.numbers);

        System.out.println();
        System.out.println("Second input: ");

        System.out.println(findElements1.find(1));
        System.out.println(findElements1.find(3));
        System.out.println(findElements1.find(5));
        System.out.println(findElements1.numbers);

        System.out.println();
        System.out.println("Third input: ");
        System.out.println(findElements2.find(2));
        System.out.println(findElements2.find(3));
        System.out.println(findElements2.find(4));
        System.out.println(findElements2.find(11));
        System.out.println(findElements2.numbers);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class FindElements {
    List<Integer> numbers = new ArrayList<>();

    public FindElements(TreeNode root) {
        root.val = 0;
        recoverBinaryTree(root);
    }

    public boolean find(int target) {
        return numbers.contains(target);

    }

    public void recoverBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }

        numbers.add(root.val);

        if (root.left != null) {
            root.left.val = 2 * root.val + 1;
            recoverBinaryTree(root.left);
        }


        if (root.right != null) {
            root.right.val = 2 * root.val + 2;
            recoverBinaryTree(root.right);
        }


    }
}
