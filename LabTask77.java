import java.util.Scanner;

public class LabTask77 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int first = s.indexOf('f');
        int last = s.lastIndexOf('f');

        if (first == -1) {
            // print nothing
        } 
        else if (first == last) {
            System.out.println(first);
        } 
        else {
            System.out.println(first + " " + last);
        }
    }
}
