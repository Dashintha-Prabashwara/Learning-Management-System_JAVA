/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evo_lms;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EvoDatabase {
    
    public static Connection connect(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/evodatabase","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EvoDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
        
    }
}
    
    


