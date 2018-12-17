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
public class LoginViewModel {
  private String Usuario;
  private String password;   
  private int estado;

    public LoginViewModel(String Usuario, String password, int estado) {
        this.Usuario = Usuario;
        this.password = password;
        this.estado = estado;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
  
  
}
