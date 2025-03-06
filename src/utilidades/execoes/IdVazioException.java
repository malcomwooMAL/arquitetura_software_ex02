package utilidades.execoes;

public class IdVazioException extends Exception {
    String msg = "Não é possivel continuar a operação sem um ID!";
    public IdVazioException(){
        super("Não é possivel continuar a operação sem um ID!");
    }

}