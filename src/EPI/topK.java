package EPI;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class topK {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "world", "hkjadhf", "dsur", "kajhfljbavgs", "ajrhae", "hsgfjb",
                "ASRFAERFAR afadcfsvg", "dakjfhjb", "adf", "fdf", "a");

        PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> a.length() - b.length());
        int k = 3;
        for (String s : list) {
            if (!minHeap.isEmpty() && s.length() < minHeap.peek().length()) {
                continue;
            }
            minHeap.add(s);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        System.out.println(minHeap);
    }
}
