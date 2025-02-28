//Classe ProcessadorDePedidos: Gerencia a criação e finalização de pedidos, utilizando os serviços de desconto e notificação.
//Aqui há
import java.util.Scanner;

public class ProcessadorDePedidos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Notificator notificator;
        DescontoStrategy descontoStrategy;

        Pedido pedido;

        String produtoId, clienteId, discountType, estoqueId;
        double preco, subTotal;
        int quantidade, opcaoCategoria;

        System.out.println("Bem vindo ao sistema de e-commerce da MOJ!");

        System.out.println("Informe o ID do produto:");
        produtoId = input.nextLine();

        System.out.println("Informe a localizacao produto em estoque:");
        estoqueId = input.nextLine();

        System.out.println("Informe o preco unitário do produto:");
        preco = input.nextDouble();

        System.out.println("Informe a quantidade de produtos do pedido:");
        quantidade = input.nextInt();
        input.nextLine();

        System.out.println("Informe a ID do cliente:");
        clienteId = input.nextLine();

        System.out.println("Informe a categoria do cliente: [ 1 para normal , 2 para vip ]");
        opcaoCategoria = input.nextInt();
        discountType = (opcaoCategoria == 1) ? "VIP" : "Regular";

        pedido = new Pedido(produtoId, preco, quantidade, clienteId, discountType, estoqueId);

        System.out.println(pedido.overView());


    }
}
