public class MeiaEntrada extends Ingresso {

    public MeiaEntrada() {
        super();
    }
    public MeiaEntrada(double valor, boolean dublado, String nomeFilme) {
        super(dublado, valor/2, nomeFilme);
    }

    // method
    public double valorFinal() {
        return this.valor;
    }
}
