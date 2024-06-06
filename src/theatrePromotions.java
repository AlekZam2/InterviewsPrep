import java.util.Scanner;

public class theatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weekDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());


        if (weekDay.equals("weekday")){
            if ( age >= 0 && age <=18){
                System.out.println("12$");
            }else if (age >= 19 && age <=64 ){
                System.out.println("18$");
            }

        }
        if (weekDay.equalsIgnoreCase("holiday")){
            if ( age >= 0 && age <=18) {
                System.out.println("20$");
            }
        }


    }
}
