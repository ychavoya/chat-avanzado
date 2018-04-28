package chat.paquetes.requests;

import chat.exceptions.PaqueteException;
import chat.paquetes.models.Paquete;
import chat.server.log.ServerLog;

/**
 * Solicitud de registro
 * 
 * El cliente lo envía cuando requiere registrar un nuevo usuario
 * 
 * @author Yael Arturo Chavoya Andalón 14300094
 */
public class RegisterRequest extends Paquete {

    // Orden que identifica al tipo de paquete
    public static final String ORDEN = "request-register";

    // Parámetros
    public static final String PARAM_USERNAME = "username";
    public static final String PARAM_NAME = "name";
    public static final String PARAM_PASSWORD = "password";

    public RegisterRequest(String username, String name, String password) {
        super(ORDEN);
        try {
            this.addParam(PARAM_USERNAME, username);
            this.addParam(PARAM_NAME, name);
            this.addParam(PARAM_PASSWORD, password);
        } catch (PaqueteException ex) {
            ServerLog.log(RegisterRequest.class, ex.getMessage());
        }

    }

}
