public class Cultura implements Produto {
    private final double valorImposto;

    Cultura() {this.valorImposto=4;}

    @Override
    public double calcularImposto() {
        return this.valorImposto;
    }
}
