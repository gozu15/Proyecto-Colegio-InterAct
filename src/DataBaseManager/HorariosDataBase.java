/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Horarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elvis Quiroz
 */
public class HorariosDataBase {
    public int Insert(Horarios horarios) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO horarios VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setObject(1, null); // el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            st.setString(2, horarios.getHora()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            // los tipos de variables deben coincidir con los tipos definidos en las
            // columnas de la tabla en la que se insertaran
            res = st.executeUpdate();

        } catch (SQLException ex) {
            // captura la excepcion
        }
        return res;

    }
     public List<Horarios> SelectHorarios() {
        return Select("select * from horarios");
    }
       public List<Horarios> BuscarHorarios(String termino) {
           //query = "SELECT * FROM drawings WHERE name LIKE '%" + DT + "%'";
        return Select("select * from horarios WHERE hora LIKE '%"+termino+"%'");
    }

    public List<Horarios> Select(String query) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Horarios> horarios = new ArrayList<>();
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement(query);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                horarios.add(new Horarios(rs.getInt("idHORARIOS"), rs.getString("hora")));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return horarios;
    }

    public Horarios SelectHorarios(int id) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Horarios horarios = null;
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement("select * from horarios where idHorarios = " + id);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                horarios = new Horarios(rs.getInt("idHORARIOS"), rs.getString("hora"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return horarios;
    }

    public int Update(Horarios horarios) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            st = c.prepareStatement(
                    "UPDATE horarios SET idHORARIOS = ?, hora = ? WHERE idHORARIOS=?");
            // st.setObject(1, null); //el 1 indica que se sustituira el primer '?' con el
            // valor en int de 1234
            st.setInt(1, horarios.getId()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setString(2, horarios.getHora());
            st.setInt(3, horarios.getId());// el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola
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
            st = c.prepareStatement("DELETE FROM horarios WHERE  idHORARIOS = ?");
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
