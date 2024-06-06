import java.util.Scanner;

public class methods1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int season = Integer.parseInt(scanner.nextLine());

        switch (season){
            case 1:
                printSpring();
                break;
            case 2:
                printWinter();
                break;
            default:
                System.out.println( "not valid input" );

        }

    }

    private static void printWinter() {
        System.out.println("winter");
    }

    private static void printSpring() {
        System.out.println("spring");
    }
}
