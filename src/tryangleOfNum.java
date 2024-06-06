import java.util.Scanner;

public class tryangleOfNum {

    public static void main(String[] args) {
        int width = new Scanner(System.in) .nextInt();
        printTriangle(width);


    }

    static void printIncreasingSequence ( int last ){

        for (int i = 1; i <= last ; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

    }
    static void printTriangle(int width){
        for (int i = 1; i <= width ; i++) {
            printIncreasingSequence(i);

        } for (int i = width-1 ; i >0 ; i--) {
            printIncreasingSequence(i);

        }
    }


}
