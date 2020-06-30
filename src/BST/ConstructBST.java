package BST;

public class ConstructBST {
    // refer: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/submissions/
    /*
     public TreeNode sortedArrayToBST(int[] nums) {

        return constructBST(nums,0,nums.length-1);
    }
    public TreeNode constructBST(int[] nums, int left, int right){
        if(left>right || nums.length == 0){
            return null;
            }

        int mid = left+(right-left)/2;
        TreeNode current = new TreeNode(nums[mid]);
        current.left = constructBST(nums,left,mid-1);
        current.right = constructBST(nums,mid+1,right);

        return current;


    }


     */
}
