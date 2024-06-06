import java.util.Scanner;

public class method2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = (int) Long.parseLong(scanner.nextLine());


        System.out.println(comparingNum(num1, num2));



    }

    private static int comparingNum(int a, int b) {

        if(a > b){
            return a;
        }else {
            return b;
        }


    }

}
