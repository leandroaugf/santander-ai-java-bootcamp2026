public class MainCarro {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.acelerar();          // erro: desligado
        c.ligarCarro();
        c.acelerar();          // erro: ponto morto
        c.trocarMarcha(2);     // erro: pular marcha
        c.trocarMarcha(1);
        for (int i = 0; i < 21; i++) c.acelerar(); // para em 20 km/h
        c.trocarMarcha(2);
        c.acelerar();          // 21 km/h
        c.virarDireita();
        c.verificarVelocidade();
        c.desligarCarro();     // erro: ainda andando
    }
}