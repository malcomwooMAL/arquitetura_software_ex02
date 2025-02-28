public class BoletoMethod implements PaymentMethod{
    @Override
    public void payInvoice() {
        System.out.println("Boleto payment method has been aprooved!");
    }
}
