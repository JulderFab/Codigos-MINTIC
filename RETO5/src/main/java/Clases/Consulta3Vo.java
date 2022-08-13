/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Fabian
 */

import java.sql.*;
import Modelo.*;
import java.util.ArrayList;



public class Consulta3Vo {
    
    public static ArrayList <String []> valores () {
    ResultSet rs = null;
    ArrayList <String []> salida_vo= new ArrayList<String[]> ();
    try { 
    rs = Consulta3Dao.consulta();
    while  (rs.next()) {
    // ID_Compra, Constructora, Banco_Vinculado
    int ID= rs.getInt("ID_Compra");
    String constructora = rs.getString("Constructora");
    String bancoVinculado =rs.getString("Banco_Vinculado");
    
        //System.out.println(String.format("%5d %15s %15s %15s", ID, nombre, apellido, ciudad));
        salida_vo.add (new String [] {ID+ "", constructora, bancoVinculado});
    }
    
    
    }
    
    catch (Exception e) {
    
        System.out.println(e);}
    
        return salida_vo; 
    }
    
}
