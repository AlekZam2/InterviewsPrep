import java.util.Scanner;

public class Example {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System. in);

        int n = scanner.nextInt();

        int [] numbers   = new int [n];

        for (int i = 0; i < n ; i++) {
            numbers[i] = scanner.nextInt();

        }
        for (int i = 0 ; i < n ; i ++) {
            System.out.println(numbers[i]);

        }

    }
}
