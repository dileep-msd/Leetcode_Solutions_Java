package Amazon;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortStringByFrequency {
    public static void main(String[] args) {
        String s = "Aabb";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        queue.addAll(map.keySet());
        StringBuilder builder = new StringBuilder();

        while (!queue.isEmpty()) {
            char c = queue.remove();
            int count = map.get(c);
            builder.append(String.valueOf(c).repeat(Math.max(0, count)));
        }

        System.out.println(builder.toString());
    }
}
