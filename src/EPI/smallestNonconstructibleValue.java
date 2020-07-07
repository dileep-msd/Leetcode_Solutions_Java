package EPI;

import java.util.ArrayList;
import java.util.List;

public class smallestNonconstructibleValue {
    /*
     e.g., you cannot create a change amount greater than the sum of the
    your coins. For example, if your coins are 1,1, 1,1, 1, 5, 10, 25, then the smallest value
    of change which cannot be made is 21.
    Suppose you were asked to write a program which takes an array of positive
    integers and returns the smallest number which is not to the sum of a subset of
    elements of the array.
     */
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(4);
        array.add(12);

        int minChange = 0;
        for (int i : array) {
            if (i > minChange + 1) {
                break;
            }
            minChange += i;
        }
        System.out.println(minChange + 1);
    }
}
