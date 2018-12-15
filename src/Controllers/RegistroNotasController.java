/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.RegistroNotasDataBase;
import Models.Registro_Notas;
import java.util.List;

/**
 *
 * @author acher
 */
public class RegistroNotasController {
    RegistroNotasDataBase dbregnotas=new RegistroNotasDataBase();
    public int Create(Registro_Notas registronota){
        
        int response=1;
        if(dbregnotas.Insert(registronota)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Registro_Notas> Select(){
        return dbregnotas.Select();
    }  
    
    public int Delete (Registro_Notas registronota)
    {
        int response=1;
         if(dbregnotas.Delete(registronota)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    
    public int Update(Registro_Notas registronota){
    int response=1;
         if(dbregnotas.Update(registronota)==1){
            
        }else{
            response=0;
        }
        return response;
    }
}
