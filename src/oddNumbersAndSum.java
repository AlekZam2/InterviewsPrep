import java.util.Scanner;

public class oddNumbersAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int oddNumber = 1;
        int sum = 0;
//

        for ( int i = 1 ; i <= num ; i++ ){

                System.out.println(oddNumber);
                sum = sum + oddNumber;
                oddNumber = oddNumber +2;

        }
        System.out.println(sum);

//        int i =0;
//        while ( count < num) {
//            if (i % 2 !=0){
//                System.out.println(i);
//                sum = sum + i;
//                count++;
//
//            }
//            i++;
//
//        }



    }
}
