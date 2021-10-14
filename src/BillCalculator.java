public class BillCalculator {


    double calculateBasicBill(double unit) {

        double basicBill = 0.0;

        if (unit <= 199) {
            basicBill = unit * 1.2;
        } else if (unit >= 200 && unit < 400) {
            basicBill = unit * 1.5;
        } else if (unit >= 400 && unit < 600) {
            basicBill = unit * 1.8;
        } else if (unit >= 600) {
            basicBill = unit * 2;
        }

        return basicBill;
    }

    double calculateSurcharge(double basicBill) {
        double surcharge = 0.0;
        if (basicBill > 400) {
            surcharge = basicBill * 0.15;
        }

        return surcharge;
    }

    double getTotalBIll(double unit){
        double basicBill = calculateBasicBill(unit);
        double surcharge = calculateSurcharge(basicBill);

        double totalBill = basicBill + surcharge;

        return totalBill;
    }
}
