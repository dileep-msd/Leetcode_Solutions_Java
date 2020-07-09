package Amazon;

import java.util.Arrays;

class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String x = "au";
        char[] s = x.toCharArray();
        int[] index = new int[26];
        int ans = 0;
        for (int i = 0, j = 0; j < s.length; j++) {
            int temp = s[j] - 'a';
            i = Math.max(index[temp], i);
            ans = Math.max(ans, j - i + 1);
            index[temp] = j + 1;
        }
        System.out.println(Arrays.toString(index));
        System.out.println(ans);
    }

}