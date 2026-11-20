public class Ingresso {
    public boolean dublado;
    public double valor;
    public String nomeFilme;

    // constructor
    Ingresso() {
        this.dublado = false;
        this.valor = 0;
        this.nomeFilme = "";
    }
    Ingresso(boolean dublado, double valor, String nomeFilme) {
        this.dublado = dublado;
        this.valor = valor;
        this.nomeFilme = nomeFilme;
    }

    public double valorFinal() {
        return this.valor;
    }
}
