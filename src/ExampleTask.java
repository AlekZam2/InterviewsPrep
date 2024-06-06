import com.sun.security.jgss.GSSUtil;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExampleTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = " Bob Bob Bob";

        StringBuilder str = new StringBuilder("hui");

        str.delete(0,1);
        str.insert(0,"H");
        System.out.println(str.toString());




//
//        String[] words = scanner.nextLine().split(" ");
//        String[] result = new String[ words.length];
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            result [i] = repeat(word, words.length) ;
//
//        }
//        System.out.println( String.join("", result));
//
//
//    }
//
//    static String repeat (String s, int times){
//        String[] repetitions = new String[times];
//        for (int i = 0; i < times; i++) {
//            repetitions[i] = s;
//        }
//        return String.join("",repetitions);


     }

}
