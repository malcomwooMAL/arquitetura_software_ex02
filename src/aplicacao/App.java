package aplicacao;

import aplicacao.pedidos.Pedido;
import aplicacao.pedidos.PedidoRepository;
import aplicacao.pedidos.ProcessadorDePedidos;
import utilidades.desconto.DescontoClienteComum;
import utilidades.desconto.DescontoClienteVIp;
import utilidades.desconto.DescontoStrategy;
import utilidades.notificaocoes.SMSNotificator;
import utilidades.pagamentos.BoletoMethod;
import utilidades.pagamentos.CreditCardMethod;
import utilidades.pagamentos.PaymentMethod;
import utilidades.pagamentos.PixMethod;
import utilidades.notificaocoes.EmailNotificator;
import utilidades.pagamentos.Invoice;
import utilidades.notificaocoes.Notificator;

import java.util.Scanner;

public class App {
    //Classe aplicacao.pedidos.ProcessadorDePedidos: Gerencia a criação e finalização de pedidos, utilizando os serviços de desconto e notificação.
//Aqui há

        public static void main(String[] args) {

            PedidoRepository pedidoRepository = new PedidoRepository();

            DescontoStrategy desconto;
            Notificator notificator;
            PaymentMethod paymentMethod;

            Scanner input = new Scanner(System.in);

            Invoice invoice;

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

            invoice = new Pedido(produtoId, preco, quantidade, clienteId, discountType, notifier, paymentMethodOption);

            System.out.println(invoice.overView());

            //opcao pelas escolhas
            if(invoice.getDiscountType() == 1) desconto = new DescontoClienteComum();
            else desconto = new DescontoClienteVIp();

            if(invoice.getNotifier() == 1) notificator = new EmailNotificator();
            else notificator = new SMSNotificator();

            if(invoice.getPaymentMethod() == 1) paymentMethod = new PixMethod();
            else if (invoice.getPaymentMethod() == 2) paymentMethod = new CreditCardMethod();
            else paymentMethod = new BoletoMethod();

            ProcessadorDePedidos processadorDePedidos = new ProcessadorDePedidos(invoice,desconto,notificator,paymentMethod);

            processadorDePedidos.processInvoice(); //processar o pedido

            pedidoRepository.invoiceRegister(invoice); // registrar o pedido no banco de dados

            System.out.println(pedidoRepository.getInvoiceArray().get(0).overView()); // teste do "banco de dados"
        }
    }




