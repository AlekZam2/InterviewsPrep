import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayLists {
    public static void main(String[] args) {


        ArrayList<Integer>  list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer>  list2 = new ArrayList<>(Arrays.asList(6,7,8));
        ArrayList<Integer>  epmtyList = new ArrayList<>();


        ArrayList<Integer>  biggerList = new ArrayList<>();
        ArrayList<Integer>  smallerList = new ArrayList<>();



        if (list1.size() > list2.size()){
            biggerList = list1;
            smallerList = list2;

        }else {
            biggerList = list2;
            smallerList = list1;
        }
        int minSize = biggerList.size() - smallerList.size();

        for (int i = 0; i < minSize ; i++) {

                epmtyList.add(biggerList.get(i));
                epmtyList.add(smallerList.get(i));


        }
        for ( int i = minSize; i < biggerList.size() ; i++){
            epmtyList.add( biggerList.get(i));

        }
        System.out.println(epmtyList);

    }
}
