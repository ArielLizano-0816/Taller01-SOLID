import java.util.ArrayList;
import java.util.List;

public class ServicioNotificacion {
    private final List<Notificador> notificadores = new ArrayList<>();

    public ServicioNotificacion(List<Notificador> notificadores) {
        this.notificadores.addAll(notificadores);
    }

    public void agregarNotificador(Notificador notificador) {
        notificadores.add(notificador);
    }

    public void notificar(String destinatario, String mensaje) {
        for (Notificador n : notificadores) {
            n.enviar(destinatario, mensaje);
        }
    }
}
