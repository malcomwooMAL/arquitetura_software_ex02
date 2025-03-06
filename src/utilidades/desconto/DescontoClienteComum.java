package utilidades.desconto;

public class DescontoClienteComum implements DescontoStrategy {
    @Override
    public double returnDiscount() {
        return 0.95;
    }
}
