public class readingStringsConvertingToIntegers {

    public static void main(String[] args) {


        String input = "1 2 3 4 5 6";

        String [] elements = input.split(" ");
        int [] numbers = new int [elements.length];


        for (int i = elements.length - 1; i >= 0 ; i--) {

            numbers[i] = Integer.parseInt(elements[i]);
            System.out.println(numbers[i]);

        }

    }
}
