public class Vestuario implements Produto {
    private final double valorImposto;

    Vestuario() {this.valorImposto=2.5;}

    @Override
    public double calcularImposto() {
        return this.valorImposto;
    }

}
