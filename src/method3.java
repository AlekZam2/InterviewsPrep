import java.util.Scanner;

public class method3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double grade1 = Double.parseDouble(scanner.nextLine());

        double grade2 = Double.parseDouble(scanner.nextLine());

        double grade3 = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f ", averageGrades(grade1, grade2, grade3));




    }

    private static double averageGrades(double a, double b,double c) {

        return (a+b+c) / 3;


    }
}
