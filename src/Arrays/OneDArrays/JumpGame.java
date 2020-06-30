package Arrays.OneDArrays;

public class JumpGame {
    // yet to learn.
    public static void main(String[] args) {
        int[] array = {9, 4, 2, 1, 0, 2, 0};
        findIsPossibleTojump(array);
    }

    public static void findIsPossibleTojump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }

    }
}

