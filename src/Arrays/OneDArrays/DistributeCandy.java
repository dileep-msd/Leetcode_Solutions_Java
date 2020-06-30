package Arrays.OneDArrays;

public class DistributeCandy {
    // refer: https://www.interviewbit.com/problems/distribute-candy/
    public static void main(String[] args) {

        int[] array = {1, 5, 2, 1};
        findMinCandies(array);
    }

    public static void findMinCandies(int[] array) {
        int minCandies = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i + 1] > array[i]) {
                    minCandies += array[i];
                } else {
                    minCandies += array[i] - array[i + 1] - 1;
                }
                continue;
            }

            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                minCandies += array[i - 1] + array[i + 1];
            }

        }
    }
}
