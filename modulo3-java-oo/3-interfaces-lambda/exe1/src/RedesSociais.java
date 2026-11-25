public class RedesSociais implements Mensagem {
    RedesSociais(){};

    @Override
    public void enviar(String mensagem) {
        System.out.println("Redes Sociais: " + mensagem);
    }
}
