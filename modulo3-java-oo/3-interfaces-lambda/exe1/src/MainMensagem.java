public class MainMensagem {
    public static void main() {
        SMS sms = new SMS();
        Email email = new Email();
        WhatsApp whatsapp = new WhatsApp();
        RedesSociais redesSociais = new RedesSociais();

        sms.enviar("Olá.");
        email.enviar("Olá.");
        whatsapp.enviar("Olá.");
        redesSociais.enviar("Olá.");

        // Mensagem mensagem = new Mensagem();
    }
}
