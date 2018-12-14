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
    private Date yearRegistro;
    private char gestion;
    
    public Gestion(int id, Date yearReg, char gestion)
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
    
    public Date getYearRegistro()
    {
        return this.yearRegistro;
    }
    public void setYearRegistro(Date yearreg)
    {
        this.yearRegistro = yearreg;
    }
    
    public char getGestion()
    {
        return this.gestion;
    }
    public void setGestion(char gestion)
    {
        this.gestion= gestion;
    }
    
    
}
