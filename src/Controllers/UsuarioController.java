/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.UsuarioDataBase;
import Models.LoginViewModel;
import Models.Usuario;
import java.util.List;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class UsuarioController {
    UsuarioDataBase DbUsuario=new UsuarioDataBase();
    public int Create(Usuario usuario){
       //  System.out.println("szdxfcghjksdfgh"); 
        String apellidos= usuario.getApellidos().replace(" ", "").toLowerCase();  
           String password= usuario.getFechaNacimiento().toString().replace("-" ,"")+apellidos; 
              
        int response =DbUsuario.Insert(usuario);
        if(response!=0){
            int idlogin=DbUsuario.CreateLogin(new LoginViewModel(usuario.getCarnet(),password,0),response);
        }else{
            response=0;
        }
        return 1;
    }
    public List<Usuario> Select(){
        return DbUsuario.SelectUsuarios();
    }   
    
     public List<Usuario> Select(String terimo){
        return DbUsuario.BuscarUsuarios(terimo);
    }  
     
    public Usuario Select(int id){
        return DbUsuario.SelectUsuario(id);
    }
     public int Update(Usuario usuario){
        
        int response =DbUsuario.Update(usuario);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
      public int Delete(int id){
        
        int response =DbUsuario.Delete(id);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
      public Usuario Login(LoginViewModel login){
          return DbUsuario.Login(login);
      }
}
