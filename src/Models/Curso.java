/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class Curso {
    private int id;
    private String Nombre;
    private int Horario;
    private int Aula;
    
    public Curso(int id, String Nombre, int Horario, int Aula) {
        this.id = id;
        this.Nombre = Nombre;
        this.Horario = Horario;
        this.Aula = Aula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getHorario() {
        return Horario;
    }

    public void setHorario(int Horario) {
        this.Horario = Horario;
    }
    public int getAula() {
        return Aula;
    }

    public void setAula(int Aula) {
        this.Aula = Aula;
    }
    
}
