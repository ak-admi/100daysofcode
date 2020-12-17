package Day3;

import java.util.Scanner;

public class ReverseSentence {
    public static String str;
    public static Scanner sc = new Scanner(System.in);

    public static String ReversedByletters(String str) {
        char[] c = str.toCharArray();
        String out = "";
        for (int i = c.length - 1; i >= 0; i--) {
            out += c[i];
        }
        return out;

    }

    public static String ReversedBywords(String str) {
        String[] s = str.split(" ");
        String out = "";
        for (int i = s.length - 1; i >= 0; i--) {
            out += s[i] + " ";
        }
        return out;

    }

    public static void main(String[] args) {
        System.out.println("Enter the sentence");
        str = sc.nextLine();
        System.out.println(ReversedByletters(str));
        System.out.println(ReversedBywords(str));

    }

}
