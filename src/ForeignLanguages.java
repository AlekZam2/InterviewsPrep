import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String language;

        switch (input){

            case "England":
            case "USA":
                language = "English";
            break;

            case "Spain":
            case"Mexico":
                language = "Spanish" ;
            break;

            default:
                language = "Invalid input";
        }
        System.out.println(language);


    }
}
