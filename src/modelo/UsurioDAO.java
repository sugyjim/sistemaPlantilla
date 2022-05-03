/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsurioDAO {
    PreparedStatement ps;
    ResultSet rs;
    entidadUsuario enU= new entidadUsuario();
    conexion con=new conexion();
    Connection acceso;
    /**se realiza un metodo con el nombre de la clase de modelo
     que tiene todos los atribu
     * @return t*/
    public entidadUsuario validarusuario(String identificacion, String user){
    String sql="SELECT *FROM usuario WHERE user= ? AND identificacion= ? ";
    acceso=con.conectar();
         try {
            
       ps=acceso.prepareStatement(sql);
            
            ps.setString(1,identificacion);
            ps.setString(2,user);
         
            rs=ps.executeQuery();
            if (rs.next()) {
              enU.setId_vendedor(rs.getInt("id_vendedor"));
             enU.setIdentificacion(rs.getString("identificacion"));
              enU.setNomre(rs.getString("nombre"));
              enU.setTelefono(rs.getString("telefono"));
              enU.setUser(rs.getString("user"));
              enU.setEstado(rs.getString("estado"));
            }
            
            
        } catch (SQLException e) {
            System.out.println(e. toString());
        }
    
return enU;
    
    }
    
     
    public boolean RegistrarU(entidadUsuario reg){
    
        try {
            acceso=con.conectar();
          
            ps=acceso.prepareStatement("INSERT INTO usuario( identificacion, nombre, telefono, estado, user) VALUES(?,?,?,?,?)");
            
             
            ps.setString(1,reg.getIdentificacion());
             ps.setString(2, reg.getNomre());
            ps.setString(3,reg.getTelefono());
            ps.setString(4,reg.getEstado());
            ps.setString(5,reg.getUser());
            ps.execute();
            return true;
            
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    
    }
    
     public List listarusuario() {
        
       
        List< entidadUsuario>lista= new ArrayList<>();
        String saql="SELECT *FROM usuario";
        try {
            acceso=con.conectar();
            ps=acceso.prepareStatement(saql);
            rs=ps.executeQuery();
            
            while (rs.next()) {
                entidadUsuario enu=new entidadUsuario();
                 
                 enu.setId_vendedor(rs.getInt(1));
                  
                 enu.setIdentificacion(rs.getString(2));
                enu.setNomre(rs.getString(3));
                enu.setTelefono(rs.getString(4));
                enu.setEstado(rs.getString(5));
                 enu.setUser(rs.getString(6));
                lista.add(enu);
                
            }
            
        } catch (SQLException e) {
        }
        return lista;
    
    
}
     public boolean Modificarusuario(entidadUsuario ent){
        String sql="UPDATE  usuario SET nombre=?, identificacion=?, telefono=?, estado=?, user=? WHERE id_vendedor=?";
         
          acceso=con.conectar();
        try {
                     
         ps=acceso.prepareStatement(sql);
         
         ps.setString(1, ent.getIdentificacion());
         ps.setString(2,ent.getNomre());
         ps.setString(3, ent.getTelefono());
         ps.setString(4,ent.getEstado());
         ps.setString(5, ent.getUser());
         ps.setInt(6, ent.getId_vendedor());
         ps.execute();
         return true;
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            return  false;
        } finally{
        
            try {
                acceso.close();
            } catch (SQLException e) {
                
                System.out.println(e.toString());
            }
        }
        
     }
     
     public boolean eliminarusuario(int id){
     
         String saql="DELETE FROM usuario WHERE id_vendedor=?";
         
         try {
             acceso=con.conectar();
             ps=acceso.prepareStatement(saql);
             ps.setInt(1, id);
             ps.execute();
             return true;
             
         } catch (SQLException e) {
             System.err.println(e.toString());
             return false;
         }
     
     
     
     }
   

 public entidadUsuario BuscarUsuario(String identificacion){
    
 
     entidadUsuario ent=new entidadUsuario();
       
          try {
              acceso=con.conectar();
               ps=acceso.prepareStatement("SELECT * FROM usuario WHERE identificacion=?");
               ps.setString(1, identificacion);
               rs=ps.executeQuery();
               
               if (rs.next()) {
                  
              ent.setNomre(rs.getString("nombre"));
              ent.setTelefono(rs.getString("telefono"));
              ent.setEstado(rs.getString("estado"));
               ent.setUser(rs.getString("user"));
               } 
               
         
             
               
          } catch (SQLException e) {
              System.out.println(e.toString());
          }
        return ent;
 }     
}