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
public class Calificacion {

    public static String getCalificaciones(java.lang.String dni, int periodo) {
        com.ulasalle.academico.services.CalificacionService service = new com.ulasalle.academico.services.CalificacionService();
        com.ulasalle.academico.services.Calificacion port = service.getCalificacion();
        return port.getCalificaciones(dni, periodo);
    }

    public static String getMatricula(java.lang.String dni, int periodo) {
        com.ulasalle.academico.services.CalificacionService service = new com.ulasalle.academico.services.CalificacionService();
        com.ulasalle.academico.services.Calificacion port = service.getCalificacion();
        return port.getMatricula(dni, periodo);
    }

    public static String getNotas(java.lang.String dni, int periodo) {
        com.ulasalle.academico.services.CalificacionService service = new com.ulasalle.academico.services.CalificacionService();
        com.ulasalle.academico.services.Calificacion port = service.getCalificacion();
        return port.getNotas(dni, periodo);
    }
    
}
