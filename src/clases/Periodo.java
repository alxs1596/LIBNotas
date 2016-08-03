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
public class Periodo {
    private int codigo;
    private String Nombre;

    public Periodo() {
    }

    public Periodo(int codigo, String Nombre) {
        this.codigo = codigo;
        this.Nombre = Nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Periodo{" + "codigo=" + codigo + ", Nombre=" + Nombre + '}';
    }
    
}
