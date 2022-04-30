public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        for (int i = 1; i < 4; i++) {
            System.out.println("Ваш платеж: " + service.calculate(i, 1000_000, 9.99));
        }
    }
}
