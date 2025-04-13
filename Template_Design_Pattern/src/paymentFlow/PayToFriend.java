package paymentFlow;

public class PayToFriend extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Pay to Friend");
    }

    public void debitAmount() {
        System.out.println("Debit Amount from friend");
    }

    public void calculateFees() {
        System.out.println("Calculate fees from friend");
    }

    public void creditAmount() {
        System.out.println("Credit Amount from friend");
    }

}
