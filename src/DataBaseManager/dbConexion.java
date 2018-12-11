/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class dbConexion {
     private static Connection con=null;
   public static Connection getConnection() throws SQLException{
      try{
         if( con == null ){
            String driver="com.mysql.jdbc.Driver"; //el driver varia segun la DB que usemos
            String url="jdbc:mysql://localhost/colegio?autoReconnect=true";
            String pwd="";
            String usr="root";
            Class.forName(driver);
            con = DriverManager.getConnection(url,usr,pwd);
            System.out.println("Conectionesfull");
         }
     }
     catch(ClassNotFoundException | SQLException ex){
        ex.printStackTrace();
     }
     return con;
   }
      public  void cerrar() throws SQLException {
      if (con != null) {
         con.close();
      }
   }
}
