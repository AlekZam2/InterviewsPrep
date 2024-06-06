public class classExample {
    public static void main(String[] args) {

        stores huston = new stores(0.87,429,0.99,534);
        stores orlando = new stores(0.91,842,0.86,765);
        stores seattle = new stores(0.79,398,0.77,402);


        System.out.println(orlando.grossRevenue());
        System.out.println(huston.grossRevenue());
        System.out.println(seattle.grossRevenue());

        System.out.println(orlando.appleRevenueTarget(744));



    }



}

class stores{

    double orangePrice;
    int orangesSoldPerYear;
    double applesPrice;
    int applesSoldPerYear;

    stores (double oP, int oSPY, double aP, int aSPY){
        orangePrice = oP;
        orangesSoldPerYear = oSPY;
        applesPrice = aP;
        applesSoldPerYear = aSPY;

    }

    double grossRevenue(){
        double revenue = (orangesSoldPerYear * orangePrice) + (applesSoldPerYear * applesPrice);
        return revenue;
    }

    double appleRevenueTarget(double applesTargetNeededSales){
        double applesNeededToReachTarget = applesTargetNeededSales / applesPrice;
        return applesNeededToReachTarget;


    }
    double orangeRevenueTarget(double orangeTargetNeededSales){

        double orangesNeededToReachTarget = orangeTargetNeededSales / orangePrice;
        return orangesNeededToReachTarget;

    }
}
