/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Registro;
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
public class RegistroDataBase {
     public int Insert(Registro registro) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO registro VALUES (?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setObject(1, null); // el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            st.setDate(2, registro.getFechaRegistro()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setString(3, registro.getCategoriaEstudio()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setString(4, registro.getTurnoEstudio());
            st.setString(5, registro.getDescripcion());
            st.setInt(6, registro.getIdUsuario());
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

    public List<Registro> SelectRegistros() {
        return Select("select * from registro");
    }
       public List<Registro> BuscarRegistros(int termino) {
           //query = "SELECT * FROM drawings WHERE name LIKE '%" + DT + "%'";
        return Select("select * from registro WHERE USUARIO_idUSUARIO = "+termino);
    }

    public List<Registro> Select(String query) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Registro> registro = new ArrayList<>();
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement(query);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                registro.add(new Registro(rs.getInt("idREGISTRO"), rs.getDate("fecha_registro"),
                        rs.getString("categoria_estudio"), rs.getString("turno_estudio"),rs.getString("descripcion"),rs.getInt("USUARIO_idUSUARIO")));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return registro;
    }

    public Registro SelectRegistro(int id) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Registro registro = null;
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement("select * from registro where idREGISTRO = " + id);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                registro = new Registro(rs.getInt("idREGISTRO"), rs.getDate("fecha_registro"),
                        rs.getString("categoria_estudio"), rs.getString("turno_estudio"),rs.getString("descripcion"),rs.getInt("USUARIO_idUSUARIO"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return registro;
    }

    public int Update(Registro registro) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            st = c.prepareStatement(
                    "UPDATE registro SET fecha_registro = ?, categoria_estudio = ?, turno_estudio= ?,descripcion= ?, USUARIO_idUSUARIO= ?  WHERE idREGISTRO = ? ");
            // st.setObject(1, null); //el 1 indica que se sustituira el primer '?' con el
            // valor en int de 1234
            st.setDate(1, registro.getFechaRegistro()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setString(2, registro.getCategoriaEstudio()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setString(3, registro.getTurnoEstudio());
            st.setString(4, registro.getDescripcion());
            st.setInt(5, registro.getIdUsuario());
            st.setInt(6, registro.getId());
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
            st = c.prepareStatement("DELETE FROM registro WHERE  idREGISTRO = ?");
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
