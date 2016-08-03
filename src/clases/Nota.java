/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author alexis
 */
public class Nota {
    private String nombre;
    private int codigo;
    private double nota;
    private double porcentaje;
    
    public Nota() {
        this.nombre = "";
        this.codigo = 0;
        this.nota = 0;
        this.porcentaje = 0;
    }

    public Nota(String nombre, int codigo, double nota, double porcentaje) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota = nota;
        this.porcentaje = porcentaje;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nota{" + "nombre=" + nombre + ", codigo=" + codigo + ", nota=" + nota + ", porcentaje=" + porcentaje + '}';
    }

    

    
}
