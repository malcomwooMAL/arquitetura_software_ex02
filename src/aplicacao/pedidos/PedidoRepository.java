package aplicacao.pedidos;

import utilidades.pagamentos.Invoice;

import java.util.ArrayList;

// 4. Classe responsável por salvar pedidos no banco de dados - sequencialmente, deve ser a ultima classe a ser invocada
public class PedidoRepository {
    //simulacao de um banco de dados utilizando um Array de Pedidos
    private ArrayList <Invoice> invoiceArray;

    public PedidoRepository() {
        this.invoiceArray = new ArrayList<Invoice>();
    }

    public ArrayList<Invoice> getInvoiceArray() {
        return invoiceArray;
    }

    public void invoiceRegister(Invoice obj){
        this.invoiceArray.add(obj);
    }


}
