import paymentFlow.PayToFriend;
import paymentFlow.PayToMerchant;
import paymentFlow.PaymentFlow;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

PaymentFlow flow1=new PayToMerchant();
flow1.sendMoney();
    }
}