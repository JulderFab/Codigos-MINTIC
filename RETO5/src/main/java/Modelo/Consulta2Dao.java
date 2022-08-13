/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Fabian
 */

import java.sql.*;
import Utilidades.JDBCUtilities2;


public class Consulta2Dao {
        public static ResultSet consulta () {
    
        ResultSet rs= null;
        Statement stmt = null;
        Connection conn = null;
        String csql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion == 'Casa Campestre' AND Ciudad  IN ('Santa Marta', 'Cartagena', 'Barranquilla')";    
        
        try {
        
        conn = JDBCUtilities2.getConnection();
        stmt = conn.createStatement();
        rs = stmt.executeQuery(csql);
                
                } catch (Exception e) {
                
                System.out.println(e);
                } 
        return rs;
    }
}
