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
public class Paralelo {
    private int id;
    private String Nombre;
    private int Idcurso;

    public Paralelo(int id, String Nombre, int NumeroDeCurso) {
        this.id = id;
        this.Nombre = Nombre;
        this.Idcurso = NumeroDeCurso;
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

    public int getIdcurso() {
        return Idcurso;
    }

    public void setIdcurso(int NumeroDeCurso) {
        this.Idcurso = NumeroDeCurso;
    }
    
    
}
