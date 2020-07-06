package Leetcode;

public class IPaddress {
    public static void main(String[] args) {
        String s = defangIPaddr("1.2.34.5");
        System.out.println(s);
    }

    public static String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }
}
