import java.util.Scanner;

public class iWillBeBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        minutes = minutes + 30;

        if (minutes > 59){
            minutes = minutes - 60;
            hours ++;
        }
        if ( hours > 23){
            hours = hours - 24;
        }
        System.out.printf("%d : %02d", hours, minutes);



    }
}
