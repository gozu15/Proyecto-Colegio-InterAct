/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.AulaDataBase;
import Models.Aula;
import java.util.List;

/**
 *
 * @author Elvis Quiroz
 */
public class AulaController {
    AulaDataBase DbAula=new AulaDataBase();
    public int Create(Aula aula){
        
        int response =DbAula.Insert(aula);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Aula> Select(){
        return DbAula.SelectAula();
    }   
    
     public List<Aula> Select(String terimo){
        return DbAula.BuscarAula(terimo);
    }  
     
    public Aula Select(int id){
        return DbAula.SelectAula(id);
    }
     public int Update(Aula aula){
        
        int response =DbAula.Update(aula);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
      public int Delete(int id){
        
        int response =DbAula.Delete(id);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
}
