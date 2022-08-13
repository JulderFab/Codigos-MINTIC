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
import Modelo.Consulta1Dao;
import java.util.ArrayList;

public class Consulta1Vo {
    
    public static ArrayList <String []> valores () {
    ResultSet rs = null;
    ArrayList <String []> salida_vo= new ArrayList<String[]> ();
    try { 
    rs = Consulta1Dao.consulta();
    while  (rs.next()) {
    // ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia
    int ID= rs.getInt("ID_Lider");
    String nombre = rs.getString("Nombre");
    String apellido =rs.getString("Primer_Apellido");
    String ciudad = rs.getString("Ciudad_Residencia");
        //System.out.println(String.format("%5d %15s %15s %15s", ID, nombre, apellido, ciudad));
        salida_vo.add (new String [] {ID+ "", nombre, apellido, ciudad});
    }
    
    
    }
    
    catch (Exception e) {
    
        System.out.println(e);}
    
        return salida_vo; 
    }
    
    
    
}
