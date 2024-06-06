import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grades = Double.parseDouble(scanner.nextLine());

        String output = String.format("Name: %s, Age: %d, Grade %.2f", name , age ,grades);

        System.out.println(output);

    }
}
