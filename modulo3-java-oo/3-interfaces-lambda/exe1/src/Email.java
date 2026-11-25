public class Email implements Mensagem {
    Email(){}

    @Override
    public void enviar(String mensagem) {
        System.out.println("Email: " + mensagem);
    }
}
