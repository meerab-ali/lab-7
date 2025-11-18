import java.util.Scanner;

public class LabTask87 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int first = s.indexOf('h');
        int last = s.lastIndexOf('h');

        String result = s.substring(0, first) + s.substring(last + 1);

        System.out.println(result);
    }
}
