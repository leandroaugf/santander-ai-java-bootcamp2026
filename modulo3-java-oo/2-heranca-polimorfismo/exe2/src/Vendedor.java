public class Vendedor extends Gerente {
    private int quantidadeVendas;
    protected static int totalVendas = 0;

    Vendedor() {
        super();
        this.isAdmin = false;
        this.quantidadeVendas = 0;
    }
    Vendedor(String nome, String email, String senha, int quantidadeVendas) {
        super(nome, email, senha);
        this.isAdmin = false;
        this.quantidadeVendas = quantidadeVendas;
    }

    // getters x setters
    public static int getTotalVendas() { return totalVendas; }

    // methods
    public void realizarVenda() {
        totalVendas++;
        this.quantidadeVendas++;
    }
    @Override
    public void consultarVendas() {
        System.out.printf("O seu número pessoal é de %d vendas", this.quantidadeVendas);
    }
}
