/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.GestionDataBase;
import Models.Gestion;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author acher
 */
public class GestionController {
     GestionDataBase dbgestion=new GestionDataBase();
    public int Create(Gestion gestion) throws ParseException{
        
        int response=1;
        if(dbgestion.Insert(gestion)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Gestion> Select(){
        return dbgestion.Select();
    }  
    
    public int Delete (Gestion gestion)
    {
        int response=1;
         if(dbgestion.Delete(gestion)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    
    public int Update(Gestion gestion){
    int response=1;
         if(dbgestion.Update(gestion)==1){
            
        }else{
            response=0;
        }
        return response;
    }
}
