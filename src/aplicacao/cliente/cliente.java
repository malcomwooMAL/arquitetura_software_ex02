package aplicacao.cliente;

import utilidades.execoes.IdVazioException;

public interface cliente {
     String clienteId= "";
     String email ="";
    String telefone ="";
    public default cliente getClienteId() throws IdVazioException {
        return clienteId;
    }
}
