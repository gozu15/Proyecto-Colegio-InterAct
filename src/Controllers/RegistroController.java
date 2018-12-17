/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.RegistroDataBase;
import Models.Registro;
import Models.Usuario;
import java.util.List;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class RegistroController {
      RegistroDataBase DbRegistro=new RegistroDataBase();
    public int Create(Registro registro){
        
        int response =DbRegistro.Insert(registro);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Registro> Select(){
        return DbRegistro.SelectRegistros();
    }   
    
     public List<Registro> BuscarPorIdUsuario(int idusuario){
        return DbRegistro.BuscarRegistros(idusuario);
    }  
     
    public Registro Select(int id){
        return DbRegistro.SelectRegistro(id);
    }
     public int Update(Registro registro){
        
        int response =DbRegistro.Update(registro);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
      public int Delete(int id){
        
        int response =DbRegistro.Delete(id);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
}
