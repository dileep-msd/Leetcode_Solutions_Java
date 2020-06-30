package Arrays.OneDArrays;

// find the first and second max of an array without sorting.
public class MaxOfArrayWithoutSorting {
    public static void main(String[] args) {
        int[] array = {2, 5623, 626, 325, 6357, 2, 2, 5377, 644444444, 842};
        findMax(array);
    }

    public static void findMax(int[] array) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > firstMax) {
                secondMax = firstMax;
                firstMax = i;
            } else if (i > secondMax) {
                secondMax = i;
            }
        }
        System.out.println("First max: " + firstMax);
        System.out.println("Second max: " + secondMax);
    }

}
