import java.util.Scanner;
public class MainSistema {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Leandro", "leandro@email.com", "123");
        Vendedor vendedor = new Vendedor("Maria", "maria@email.com", "456", 0);
        Atendente atendente = new Atendente("Pedro", "pedro@email.com", "789", 0);

        System.out.println("GERENTE");
        gerente.realizarLogin();
        gerente.alterarSenha();
        gerente.gerarRelatorio();
        gerente.consultarVendas();
        gerente.realizarLogoff();



        System.out.println("\nVENDEDOR");
        vendedor.realizarLogin();

        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        System.out.println("\nTotal de vendas: " + Vendedor.getTotalVendas());
        vendedor.realizarLogoff();



        System.out.println("\nATENDENTE");
        atendente.realizarLogin();
        atendente.abrirCaixa();
        atendente.receberPagamentos(150.50);
        atendente.receberPagamentos(200.00);

        System.out.println("Valor em caixa: R$ " + atendente.getValorEmCaixa());
        atendente.fecharCaixa();
        atendente.alterarDados();
        atendente.realizarLogoff();

    }
}
