/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elvis Quiroz
 */
public class CursoDataBase {
    public int Insert(Curso curso){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     st = c.prepareStatement("INSERT INTO curso VALUES (?,?,?,?)");
     st.setObject(1, null);  //el 1 indica que se sustituira el primer '?' con el valor en int de 1234
     st.setString(2,curso.getNombre() ); //el 2 indica que se sustituira el segundo '?' por el valor en double de 123.45 
     st.setInt(3, curso.getHorario());  //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
     st.setInt(4, curso.getAula());//los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
        
    }
    public Curso Select(){
       
	PreparedStatement ps=null;
	ResultSet rs=null;
        Curso curso=null;
	try {
            Connection c = dbConexion.getConnection();
		String query="select * from curso";
		ps=c.prepareStatement(query);
		//ps.setString(1, sl_no);
		System.out.println(ps);
		rs=ps.executeQuery();
		while(rs.next()){
                    curso=new Curso(rs.getInt("idCURSO"),rs.getString("nombre_curso"),rs.getInt("HORARIOS_idHORARIOS"),rs.getInt("AULA_idAULA"));
		
		}
        } catch (Exception e) {
		System.out.println(e);
	}
        return curso;
    }
    public List<Curso> SelectCurso() {
        return Select("select * from curso");
    }
       public List<Curso> BuscarCurso(String termino) {
           //query = "SELECT * FROM drawings WHERE name LIKE '%" + DT + "%'";
        return Select("select * from curso WHERE nombre_curso LIKE '%"+termino+"%'");
    }

    public List<Curso> Select(String query) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Curso> curso = new ArrayList<>();
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement(query);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                curso.add(new Curso(rs.getInt("idCURSO"), rs.getString("nombre_curso"),
                        rs.getInt("HORARIOS_idHORARIOS"), rs.getInt("AULA_idAULA")));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return curso;
    }

    public Curso SelectCurso(int id) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Curso curso = null;
        try {
            Connection c = dbConexion.getConnection();
            // String query=query;
            ps = c.prepareStatement("select * from curso where idCURSO = " + id);
            // ps.setString(1, sl_no);
            System.out.println(ps);
            rs = ps.executeQuery();
            while (rs.next()) {
                curso = new Curso(rs.getInt("idCURSO"), rs.getString("nombre_materia"),
                        rs.getInt("HORARIOS_idHORARIOS"), rs.getInt("AULA_idAULA"));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return curso;
    }
    public int Update(Curso curso) {
        int res = 0;
        try {
            Connection c = dbConexion.getConnection();
            PreparedStatement st;
            // update users set num_points = ? where first_name = ?
            // UPDATE Messages SET description = ?, author = ? WHERE id = ? AND seq_num = ?

            st = c.prepareStatement(
                    "UPDATE curso SET nombre_curso = ?,HORARIOS_idHORARIOS=?,AULA_idAULA=? WHERE idCURSO=?");
            // st.setObject(1, null); //el 1 indica que se sustituira el primer '?' con el
            // valor en int de 1234
            st.setString(1, curso.getNombre());
            st.setInt(2, curso.getHorario());
            st.setInt(3, curso.getAula());
            st.setInt(4, curso.getId());
            



// el 2 indica que se sustituira el segundo '?' por el valor en double
                                                  // de 123.45
            
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
            st = c.prepareStatement("DELETE FROM curso WHERE  idCURSO = ?");
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
