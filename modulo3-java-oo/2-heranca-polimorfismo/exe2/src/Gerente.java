import java.util.Scanner;

public class Gerente {
    protected String nome;
    protected String email;
    protected String senha;

    private boolean isLogged = false;
    protected boolean isAdmin = true;

    Gerente() {
        this.nome = "";
        this.email = "";
        this.senha = "";
    }
    Gerente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // getters x setters
    public String getNome() { return this.nome; }
    public String getEmail() { return this.email; }
    public String getSenha() { return this.senha; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) {this.senha = senha; }


    // methods
    public void gerarRelatorio() {
        System.out.println("Gerando relatório..");
        System.out.println("Sem dados para exibir.");
    }
    public void consultarVendas() {
        System.out.printf("O número total de vendas é de %d.%n", Vendedor.totalVendas);
    }
    protected void realizarLogin() {
        if (isLogged) {
            System.out.println("Você já está logado!");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        var nome = scanner.nextLine();
        System.out.println("Informe a senha: ");
        var password = scanner.nextLine();

        if (nome.equals(this.nome) && password.equals(this.senha)) {
            System.out.println("Login realizado com sucesso!");
            this.isLogged = true;
        } else {
            System.out.println("Credenciais incorretas!");
            this.isLogged = false;
        }
    }
    protected void realizarLogoff() {
        if (!isLogged) {
            System.out.println("ERRO: você não está logado!");
            return;
        }
        this.isLogged = false;
        System.out.println("Você saiu da sua conta.");
    }
    protected void alterarDados() {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o novo nome: ");
        String novoNome = scanner.nextLine();
        this.nome = novoNome;
        System.out.println("Usuário alterado com sucesso.");
    }
    protected void alterarSenha() {
        var scanner = new Scanner(System.in);
        System.out.println("Digite a nova senha: ");
        String newPassword = scanner.nextLine();
        this.senha = newPassword;
        System.out.println("Senha alterada com sucesso.");
    }

}
