//1 - Classe produto representa um pedido no sistema
//depois que o pedido e gerado, nao e admissivel altera-lo em qualquer outra parte do codigo, salvo o seu cancelamento
//por completo
public class Pedido implements Invoice{

    //instanciacao dos Modulos
    private Notificator notificator;
    private PaymentMethod paymentM;

    public void setNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    public void setPaymentM(PaymentMethod paymentM) {
        this.paymentM = paymentM;
    }

    public Notificator getNotificator() {
        return notificator;
    }

    public PaymentMethod getPaymentM() {
        return paymentM;
    }

    //atributos de instancia preliminares
    private String produtoId; //cada produto possui um numero de identificacao
    private double preco; //preco unitario
    private int quantidade;
    private String clienteId;
    private int discountType;
    private int notifier; // identificacao da localizacao do produto
    private int paymentMethod;
    private double subtotal;

    //atributo de instancia para o calculo do preco final
    private double precoFinal;

    public Pedido(String produtoId, double preco, int quantidade, String clienteId, int discountType, int notifier, int paymentMethod) {
        this.produtoId = produtoId;
        this.preco = preco;
        this.quantidade = quantidade;
        this.clienteId = clienteId;
        this.discountType = discountType;
        this.notifier = notifier;
        this.paymentMethod = paymentMethod;
        this.subtotal = this.preco * this.quantidade;
    }

    public String getProdutoId() {
        return produtoId;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getClienteId() {
        return clienteId;
    }

    public int getDiscountType() {
        return discountType;
    }

    public int getNotifier() {
        return notifier;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getGetPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal){
        this.precoFinal = precoFinal;
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
                ", paymentMethod='" + paymentMethod + '\'' +
                ", subtotal=" + subtotal +
                ".\n";
    }

    //executar após os dados estarem já inseridos no banco de dados

  }
