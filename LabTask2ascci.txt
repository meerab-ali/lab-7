import java.util.Scanner;

public class LabTask2ascci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int code = sc.nextInt();

        char ch = (char) code;

        System.out.println("The character for ASCII code " + code + " is " + ch);
    }
}
