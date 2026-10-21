/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller01_solid;

/**
 *
 * @author ariel
 */
import java.util.Arrays;

public class Taller01_SOLID {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.agregarArticulo(new Articulo("Teclado", 10.0));
        compra.agregarArticulo(new Articulo("Mouse", 5.0));

        ServicioNotificacion notificaciones = new ServicioNotificacion(
                Arrays.asList(
                        new NotificadorEmail(),
                        new NotificadorSMS(),
                        new NotificadorSignal()   // nuevo canal sin modificar código existente
                ));

        // Con PayPal
        ProcesadorCompra procesadorPayPal = new ProcesadorCompra(
                new PagoPayPal("cliente@correo.com"),
                new CalculadoraIVA(0.15),
                new GeneradorFacturaSimple(),
                notificaciones);
        procesadorPayPal.procesar(compra, "cliente@correo.com");

        // Con tarjeta (mismo procesador, solo cambia la dependencia inyectada)
        ProcesadorCompra procesadorTarjeta = new ProcesadorCompra(
                new PagoTarjeta("4111-1111-1111-1111"),
                new CalculadoraIVA(0.15),
                new GeneradorFacturaSimple(),
                notificaciones);
        procesadorTarjeta.procesar(compra, "cliente@correo.com");
    }
}
