import java.util.Scanner;

public class smallestDifPossible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split(",");
        int [] input = new int [string.length];
        for (int i = 0; i < string.length; i++) {
            input[i] = Integer.parseInt(string[i]);
        }



        int currentLowSum = Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length ; j++) {
                int lowSum = Math.abs(input[i] - input[j]);
                if ( lowSum < currentLowSum){
                   currentLowSum = lowSum;
                }
            }

        }
        System.out.println( currentLowSum);





    }
}
