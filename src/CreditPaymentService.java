public class CreditPaymentService {
    public int calculate(int amount, int year) {
        int month = 0;
        if (year == 1) {
            month = 12;
        }
        if (year == 2) {
            month = 24;
        }
        if (year == 3) {
            month = 36;
        }

        double ps = 9.99 / (100 * 12); //месячная процентная ставка;
        double a = 1 + ps;
        double b = month;
        double p; //размер ежемесечного платежа;
        p = amount * ((ps * Math.pow(a, b)) / (Math.pow(a, b) - 1));
        int pay = (int) p;
        return pay;
    }
}

