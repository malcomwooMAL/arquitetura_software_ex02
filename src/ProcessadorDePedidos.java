//Classe ProcessadorDePedidos: Gerencia a criação e finalização de pedidos, utilizando os serviços de desconto e notificação.
//Aqui há
import java.util.Scanner;

public class ProcessadorDePedidos {
    public static void main(String[] args) {

        PedidoRepository pedidoRepository = new PedidoRepository();

        DescontoStrategy desconto;
        Notificator notificator;
        PaymentMethod paymentMethod;

        Scanner input = new Scanner(System.in);

        Pedido pedido;

        String produtoId, clienteId, estoqueId;
        double preco;
        int quantidade, discountType, paymentMethodOption, notifier;

        System.out.println("Bem vindo ao sistema de e-commerce da MOJ!");

        System.out.println("Informe o ID do produto:");
        produtoId = input.nextLine();

        System.out.println("Informe o preco unitário do produto:");
        preco = input.nextDouble();

        System.out.println("Informe a quantidade de produtos do pedido:");
        quantidade = input.nextInt();
        input.nextLine();

        System.out.println("Informe a ID do cliente:");
        clienteId = input.nextLine();

        System.out.println("Informe a categoria do cliente: [ 1 para normal , 2 para vip ]");
        discountType = input.nextInt();

        System.out.println("Informe como deseja ser notificado: [ 1 por email , 2 por sms ]");
        notifier = input.nextInt();

        System.out.println("Informe a forma de pagamento: [ 1 para pix , 2 por cartão e 3 para boleto ]");
        paymentMethodOption = input.nextInt();

        pedido = new Pedido(produtoId, preco, quantidade, clienteId, discountType, notifier, paymentMethodOption);

        System.out.println(pedido.overView());

        //opcao pelas escolhas
        if(pedido.getDiscountType() == 1) desconto = new DescontoClienteComum();
        else desconto = new DescontoClienteVIp();

        if(pedido.getNotifier() == 1) notificator = new EmailNotificator();
        else notificator = new SMSNotificator();

        if(pedido.getPaymentMethod() == 1) paymentMethod = new PixMethod();
        else if (pedido.getPaymentMethod() == 2) paymentMethod = new CreditCardMethod();
        else paymentMethod = new BoletoMethod();

        pedido.setNotificator(notificator);
        pedido.setPaymentM(paymentMethod);

        DiscountCalculator discountCalculator = new DiscountCalculator(desconto);
        pedido.setPrecoFinal(discountCalculator.calculateDiscount(pedido.getSubtotal()));

        System.out.println("Preco final: " + pedido.getGetPrecoFinal());

        pedido.getNotificator().runNotification();
        pedido.getPaymentM().payInvoice();

        pedidoRepository.invoiceRegister(pedido);

        System.out.println(pedidoRepository.getInvoiceArray().get(0).overView());
    }
}
