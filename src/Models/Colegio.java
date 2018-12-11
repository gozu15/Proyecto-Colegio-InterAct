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
public class Colegio {
    private int id;
    private String Nombre;
    private int NumeroDeParalelos;

    public Colegio(int id, String Nombre, int NumeroDeParalelos) {
        this.id = id;
        this.Nombre = Nombre;
        this.NumeroDeParalelos = NumeroDeParalelos;
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

    public int getNumeroDeParalelos() {
        return NumeroDeParalelos;
    }

    public void setNumeroDeParalelos(int NumeroDeParalelos) {
        this.NumeroDeParalelos = NumeroDeParalelos;
    }
    
}
