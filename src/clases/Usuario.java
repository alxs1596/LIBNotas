/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Convertidores;

/**
 *
 * @author alexis
 */
public class Usuario {
    private String DNI;
    private String Nombres;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Celular;
    private Date FechaNacimiento;
    private String Direccion;
    private String Correo;
    private String Imagen;

    public Usuario() {
        this.DNI = "";
        this.Nombres = "";
        this.ApellidoPaterno = "";
        this.ApellidoMaterno = "";
        this.Celular = "";
        this.FechaNacimiento = new Date();
        this.Direccion = "";
        this.Correo = "";
        this.Imagen = "";
    }

    public Usuario(String DNI, String Nombres, String ApellidoPaterno, String ApellidoMaterno, String Celular, Date FechaNacimiento, String Direccion, String Correo, String Imagen) {
        this.DNI = DNI;
        this.Nombres = Nombres;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Celular = Celular;
        this.FechaNacimiento = FechaNacimiento;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Imagen = Imagen;
    }
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    @Override
    public String toString() {
        return "Usuario{" + "DNI=" + DNI + ", Nombres=" + Nombres + ", ApellidoPaterno=" + ApellidoPaterno + ", ApellidoMaterno=" + ApellidoMaterno + ", Celular=" + Celular + ", FechaNacimiento=" + FechaNacimiento + ", Direccion=" + Direccion + ", Correo=" + Correo + ", Imagen=" + Imagen + '}';
    }
    
    
}
