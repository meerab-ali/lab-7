import java.util.Scanner;

public class LabTask3b7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hex = sc.next().toUpperCase();

        if (hex.length() != 1 || !"0123456789ABCDEF".contains(hex)) {
            System.out.println(hex + " is an invalid input");
        } else {
            int value = Integer.parseInt(hex, 16);
            System.out.println("The binary value is " + Integer.toBinaryString(value));
        }
    }
}
