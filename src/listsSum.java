import java.time.chrono.MinguoDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class listsSum {
    public static void main(String[] args) {

        ArrayList<Integer>input = new ArrayList<>(Arrays.asList(8,2,2,4,8,16));


        for (int i = 0; i < input.size()-1; i++) {

            if (Objects.equals(input.get(i), input.get(i+1))){
                input.set(i, input.get(i) + input.get(i));
                input.remove(i+1);
                i = -1;

            }


        }
        System.out.println(input);





    }
}
