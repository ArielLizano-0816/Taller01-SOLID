package taller01_solid;

public class NotificadorSignal implements Notificador {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[SIGNAL] Para: " + destinatario + " | " + mensaje);
    }
}
