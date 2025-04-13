package paymentFlow;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Pay to merchant");
    }

    public void debitAmount() {
        System.out.println("Debit Amount from merchant");
    }

    public void calculateFees() {
        System.out.println("Calculate fees from merchant");
    }

    public void creditAmount() {
        System.out.println("Credit Amount from merchant");
    }
}
