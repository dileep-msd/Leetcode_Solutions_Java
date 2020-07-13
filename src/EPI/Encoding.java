package EPI;

public class Encoding {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int index = 0;
        int count = 1;

        for (int i = 1; i <= chars.length; i++) {
            if (i == chars.length || chars[i] != chars[i - 1]) {
                chars[index++] = chars[i - 1];
                chars[index++] = Character.forDigit(count, 10);
                count = 1;
            } else {
                count++;
            }
        }
        System.out.println(index);
    }
}
