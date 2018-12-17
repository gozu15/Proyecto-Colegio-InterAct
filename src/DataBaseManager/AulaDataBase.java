/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Aula;
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
public class AulaDataBase {
    public int Insert(Aula aula) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO aula VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setObject(1, null); // el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            st.setString(2, aula.getNombre()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setString(3, aula.getDescripcion()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            // los tipos de variables deben coincidir con los tipos definidos en las
            // columnas de la tabla en la que se insertaran
            res = st.executeUpdate();

        } catch (SQLException ex) {
            // captura la excepcion
        }
        return res;

    }

    public List<Aula> SelectAula() {
        return Select("select * from aula");
    }
       public List<Aula> BuscarAula(String termino) {
           //query = "SELECT * FROM drawings WHERE name LIKE '%" + DT + "%'";
        return Select("select * from aula WHERE nombre_aula LIKE '%"+termino+"%'");
    }

    public List<Aula> Select(String query) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Aula> aula = new ArrayList<>();
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement(query);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                aula.add(new Aula(rs.getInt("idAULA"), rs.getString("nombre_aula"),
                        rs.getString("descripcion")));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return aula;
    }

    public Aula SelectAula(int id) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Aula aula = null;
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement("select * from aula where idAULA = " + id);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                aula = new Aula(rs.getInt("idAULA"), rs.getString("nombre_aula"),
                        rs.getString("descripcion"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return aula;
    }

    public int Update(Aula aula) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            st = c.prepareStatement(
                    "UPDATE aula SET nombre_aula = ?, descripcion = ? WHERE idAULA = ? ");
            // st.setObject(1, null); //el 1 indica que se sustituira el primer '?' con el
            // valor en int de 1234
            st.setString(1, aula.getNombre()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setString(2, aula.getDescripcion()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            
            st.setInt(3, aula.getId());
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
            st = c.prepareStatement("DELETE FROM aula WHERE  idAULA = ?");
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
