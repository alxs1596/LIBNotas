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
public class Inasistencias {

    public static String getInasistencias(java.lang.String dni, int periodo) {
        com.ulasalle.academico.services.InasistenciasService service = new com.ulasalle.academico.services.InasistenciasService();
        com.ulasalle.academico.services.Inasistencias port = service.getInasistencias();
        return port.getInasistencias(dni, periodo);
    }
    
}
