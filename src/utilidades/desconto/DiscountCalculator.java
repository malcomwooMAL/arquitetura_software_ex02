package utilidades.desconto;

public class DiscountCalculator {

    private DescontoStrategy descontoStrategy;

    public DiscountCalculator(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calculateDiscount(double subTotal){
        return descontoStrategy.returnDiscount() * subTotal;
    }

}
