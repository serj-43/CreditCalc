public class CreditPaymentService {
    int calculate(int period, double summ, double rate) {
        rate = rate / 100 / 12;
        period = 12 * period;
        summ = summ * rate * Math.pow((rate + 1), period) / (Math.pow((rate + 1), period) - 1);
        return (int) summ;
    }
}
