/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import java.util.Date;

/**
 *
 * @author acher
 */
public class Gestion {
    private int id;
    private String yearRegistro;
    private String gestion;
    
    public Gestion(int id, String yearReg, String gestion)
    {
        this.id=id;
        this.yearRegistro=yearReg;
        this.gestion=gestion;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id)
    {
        this.id= id;
    }
    
    public String getYearRegistro()
    {
        return this.yearRegistro;
    }
    public void setYearRegistro(String yearreg)
    {
        this.yearRegistro = yearreg;
    }
    
    public String getGestion()
    {
        return this.gestion;
    }
    public void setGestion(String gestion)
    {
        this.gestion= gestion;
    }
    
    
}
