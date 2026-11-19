public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private boolean divida = false;
    private static final double TAXA_CHEQUE_ESPECIAL = 0.20;

    // constructor
    ContaBancaria(double primeiroDeposito) {
        if (primeiroDeposito >= 0) this.saldo = primeiroDeposito;
        else this.saldo = 0;
        if (primeiroDeposito <= 500) this.chequeEspecial = 50;
        else this.chequeEspecial = primeiroDeposito / 2;
    }

    // methods
    void consultarSaldo() {
        System.out.printf("SALDO: R$%.2f%n", this.saldo);
    }
    void consultarChequeEspecial() {
        System.out.printf("CHEQUE ESPECIAL: R$%.2f%n", this.chequeEspecial);
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("ERRO: valor inválido.");
            return;
        }

        double usado = this.saldo < 0 ? -this.saldo : 0;
        this.saldo += valor;

        // cobra a taxa de 20%
        if (this.divida && usado > 0) {
            double taxa = usado * TAXA_CHEQUE_ESPECIAL;
            this.saldo -= taxa;
            this.divida = false;
            System.out.printf("Taxa de cheque especial cobrada: R$%.2f%n", taxa);
        }

        System.out.println("Transação realizada com sucesso.");
    }

    void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("ERRO: operação inválida.");
        } else if (this.saldo + this.chequeEspecial < valor) {
            System.out.println("ERRO: saldo insuficiente.");
        } else {
            this.saldo -= valor;
            usoChequeEspecial();
            System.out.println("Transação realizada com sucesso.");
        }
    }

    void pagarBoleto(double valorBoleto) {
        if (valorBoleto <= 0) {
            System.out.println("ERRO: operação inválida.");
        } else if (this.saldo + this.chequeEspecial < valorBoleto) {
            System.out.println("ERRO: saldo insuficiente.");
        } else {
            this.saldo -= valorBoleto;
            usoChequeEspecial();
            System.out.println("Transação realizada com sucesso.");
        }

    }

    void usaChequeEspecial() {
        if (this.saldo < 0)
            System.out.printf("A conta usa cheque especial. (USADO: R$%.2f de R$%.2f)%n", -this.saldo, this.chequeEspecial);
        else
            System.out.println("A conta não usa cheque especial.");

    };

    private void usoChequeEspecial() {
        if (this.saldo < 0) this.divida = true;
    }
}