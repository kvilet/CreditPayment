public class CreditPaymentService {
    public int calculate(int amount, int year) {
        int month = 12 * year;

        double ps = 9.99 / (100 * 12); //месячная процентная ставка;
        double a = 1 + ps;
        double b = month;
        double p; //размер ежемесечного платежа;
        p = amount * ((ps * Math.pow(a, b)) / (Math.pow(a, b) - 1));
        int pay = (int) p;
        return pay;
    }
}

