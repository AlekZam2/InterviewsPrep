public class numInReverseArrays {

    public static void main(String[] args) {


        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = numbers.length - 1; i > 0; i--) {
            System.out.println(numbers[i]);
        }

    }
}
