/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.TomaMaterias;
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
public class TomaMateriasDataBase {
     public int TomaEstudiante(TomaMaterias tomaMaterias) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO toma_materias_estudiante VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setObject(1, null); // el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            st.setDate(2, tomaMaterias.getFecha()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setInt(3, tomaMaterias.getIdGestion()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setInt(4, tomaMaterias.getIdRegistro());
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
         public int TomaMateriaEstudiante(int idToma,int idMateria) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO  materia_estudiante VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setObject(1, null); // el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setInt(2, idToma); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setInt(3, idMateria);
            // los tipos de variables deben coincidir con los tipos definidos en las
            // columnas de la tabla en la que se insertaran
            res = st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                res = rs.getInt(1);
            }

        } catch (SQLException ex) {
            // captura la excepcion
            SQLException de=ex;
            int s=2;
        }
        return res;

    }
     
         public int TomaMateriaProfesor(int idToma,int idMateria) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO materia_estudiante VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setObject(1, null); // el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setInt(2, idToma); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setInt(3, idMateria);
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
     
     
     public int TomaProfesor(TomaMaterias tomaMaterias) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            st = c.prepareStatement("INSERT INTO toma_materias_profesor VALUES (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setObject(1, null); // el 1 indica que se sustituira el primer '?' con el valor en int de 1234
            st.setDate(2, tomaMaterias.getFecha()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setInt(3, tomaMaterias.getIdGestion()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setInt(4, tomaMaterias.getIdRegistro());
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

    public List<TomaMaterias> SelectMaterias() {
        return SelectTomaEstudiante("select * from toma_materias_estudiante");
    }
       public List<TomaMaterias> BuscarPorRegistro(int idregistro) {
           //query = "SELECT * FROM drawings WHERE name LIKE '%" + DT + "%'";
        return SelectTomaEstudiante("select * from toma_materias_estudiante WHERE REGISTRO_idREGISTRO	= "+idregistro );
    }

    public List<TomaMaterias> SelectTomaEstudiante(String query) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        List<TomaMaterias> tomaMaterias = new ArrayList<>();
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement(query);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                tomaMaterias.add(new TomaMaterias(rs.getInt("idTOMA_MAT"), rs.getDate("fecha_toma"),
                        rs.getInt("GESTION_idGESTION"), rs.getInt("REGISTRO_idREGISTRO")));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return tomaMaterias;
    }

    public TomaMaterias SelectTomaEstudiante(int id) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        TomaMaterias tomaMaterias = null;
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement("select * from toma_materias_estudiante where idTOMA_MAT = " + id);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                tomaMaterias =new TomaMaterias(rs.getInt("idTOMA_MAT"), rs.getDate("fecha_toma"),
                        rs.getInt("GESTION_idGESTION"), rs.getInt("REGISTRO_idREGISTRO"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return tomaMaterias;
    }
       public TomaMaterias SelectTomaProfesor(int id) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        TomaMaterias tomaMaterias = null;
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            
            ps = c.prepareStatement("select * from  toma_materias_profesor where idTOMA_MATERIAS_PROFESOR = " + id);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                tomaMaterias =new TomaMaterias(rs.getInt("idTOMA_MAT"), rs.getDate("fecha_toma"),
                        rs.getInt("GESTION_idGESTION"), rs.getInt("REGISTRO_idREGISTRO"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return tomaMaterias;
    }
       
       

    public int UpdateTomaEstudiante(TomaMaterias tomaMaterias) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            st = c.prepareStatement(
                    "UPDATE toma_materias_estudiante SET fecha_toma = ?, GESTION_idGESTION = ?, REGISTRO_idREGISTRO = ? WHERE idTOMA_MAT = ? ");
            // st.setObject(1, null); //el 1 indica que se sustituira el primer '?' con el
            // valor en int de 1234
            st.setDate(1, tomaMaterias.getFecha()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setInt(2, tomaMaterias.getIdGestion()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setInt(3, tomaMaterias.getIdRegistro());
            st.setInt(4, tomaMaterias.getId());
            // los tipos de variables deben coincidir con los tipos definidos en las
            // columnas de la tabla en la que se insertaran
            res = st.executeUpdate();
        } catch (SQLException ex) {
            // captura la excepcion
        }
        return res;

    }
    
     public int UpdateTomaProfesor(TomaMaterias tomaMaterias) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            st = c.prepareStatement(
                    "UPDATE  toma_materias_profesor SET fecha_toma = ?, GESTION_idGESTION = ?, REGISTRO_idREGISTRO = ? WHERE idTOMA_MATERIAS_PROFESOR	 = ? ");
            // st.setObject(1, null); //el 1 indica que se sustituira el primer '?' con el
            // valor en int de 1234
            st.setDate(1, tomaMaterias.getFecha()); // el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            st.setInt(2, tomaMaterias.getIdGestion()); // el 3 indica que se sustiruira el tercer '?' por la cadena
                                                       // "hola"
            st.setInt(3, tomaMaterias.getIdRegistro());
            st.setInt(4, tomaMaterias.getId());
            // los tipos de variables deben coincidir con los tipos definidos en las
            // columnas de la tabla en la que se insertaran
            res = st.executeUpdate();
        } catch (SQLException ex) {
            // captura la excepcion
        }
        return res;

    }


    public int DeleteEstudiante(int id) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            // delete from users where id = ?
            st = c.prepareStatement("DELETE FROM toma_materias_estudiante WHERE  idTOMA_MAT = ?");
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
    
      public int DeleteProfesor(int id) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            // delete from users where id = ?
            st = c.prepareStatement("DELETE FROM  toma_materias_profesor WHERE  idTOMA_MATERIAS_PROFESOR = ?");
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
