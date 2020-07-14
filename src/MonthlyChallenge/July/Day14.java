package MonthlyChallenge.July;

public class Day14 {
    public static void main(String[] args) {

        // Angle between hands of a clock;

        // Refer leetcode premium solution for perfect explanation.

        int min = 23;
        int hour = 3;

        int anglePerMinute = 6;
        int anglePerHour = 30;

        double minutes = anglePerMinute * min;
        double hourAngle = (hour % 12 + min / 60.0) * anglePerHour;


        double diff = Math.abs(hourAngle - minutes);
        System.out.println(Math.min(diff, 360 - diff));


    }
}
