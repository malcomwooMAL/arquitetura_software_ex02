package utilidades.execoes;

public class CompraZeradaException extends Exception {
        String msg = "Não é possivel comprar zero itens!";
    public CompraZeradaException(){
        super("Não é possivel comprar zero itens!");
    }

}
