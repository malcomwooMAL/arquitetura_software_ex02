//interface que sera utilizado para deixar o codigo extensivel e customizavel

public interface Invoice {

    public String getProdutoId();

    public double getPreco() ;

    public int getQuantidade();

    public String getClienteId();

    public int getDiscountType();

    public int getNotifier();

    public int getPaymentMethod();

    public double getSubtotal();

    public double getGetPrecoFinal();

    public void setPrecoFinal(double precoFinal);

    public String overView();
}
