import java.util.Scanner;
public class methods {

    public static void main(String[] args) {

        replacement('=', 5);
        System.out.println("Hello");
        replacement('%', 17);
    }

    static void replacement (char symbol, int numberOfS){
        for (int i = 0; i < numberOfS; i++) {
            System.out.print(symbol);
        }
        System.out.println();


    }
}
