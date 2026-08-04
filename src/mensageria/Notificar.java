package mensageria;

public class Notificar {
    public static void main(String[] args) {
        new UsuarioService(new EmailNotificador()).registrar("João");
        System.out.println();
        new UsuarioService(new SmsNotificador()).registrar("Maria");
        System.out.println();
        new UsuarioService(new WhatsappNotificador()).registrar("Victor");
    }
}
