public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Ваш платеж: " + service.calculate(1, 1000_000, 9.99));
        System.out.println("Ваш платеж: " + service.calculate(2, 1000_000, 9.99));
        System.out.println("Ваш платеж: " + service.calculate(3, 1000_000, 9.99));
    }
}
