/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.models;

/**
 *
 * @author Maritza
 */
public class MensajeVisto {
    private int id_mensaje;
    private String id_usuario;

    public MensajeVisto() {
    }

    public MensajeVisto(int id_mensaje, String id_usuario) {
        this.id_mensaje = id_mensaje;
        this.id_usuario = id_usuario;
    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String usuario) {
        this.id_usuario = usuario;
    }
    
    
}