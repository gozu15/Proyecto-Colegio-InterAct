/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.LoginViewModel;
import Models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class UsuarioDataBase {
    public int Insert(Usuario usuario) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO usuario VALUES (?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setObject(1, null); // el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            st.setString(2, usuario.getNombre()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setString(3, usuario.getApellidos()); // el 3 indica que se sustiruira el tercer '?' por la cadena
            st.setString(4, usuario.getCarnet());                                   // "hola"
            st.setString(5, usuario.getGenero());
            st.setDate(6, usuario.getFechaNacimiento());
            st.setString(7, usuario.getTipoDeUsuario());
            // los tipos de variables deben coincidir con los tipos definidos en las
            // columnas de la tabla en la que se insertaran
            res = st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                res = rs.getInt(1);
            }

        } catch (SQLException ex) {
            // captura la excepcion
        }
        return res;

    }

    public List<Usuario> SelectUsuarios() {
        return Select("select * from usuario");
    }
       public List<Usuario> BuscarUsuarios(String termino) {
           //query = "SELECT * FROM drawings WHERE name LIKE '%" + DT + "%'";
        return Select("select * from usuario WHERE nombre_usuario LIKE '%"+termino+"%'  OR nombre_usuario LIKE '%"+termino+"%'");
    }
       
       

    public List<Usuario> Select(String query) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Usuario> usuario = new ArrayList<>();
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement(query);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuario.add(new Usuario(rs.getInt("idUSUARIO"), rs.getString("nombre_usuario"),
                        rs.getString("apellidos_usuario"),rs.getString("carnet"), rs.getString("genero"),rs.getDate("fecha_nacimiento"),rs.getString("tipo_usuario")));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return usuario;
    }

    
    public Usuario Login(LoginViewModel login){
           PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement("SELECT usuario.idUSUARIO,usuario.nombre_usuario,usuario.apellidos_usuario,usuario.carnet,usuario.genero,usuario.fecha_nacimiento,usuario.tipo_usuario FROM usuario,login WHERE login.estado=? AND login.usuario=? AND login.password=? AND usuario.idUSUARIO=login.idLOGIN;");
             ps.setInt(1, 0);
              ps.setString(2, login.getUsuario());
               ps.setString(3, login.getPassword());
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuario = new Usuario(rs.getInt("idUSUARIO"), rs.getString("nombre_usuario"),
                        rs.getString("apellidos_usuario"),rs.getString("carnet"), rs.getString("genero"),rs.getDate("fecha_nacimiento"),rs.getString("tipo_usuario"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return usuario;
    }
    public Usuario SelectUsuario(int id) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement("select * from usuario where idUSUARIO = " + id);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                usuario = new Usuario(rs.getInt("idUSUARIO"), rs.getString("nombre_usuario"),
                        rs.getString("apellidos_usuario"),rs.getString("carnet"), rs.getString("genero"),rs.getDate("fecha_nacimiento"),rs.getString("tipo_usuario"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return usuario;
    }

    public int CreateLogin(LoginViewModel login,int idUser){
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO login VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setObject(1, null); // el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            st.setString(2, login.getUsuario()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setString(3, login.getPassword()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setInt(4, idUser);
            st.setInt(5, 0);
            // los tipos de variables deben coincidir con los tipos definidos en las
            // columnas de la tabla en la que se insertaran
            res = st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                res = rs.getInt(1);
            }

        } catch (SQLException ex) {
            // captura la excepcion
        }
        return res;

    }
    public int Update(Usuario usuario) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            st = c.prepareStatement(
                    "UPDATE usuario SET nombre_usuario = ?, apellidos_usuario = ?, carnet = ?, genero = ?,fecha_nacimiento= ?, tipo_usuario= ?  WHERE idUSUARIO = ? ");
            // st.setObject(1, null); //el 1 indica que se sustituira el primer '?' con el
            // valor en int de 1234
            st.setString(1, usuario.getNombre()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setString(2, usuario.getApellidos()); // el 3 indica que se sustiruira el tercer '?' por la cadena
            st.setString(3, usuario.getCarnet());                                   // "hola"
            st.setString(4, usuario.getGenero());
            st.setDate(5, usuario.getFechaNacimiento());
            st.setString(6, usuario.getTipoDeUsuario());
            st.setInt(7, usuario.getId());
            // los tipos de variables deben coincidir con los tipos definidos en las
            // columnas de la tabla en la que se insertaran
            res = st.executeUpdate();
        } catch (SQLException ex) {
            // captura la excepcion
        }
        return res;

    }

    public int Delete(int id) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            // delete from users where id = ?
            st = c.prepareStatement("DELETE FROM usuario WHERE  idUSUARIO = ?");
            // st.setObject(1, null); //el 1 indica que se sustituira el primer '?' con el
            // valor en int de 1234
            st.setInt(1, id); // el 2 indica que se sustituira el segundo '?' por el valor en double de 123.45
            // los tipos de variables deben coincidir con los tipos definidos en las
            // columnas de la tabla en la que se insertaran
            res = st.executeUpdate();
        } catch (SQLException ex) {
            // captura la excepcion
        }
        return res;

    }
    
}
