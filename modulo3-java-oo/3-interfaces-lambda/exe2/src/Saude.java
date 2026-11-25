public class Saude implements Produto {
    private final double valorImposto;

    Saude(){this.valorImposto=1.5;}

    @Override
    public double calcularImposto() {
        return this.valorImposto;
    }
}
