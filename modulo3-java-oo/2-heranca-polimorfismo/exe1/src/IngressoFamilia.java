public class IngressoFamilia extends Ingresso {
    public int numeroPessoas;

    public IngressoFamilia() {
        super();
        this.numeroPessoas = 0;
    }
    public IngressoFamilia(boolean dublado, double valor, String nomeFilme, int numeroPessoas) {
        super(dublado, valor, nomeFilme);
        this.numeroPessoas = numeroPessoas;
    }

    // method
    public double valorFinal(int numeroPessoas) {
        double value = this.valor * numeroPessoas;
        if (numeroPessoas > 3) value = (value / 100) * 95;
        return value;
    }
}
