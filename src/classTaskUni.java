import java.util.Scanner;

public class classTaskUni {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        volunteers Bob = new volunteers(100, 0.15 , 0.20, "");
        volunteers Sofia = new volunteers(127, 0.15, 0.20, "r");

        Bob.boxes = Bob.boxes + 10;

        Bob.moneyReceived();
        System.out.println(Bob.payIncrease());
        System.out.println(Sofia.payIncrease());
//        Bob.printing("Bob", Bob.boxes);



    }


}
class volunteers {
     int boxes;
     double testKits;
     double increasedTestKits;
     String rank;



    volunteers (int b, double tK, double iTK, String r){
        boxes = b;
        testKits = tK;
        increasedTestKits = iTK;
        rank = r;

    }

    public  double payIncrease(){

        double moneyNeededToBePayed = 0;


        if (boxes <= 50){
             moneyNeededToBePayed = boxes * testKits;
        }else {
            int count = boxes - 50;
            double extraBoxes = count * increasedTestKits;
            moneyNeededToBePayed = 50 * testKits + extraBoxes;

        }
        if ( rank.equals("r")){
            moneyNeededToBePayed = moneyNeededToBePayed + (moneyNeededToBePayed *20 /100);
        }


        return moneyNeededToBePayed;
    }


    public  void moneyReceived() {
        System.out.println("£" + boxes * testKits);
    }

   void printing(String Name, int NumberOfBoxes) {
       System.out.println(Name +  " and he sold " + NumberOfBoxes +" boxes" );

   }

}
