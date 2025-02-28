//1 - Classe produto representa um pedido no sistema
//depois que o pedido e gerado, nao e admissivel altera-lo em qualquer outra parte do codigo, salvo o seu cancelamento
//por completo
public class Pedido implements Invoice{

    private String produtoId; //cada produto possui um numero de identificacao
    private double preco; //preco unitario
    private int quantidade;
    private String clienteId;
    private String discountType;
    private String notifier; // identificacao da localizacao do produto
    private double subtotal;
    private String formaPagamento;

    public Pedido(String produtoId, double preco, int quantidade, String clienteId, String discountType, String notifier, String formaPagamento) {
        this.produtoId = produtoId;
        this.preco = preco;
        this.quantidade = quantidade;
        this.clienteId = clienteId;
        this.discountType = discountType;
        this.notifier = notifier;
        this.subtotal = preco * quantidade;
        this.formaPagamento = formaPagamento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    @Override
    public String overView() {
        return "Pedido: \n" +
                "produtoId='" + produtoId + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", clienteId='" + clienteId + '\'' +
                ", discountType='" + discountType + '\'' +
                ", notifier='" + notifier + '\'' +
                ", subtotal=" + subtotal +
                ".\n";
    }
}
