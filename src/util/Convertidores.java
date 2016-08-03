/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import clases.Calificaciones;
import clases.Curso;
import clases.Nota;
import clases.Periodo;
import clases.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexis
 */
public class Convertidores {
    public static Date StringToDate(String fechaString) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.parse(fechaString);
    }
    
    public static String IntToNombreNota(int codigoNota){
        switch(codigoNota){
            case 1:
                return "Parcial";
            case 2:
                return "Final";
            case 3:
                return "Permanente 1";
            case 4:
                return "Permanente 2";
            case 5:
                return "Evidencia 1";
            case 6:
                return "Evidencia 2";
            case 7:
                return "Evidencia 3";
            case 8:
                return "Evidencia 4";
        }
        return "";
    }
    
    public static Usuario StringToUsuario(String usuarioString){
        try {
            
            Usuario usuario = new Usuario();
            
            String[] datos = usuarioString.split(util.Separadores.sep1String);
            
            usuario.setDNI(datos[0]);
            usuario.setNombres(datos[1]);
            usuario.setApellidoPaterno(datos[2]);
            usuario.setApellidoMaterno(datos[3]);
            usuario.setCelular(datos[4]);
            
            datos[5] = datos[5].replaceAll("_", "");
            if (!"".equals(datos[5].trim()))
                usuario.setFechaNacimiento(StringToDate(datos[5]));
            else
                usuario.setFechaNacimiento(null);
            usuario.setDireccion(datos[6]);
            usuario.setCorreo(datos[7]);
            usuario.setImagen(datos[8]);
            
            return usuario;
            
        } catch (ParseException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public static List<Periodo> StringToPeriodos(String periodosString){
        List<Periodo> periodos = new ArrayList<>();
        
        String [] arrayPeriodosString = periodosString.split(util.Separadores.sep2String);
        
        for (String periodoString : arrayPeriodosString) {
            Periodo periodo = new Periodo();
            String[] datos = periodoString.split(util.Separadores.sep1String);
            periodo.setNombre(datos[0]);
            periodo.setCodigo(Integer.parseInt(datos[1]));
            periodos.add(periodo);
        }
        
        return periodos;
        
    }
    
    public static Calificaciones StringToCalificaciones(String calificacionesString){
        
        Calificaciones calificaciones = new Calificaciones();
        
        String [] datosCalificaciones = calificacionesString.split(util.Separadores.sep3String);
        
        calificaciones.setPeriodo(Integer.parseInt(datosCalificaciones[0]));
        calificaciones.setCantidadCursos(Integer.parseInt(datosCalificaciones[1]));
        
        for (int i = 2; i < datosCalificaciones.length; i++){
            Curso curso = new Curso();
            
            String[] cursoArray = datosCalificaciones[i].split(util.Separadores.sep1String);
            
            curso.setNombre(cursoArray[0]);
            curso.setPromedio(Double.parseDouble(cursoArray[1]));
            
            String[] notasArray = cursoArray[2].split(util.Separadores.sep2String);
            String[] porcentajesArray = cursoArray[3].split(util.Separadores.sep2String);
            
            for (int x = 0; x < notasArray.length; x++) {
                Nota nota = new Nota();
                String[] datosNotaString = notasArray[x].split(util.Separadores.sep4String);
                String[] datosPorcentajesString = porcentajesArray[x].split(util.Separadores.sep4String);
                nota.setCodigo(Integer.parseInt(datosNotaString[0]));
                nota.setNombre(IntToNombreNota(nota.getCodigo()));
                nota.setNota(Double.parseDouble(datosNotaString[1]));
                nota.setPorcentaje(Double.parseDouble(datosPorcentajesString[1]));
                curso.addNota(nota);
            }

            calificaciones.addCurso(curso);
        }
        return calificaciones;
    }
}
