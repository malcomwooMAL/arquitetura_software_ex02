package utilidades.pagamentos;

public class CreditCardMethod implements PaymentMethod {
    @Override
    public void payInvoice() {
        System.out.println("Credit Card payment method has been aprooved!");
    }
}
