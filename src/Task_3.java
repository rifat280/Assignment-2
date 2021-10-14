public class Task_3 {

    public static void main(String[] args){
        BillCalculator billCalculator = new BillCalculator();

        double bill1 = billCalculator.getTotalBIll(25);

        System.out.println("Bill 1: " + bill1);

        double bill2 = billCalculator.getTotalBIll(250);

        System.out.println("Bill 2: " + bill2);

        double bill3 = billCalculator.getTotalBIll(812);

        System.out.println("Bill 3: " + bill3);


    }
}
