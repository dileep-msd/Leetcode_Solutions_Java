package Arrays.OneDArrays;

import java.util.Arrays;

public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {

        int sum = 0;
        Arrays.sort(salary);

        for (int i = 1; i < salary.length - 2; i++) {
            sum += salary[i];
        }

        double average = (double) sum / salary.length - 2;
        return average;
    }
}
