/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author alexis
 */
public class Usuario {

    public static String getInformacion(java.lang.String dni) {
        com.ulasalle.academico.services.UsuarioService service = new com.ulasalle.academico.services.UsuarioService();
        com.ulasalle.academico.services.Usuario port = service.getUsuario();
        return port.getInformacion(dni);
    }

    public static String getPeriodos(java.lang.String dni) {
        com.ulasalle.academico.services.UsuarioService service = new com.ulasalle.academico.services.UsuarioService();
        com.ulasalle.academico.services.Usuario port = service.getUsuario();
        return port.getPeriodos(dni);
    }

    public static boolean sesionValida(java.lang.String dni, java.lang.String password) {
        com.ulasalle.academico.services.UsuarioService service = new com.ulasalle.academico.services.UsuarioService();
        com.ulasalle.academico.services.Usuario port = service.getUsuario();
        return port.sesionValida(dni, password);
    }

    public static String setContrasena(java.lang.String dni, java.lang.String contrasena, java.lang.String nuevaContrasena) {
        com.ulasalle.academico.services.UsuarioService service = new com.ulasalle.academico.services.UsuarioService();
        com.ulasalle.academico.services.Usuario port = service.getUsuario();
        return port.setContrasena(dni, contrasena, nuevaContrasena);
    }
    
}
