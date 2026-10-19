/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller01_solid;

/**
 *
 * @author ariel
 */
public class Notificacion {
    private int tipoNotificacion;
    
    public void notificar(Pago pago){
        if(tipoNotificacion == 1){
            //enviarEmail();
        }
        else{
            //enviarSMS();
        }
    }
}
