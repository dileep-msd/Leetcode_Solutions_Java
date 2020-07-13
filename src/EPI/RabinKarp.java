package EPI;

public class RabinKarp {
    public static void main(String[] args) {
        // find the first occurence of the substring s in t;
        String s = "abc";
        String t = "axadfnsgfsgabc";
        System.out.println(t.length());
        rabinKarpAlgorithm(s, t);
    }

    public static void rabinKarpAlgorithm(String s, String t) {
        if (s.length() > t.length()) {
            System.out.println("Can not be a substring");
            return;
        }

        int BASE = 26;
        int power = 1;
        int tHash = 0, sHash = 0;

        for (int i = 0; i < s.length(); i++) {

            power = i > 0 ? power * BASE : 1;
            tHash = tHash * BASE + t.charAt(i);
            sHash = sHash * BASE + s.charAt(i);
        }


        for (int i = s.length(); i < t.length(); i++) {
            if (tHash == sHash && t.substring(i - s.length(), i).equals(s)) {
                System.out.println(i - s.length() + " is the index of the first occurence");
                return;
            }

            tHash -= t.charAt(i - s.length()) * power;
            tHash = tHash * BASE + t.charAt(i);
        }

        if (tHash == sHash && t.substring(t.length() - s.length()).equals(s)) {
            System.out.println(t.length() - s.length() + " is the index of the first occurence");
            return;
        }

    }

}
