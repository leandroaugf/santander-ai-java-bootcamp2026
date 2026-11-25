public class Alimentacao implements Produto {
    private final double valorImposto;

    Alimentacao() {this.valorImposto=1;}

    @Override
    public double calcularImposto() {
        return this.valorImposto;
    }
}
