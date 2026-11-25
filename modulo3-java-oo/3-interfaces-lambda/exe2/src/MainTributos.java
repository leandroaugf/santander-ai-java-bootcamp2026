public class MainTributos {
    public static void main(String[] args) {

        Produto alimentacao = new Alimentacao();
        Produto saude = new Saude();
        Produto vestuario = new Vestuario();
        Produto cultura = new Cultura();

        System.out.println("Alimentação: " + alimentacao.calcularImposto() + "%");
        System.out.println("Saúde e bem-estar: " + saude.calcularImposto() + "%");
        System.out.println("Vestuário: " + vestuario.calcularImposto() + "%");
        System.out.println("Cultura: " + cultura.calcularImposto() + "%");
    }
}