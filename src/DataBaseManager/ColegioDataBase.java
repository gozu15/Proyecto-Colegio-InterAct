/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Colegio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class ColegioDataBase {

    public int Insert(Colegio colegio){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     st = c.prepareStatement("INSERT INTO colegio VALUES (?,?,?)");
     st.setObject(1, null);  //el 1 indica que se sustituira el primer '?' con el valor en int de 1234
     st.setString(2,colegio.getNombre() ); //el 2 indica que se sustituira el segundo '?' por el valor en double de 123.45 
     st.setInt(3, colegio.getNumeroDeParalelos());  //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
        
    }
    public Colegio Select(){
       
	PreparedStatement ps=null;
	ResultSet rs=null;
        Colegio colegio=null;
	try {
            Connection c = dbConexion.getConnection();
		String query="select * from colegio";
		ps=c.prepareStatement(query);
		//ps.setString(1, sl_no);
		System.out.println(ps);
		rs=ps.executeQuery();
		while(rs.next()){
                    colegio=new Colegio(rs.getInt("Id"),rs.getString("Nombre"),rs.getInt("Numerodeparalelo"));
		
		}
	} catch (Exception e) {
		System.out.println(e);
	}
        return colegio;
    }
}
