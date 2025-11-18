import java.util.Scanner;

public class LabTask3a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int num = sc.nextInt();

        if (num < 0 || num > 15) {
            System.out.println(num + " is an invalid input");
        } else {
            System.out.println("The hex value is " + Integer.toHexString(num).toUpperCase());
        }
    }
}
