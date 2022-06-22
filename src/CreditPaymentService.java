public class CreditPaymentService {
    double calculate(int creditAmount, double interestRate, int period) {
        double rate = interestRate / (100 * 12);
        double payment = creditAmount * (rate / (1 - Math.pow(1 + rate, -1 * period)));
        return payment;
    }
}
