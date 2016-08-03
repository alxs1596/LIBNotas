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
public class Calificaciones {
    private int periodo;
    private int cantidadCursos;
    private List<Curso> cursos;

    public Calificaciones() {
        this.periodo = 0;
        this.cantidadCursos = 0;
        this.cursos = new ArrayList<>();
    }

    public Calificaciones(int periodo, int cantidadCursos, List<Curso> cursos) {
        this.periodo = periodo;
        this.cantidadCursos = cantidadCursos;
        this.cursos = cursos;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getCantidadCursos() {
        return cantidadCursos;
    }

    public void setCantidadCursos(int cantidadCursos) {
        this.cantidadCursos = cantidadCursos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Calificaciones{" + "periodo=" + periodo + ", cantidadCursos=" + cantidadCursos + ", cursos=" + cursos + '}';
    }
    
    public boolean addCurso(Curso curso){
        return cursos.add(curso);
    }
    
}
