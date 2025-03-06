package utilidades.pagamentos;//interface que sera utilizado para deixar o codigo extensivel e customizavel
import utilidades.execoes.CompraZeradaException;
import aplicacao.cliente.cliente;
import utilidades.execoes.IdVazioException;

public interface Invoice {

    public String getProdutoId()throws IdVazioException;

    public double getPreco() ;

    public int getQuantidade() throws CompraZeradaException;

    public cliente getClienteId() throws IdVazioException;

    public int getDiscountType();

    public int getNotifier();

    public int getPaymentMethod();

    public double getSubtotal();

    public double getGetPrecoFinal();

    public void setPrecoFinal(double precoFinal);

    public String overView();
}
