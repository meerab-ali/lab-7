import java.util.Scanner;

public class LabTask2b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        int unicode = (int) c;

        System.out.println("The Unicode for the character " + c + " is " + unicode);
    }
}
