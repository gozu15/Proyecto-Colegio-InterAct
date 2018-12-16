/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author acher
 */
public class Tiempo_Evaluacion {
    
    private int id;
    private String tiempo_evaluacion;
    
    public Tiempo_Evaluacion(int id, String tiempo_eval){
        this.id = id;
        this.tiempo_evaluacion = tiempo_eval;
    
    }
    
    public int getId()
    {
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getTiempo()
    {
        return this.tiempo_evaluacion;
    }
    
    public void setId(String tiempo_ev)
    {
        this.tiempo_evaluacion=tiempo_ev;
    }
}
