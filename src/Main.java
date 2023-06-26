public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment1 = service.calculate(1_000_000, 1);
        int payment2 = service.calculate(1_000_000, 2);
        int payment3 = service.calculate(1_000_000, 3);
        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);
    }
}
