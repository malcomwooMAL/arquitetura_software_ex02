package utilidades.pagamentos;

public class PixMethod implements PaymentMethod {
    @Override
    public void payInvoice() {
        System.out.println("Pix payment method has been aprooved!");
    }
}
