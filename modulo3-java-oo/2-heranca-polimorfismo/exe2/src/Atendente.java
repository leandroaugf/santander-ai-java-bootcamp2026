public class Atendente extends Gerente {
    protected double valorEmCaixa;
    protected boolean caixaAberto;

    Atendente() {
        super();
        this.valorEmCaixa = 0;
        this.caixaAberto = false;
        this.isAdmin = false;
    }
    Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha);
        this.caixaAberto = false;
        this.valorEmCaixa = valorEmCaixa;
        this.isAdmin = false;
    }

    // getters x setters
    public double getValorEmCaixa() { return this.valorEmCaixa; }

    // methods
    public void receberPagamentos(double valor) {
        if (valor < 0) {
            System.out.printf("ERRO! Valor inválido.");
            return;
        }
        this.valorEmCaixa += valor;
        System.out.println("Pagamento recebido com sucesso!");
    }
    void fecharCaixa() {
        this.caixaAberto = false;
        System.out.println("O caixa foi fechado!");
    }
    void abrirCaixa() {
        this.caixaAberto = true;
        System.out.println("O caixa foi aberto!");
    }

}
