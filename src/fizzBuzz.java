import java.util.Scanner;

public class fizzBuzz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {

            if ( i % 3==0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            } else if ( i % 5 == 0) {
                System.out.println("buzz");
            } else if ( i % 3==0 ) {
                System.out.println("fizz");
            } else
                System.out.println(i);

        }


    }


}




