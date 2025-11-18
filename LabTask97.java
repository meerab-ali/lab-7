import java.util.Scanner;

public class LabTask97 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int first = s.indexOf('h');
        int last = s.lastIndexOf('h');

        String before = s.substring(0, first + 1);
        String middle = s.substring(first + 1, last).replace('h', 'H');
        String after = s.substring(last);

        System.out.println(before + middle + after);
    }
}
