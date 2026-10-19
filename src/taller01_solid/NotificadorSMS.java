public class NotificadorSMS implements Notificador {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[SMS] Para: " + destinatario + " | " + mensaje);
    }
}

