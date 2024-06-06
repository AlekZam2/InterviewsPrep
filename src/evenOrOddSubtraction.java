import java.util.Scanner;

public class evenOrOddSubtraction {
    public static  void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        String [] initial = scanner.nextLine().split("");
        int[] input = new int [initial.length];
        for (int i = 0; i < initial.length;  i++){
            input[i] = Integer.parseInt(initial[i]);
        }


        int odd= 0;
        int even = 0;

        for ( int ignored : input ){
            if ( ignored %2 ==0){
                even = even + ignored;
            }else {
                odd = odd + ignored;
            }


        }
        System.out.println(even);
        System.out.println(odd);
        System.out.println(" Result: "+ (even - odd));



    }
}
