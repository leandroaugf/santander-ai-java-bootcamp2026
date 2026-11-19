public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);
        conta.sacar(130);
        conta.usaChequeEspecial();
        conta.depositar(100);
        conta.consultarSaldo();
        conta.sacar(500);
    }
}