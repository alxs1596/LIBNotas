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
public class Horario {

    public static String getHorario(java.lang.String dni, int dia, int periodo) {
        com.ulasalle.academico.services.HorarioService service = new com.ulasalle.academico.services.HorarioService();
        com.ulasalle.academico.services.Horario port = service.getHorario();
        return port.getHorario(dni, dia, periodo);
    }
    
}
