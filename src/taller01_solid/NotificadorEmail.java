public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[EMAIL] Para: " + destinatario + " | " + mensaje);
    }
}
