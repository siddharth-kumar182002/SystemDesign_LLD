package paymentFlow;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void creditAmount();
    public abstract void debitAmount();

    public final void sendMoney(){
        validateRequest();

        debitAmount();


        calculateFees();


        creditAmount();

    }


}
