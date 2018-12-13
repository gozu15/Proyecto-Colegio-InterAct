/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Materia;
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
public class MateriaDataBase {
    public int Insert(Materia materia) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO materia VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setObject(1, null); // el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            st.setString(2, materia.getNombre()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setString(3, materia.getDescripcion()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setString(4, materia.getOtros());
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

    public List<Materia> SelectMaterias() {
        return Select("select * from materia");
    }
       public List<Materia> BuscarMaterias(String termino) {
           //query = "SELECT * FROM drawings WHERE name LIKE '%" + DT + "%'";
        return Select("select * from materia WHERE nombre_materia LIKE '%"+termino+"%'");
    }

    public List<Materia> Select(String query) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Materia> materia = new ArrayList<>();
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement(query);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                materia.add(new Materia(rs.getInt("idMATERIA"), rs.getString("nombre_materia"),
                        rs.getString("descripcion"), rs.getString("otros")));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return materia;
    }

    public Materia SelectMateria(int id) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Materia materia = null;
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement("select * from materia where idMATERIA = " + id);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                materia = new Materia(rs.getInt("idMATERIA"), rs.getString("nombre_materia"),
                        rs.getString("descripcion"), rs.getString("otros"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return materia;
    }

    public int Update(Materia materia) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            st = c.prepareStatement(
                    "UPDATE materia SET nombre_materia = ?, descripcion = ?, otros = ? WHERE idMATERIA = ? ");
            // st.setObject(1, null); //el 1 indica que se sustituira el primer '?' con el
            // valor en int de 1234
            st.setString(1, materia.getNombre()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setString(2, materia.getDescripcion()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setString(3, materia.getOtros());
            st.setInt(4, materia.getId());
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
            st = c.prepareStatement("DELETE FROM materia WHERE  idMATERIA = ?");
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
