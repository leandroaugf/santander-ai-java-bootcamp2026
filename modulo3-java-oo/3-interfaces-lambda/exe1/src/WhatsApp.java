public class WhatsApp implements Mensagem {
    WhatsApp() {}

    @Override
    public void enviar(String mensagem) {
        System.out.println("WhatsApp: " + mensagem);
    }
}
