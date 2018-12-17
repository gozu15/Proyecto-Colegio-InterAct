/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.HorariosDataBase;
import Models.Horarios;
import java.util.List;

/**
 *
 * @author Elvis Quiroz
 */
public class HorariosController {
    HorariosDataBase DbHorarios=new HorariosDataBase();
    public int Create(Horarios horarios){
        
        int response =DbHorarios.Insert(horarios);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }   
    public List<Horarios> Select(){
        return DbHorarios.SelectHorarios();
    }   
    
     public List<Horarios> Select(String terimo){
        return DbHorarios.BuscarHorarios(terimo);
    }  
     
    
      public Horarios Select(int id){
        return DbHorarios.SelectHorarios(id);
    }
     public int Update(Horarios horarios){
        
        int response =DbHorarios.Update(horarios);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
      public int Delete(int id){
        
        int response =DbHorarios.Delete(id);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
    
}
