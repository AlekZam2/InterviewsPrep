import java.util.Scanner;

public class gradesMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        grades(scanner.nextDouble());

    }

    static void grades (double grade) {
        String value;
        if (grade > 2.00 && grade <= 4.00){
            value = " not pass";
            print(value);
        } else if (grade > 4.00 && grade < 5.00) {
            value =(" okay");
            print(value);

        } else if ( grade > 5.00 ) {
            value =("great");
            print(value);

        }
    }
    static void print (String values){
        System.out.println(values);
    }
}
