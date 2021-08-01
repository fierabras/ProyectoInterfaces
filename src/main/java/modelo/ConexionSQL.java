/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author /**
 */
public class ConexionSQL {
    
    private static ConexionSQL conexionSQL;
    private static Connection conexion;
    
    
    private ConexionSQL(){
        conexion = ConexionSQL.conectar();      
    }
    
    public static Connection getConexion(){
        try {
            if ((ConexionSQL.conexion == null)||(ConexionSQL.conexion.isClosed())){
                ConexionSQL.conexion = ConexionSQL.conectar();
                return ConexionSQL.conexion;
            }      
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("La conexion indica que no es nula ni esta cerrada");
        return conexion;
    }
    
    
    public static ConexionSQL getConexionSQL(){
        if (conexionSQL == null){
            return ConexionSQL.conexionSQL = new ConexionSQL();
        }
        return conexionSQL;       
    }
    
    
    private static Connection conectar() {
        // SQLite connection string
        String url = "jdbc:sqlite:database/proyectoInterfaces.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Se ha creado una nueva conexion a la Base de Datos");
        return conn;
    }
    
    
    public void insert(String sentencia) {
        
        String sql = sentencia;

        try (Connection conn = this.conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {            
            pstmt.executeUpdate();
            JFrame frame=null;
            JOptionPane.showMessageDialog(frame, "Se ha insertado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Se ha insertado correctamente");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
       
    
    public void selectAll(String sentencia){
        String sql = sentencia;
        
        try (Connection conn = this.conectar();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("claveProveedor") +  "\t" + 
                                   rs.getString("nombre") + "\t" +
                                   rs.getString("tipoId") + "\t"+
                                   rs.getString("folioId"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void update(String sentencia){
        String sql = sentencia;

        try (Connection conn = this.conectar();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {            
            pstmt.executeUpdate();
            JFrame frame=null;
            JOptionPane.showMessageDialog(frame, "Se ha modificado el registro", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Se ha modificado correctamente");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    };
    
    public int obtenerClave(String sentencia) {
        int claveSiguiente = 0;
        String sql = sentencia;
        
        try (Connection conn = this.conectar();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){           
            
             claveSiguiente = rs.getInt(1);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return claveSiguiente;
    }
   
   public static void probarConexion() {
                
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:database/proyectoInterfaces.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Se ha establecido la conexion a la base SQLite");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Se ha cerrado la conexion a la base.");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
        
}
