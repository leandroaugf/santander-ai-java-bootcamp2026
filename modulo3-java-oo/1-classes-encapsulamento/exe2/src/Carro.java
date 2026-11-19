public class Carro {
    public enum Direcao {
        DIREITA,
        ESQUERDA,
        RETO
    }

    private static final int VELOCIDADE_MAXIMA = 120;
    private static final int MARCHA_MAXIMA = 6;
    private static final int FAIXA_POR_MARCHA = 20;

    // attributes
    private int marcha;
    private boolean ligado;
    private int velocidade;
    private Direcao direcao;

    // constructor
    Carro() {
        this.marcha = 0;
        this.velocidade = 0;
        this.ligado = false;
        this.direcao = Direcao.RETO;
    }

    // methods
    void ligarCarro() {
        if (this.ligado) {
            System.out.println("O carro já está ligado.");
        } else {
            this.ligado = true;
            System.out.println("O carro foi ligado!");
        }
    }

    void desligarCarro() {
        if (!this.ligado) {
            System.out.println("O carro já está desligado.");
        } else if (this.velocidade != 0) {
            System.out.println("ERRO! o carro ainda está andando.");
        } else if (this.marcha != 0) {
            System.out.println("ERRO! o carro não está no ponto morto.");
        } else {
            this.ligado = false;
            System.out.println("O carro foi desligado.");
        }
    }

    void acelerar() {
        if (!verificarLigado()) return;

        if (this.marcha == 0) {
            System.out.println("ERRO! o carro está em ponto morto.");
        } else if (this.velocidade >= VELOCIDADE_MAXIMA) {
            System.out.println("Você já está na velocidade máxima!");
        } else if (this.velocidade + 1 > limiteMaximo(this.marcha)) {
            System.out.println("ERRO! limite da marcha atingido, suba a marcha.");
        } else {
            this.velocidade++;
            System.out.println("Acelerando...");
        }
    }

    void desacelerar() {
        if (!verificarLigado()) return;

        if (this.velocidade <= 0) {
            System.out.println("O carro já está parado.");
        } else if (this.marcha != 0 && this.velocidade - 1 < limiteMinimo(this.marcha)) {
            System.out.println("ERRO! limite da marcha atingido, reduza a marcha.");
        } else {
            this.velocidade--;
            System.out.println("Desacelerando...");
        }
    }

    void virarDireita() {
        virar(Direcao.DIREITA);
    }

    void virarEsquerda() {
        virar(Direcao.ESQUERDA);
    }

    void endireitar() {
        if (!verificarLigado()) return;
        this.direcao = Direcao.RETO;
        System.out.println("Seguindo reto.");
    }

    void verificarVelocidade() {
        if (!verificarLigado()) return;
        System.out.printf("Você está a %d km/h.%n", this.velocidade);
    }

    void trocarMarcha(int marchaAlvo) {
        if (!verificarLigado()) return;

        if (marchaAlvo < 0 || marchaAlvo > MARCHA_MAXIMA) {
            System.out.println("ERRO! marcha inexistente (use de 0 a " + MARCHA_MAXIMA + ").");
        } else if (marchaAlvo == this.marcha) {
            System.out.println("O carro já está nessa marcha.");
        } else if (Math.abs(marchaAlvo - this.marcha) != 1) {
            System.out.println("ERRO! não é permitido pular marchas.");
        } else if (marchaAlvo != 0 && !velocidadeCompativel(marchaAlvo)) {
            System.out.println("ERRO! velocidade incompatível com a marcha " + marchaAlvo + ".");
        } else {
            this.marcha = marchaAlvo;
            System.out.println("Marcha alterada para " + marchaAlvo + ".");
        }
    }

    // private helpers
    private void virar(Direcao novaDirecao) {
        if (!verificarLigado()) return;

        if (this.velocidade < 1 || this.velocidade > 40) {
            System.out.println("ERRO! só é possível virar entre 1 e 40 km/h.");
        } else {
            this.direcao = novaDirecao;
            System.out.println("Virando para a " + (novaDirecao == Direcao.DIREITA ? "direita" : "esquerda") + "..");
        }
    }

    private boolean verificarLigado() {
        if (!this.ligado) {
            System.out.println("ERRO! ligue o carro primeiro.");
            return false;
        }
        return true;
    }

    private int limiteMaximo(int marcha) {
        return marcha * FAIXA_POR_MARCHA;
    }

    private int limiteMinimo(int marcha) {
        return marcha == 1 ? 0 : (marcha - 1) * FAIXA_POR_MARCHA + 1;
    }

    // tolerância de 1 km/h
    private boolean velocidadeCompativel(int marcha) {
        return this.velocidade >= limiteMinimo(marcha) - 1
                && this.velocidade <= limiteMaximo(marcha) + 1;
    }
}