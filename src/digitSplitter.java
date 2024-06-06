import java.util.Scanner;

public class digitSplitter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        while ( num > 0 ){
            int lastDigit = num % 10;
            System.out.println(lastDigit);
            num = num / 10;

        }




    }

}

