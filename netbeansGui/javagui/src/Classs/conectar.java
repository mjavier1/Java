/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author mj
 */
public class conectar {

    
    public Connection conexion(){
        //trycatch   
        Connection on = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            on=DriverManager.getConnection("jdbc:mysql://localhost:3306/mjk","mj","datasql");
            System.out.println("Conectar");
          //  jdbc:mysql://localhost:3306/mjk
          //jdbc://mysql://localhost/mjk
        } catch (Exception e) {
            //serr un error
            System.err.println(e.getMessage());
        }
        return on;
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
