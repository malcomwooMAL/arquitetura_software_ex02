import java.util.ArrayList;

// 4. Classe responsável por salvar pedidos no banco de dados - sequencialmente, deve ser a ultima classe a ser invocada
public class PedidoRepository {
    //simulacao de um banco de dados utilizando um Array de Pedidos
    private ArrayList <Pedido> invoiceArray;

    public void

    public void invoiceRegister(Pedido obj){
        this.invoiceArray.add(obj);
    }
}
