//Classe ProcessadorDePedidos: Gerencia a criação e finalização de pedidos, utilizando os serviços de desconto e notificação.
//Aqui há
import java.util.Scanner;

public class ProcessadorDePedidos {

    //receber o pedido como objeto
    private Invoice invoice;

    //utilizar os servicos de baixo nível
    private DescontoStrategy descontoStrategy;
    private Notificator notificator;
    private PaymentMethod paymentMethod;

    public ProcessadorDePedidos(Invoice invoice, DescontoStrategy descontoStrategy, Notificator notificator, PaymentMethod paymentMethod) {
        this.invoice = invoice;
        this.descontoStrategy = descontoStrategy;
        this.notificator = notificator;
        this.paymentMethod = paymentMethod;
    }

    public void processInvoice (){

        DiscountCalculator discountCalculator = new DiscountCalculator(this.descontoStrategy);

        invoice.setPrecoFinal(discountCalculator.calculateDiscount(invoice.getSubtotal()));
        System.out.printf("Preço final calculado do pedido: %.2f\n", invoice.getGetPrecoFinal());

        notificator.runNotification(); // notificar via escolhida pelo usuário...
        paymentMethod.payInvoice(); //acionar o método de pagamento

    }


}
