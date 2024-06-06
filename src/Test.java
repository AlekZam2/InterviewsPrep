import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main (String[] args){

        Scanner scanner = new Scanner ( System.in);

        String [] input = scanner.nextLine().split("");



        for (int i = 0; i < input.length /2; i++) {

//            int left = i;
//            int right = input.length-1-i;


            String constantLeft = input[i];


            input [ i] = input[input.length-1-i];
            input [ input.length-1-i] = constantLeft;




        }
        System.out.println(String.join("", input));







    }


}
