package aplicacao.pedidos;


import aplicacao.cliente.cliente;
import utilidades.execoes.CompraZeradaException;
import utilidades.execoes.IdVazioException;
import utilidades.pagamentos.PaymentMethod;
import utilidades.pagamentos.Invoice;
import utilidades.notificaocoes.Notificator;

//1 - Classe produto representa um pedido no sistema
//depois que o pedido e gerado, nao e admissivel altera-lo em qualquer outra parte do codigo, salvo o seu cancelamento
//por completo
public class Pedido implements Invoice{

    //instanciacao dos Modulos
    private Notificator notificator;
    private PaymentMethod paymentM;
    private cliente clienteId;
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

        this.discountType = discountType;
        this.notifier = notifier;
        this.paymentMethod = paymentMethod;
        this.subtotal = this.preco * this.quantidade;
    }

    public String getProdutoId() throws IdVazioException {
      if(produtoId == null){
          throw new IdVazioException();
      }
        return produtoId;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() throws CompraZeradaException{

          if(quantidade == 0) {
              throw new CompraZeradaException();
          }
          return quantidade;




    }

    public cliente getClienteId() throws IdVazioException {

      if(clienteId == null) {
          throw new IdVazioException();
      }
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
        return "aplicacao.pedidos.Pedido: \n" +
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
