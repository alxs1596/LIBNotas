/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexis
 */
public class Curso {
    private String nombre;
    private double promedio;
    private List<Nota> notas;

    public Curso() {
        this.nombre = "";
        this.promedio = 0;
        this.notas = new ArrayList<>();
    }

    public Curso(String nombre, double promedio, List<Nota> notas) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", promedio=" + promedio + ", notas=" + notas + '}';
    }
    
    public boolean addNota(Nota nota){
        return notas.add(nota);
    }
}
