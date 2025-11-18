import java.util.Scanner;

public class LabTask107 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(s.charAt(2));                     // third character
        System.out.println(s.charAt(s.length() - 2));        // second last
        System.out.println(s.substring(0, 5));               // first five
        System.out.println(s.substring(0, s.length() - 2));  // all but last two

        // even indices
        for (int i = 0; i < s.length(); i += 2)
            System.out.print(s.charAt(i));
        System.out.println();

        // odd indices
        for (int i = 1; i < s.length(); i += 2)
            System.out.print(s.charAt(i));
        System.out.println();

        // reverse order
        for (int i = s.length() - 1; i >= 0; i--)
            System.out.print(s.charAt(i));
        System.out.println();

        // every second character in reverse
        for (int i = s.length() - 1; i >= 0; i -= 2)
            System.out.print(s.charAt(i));
        System.out.println();

        System.out.println(s.length());  // length
    }
}
