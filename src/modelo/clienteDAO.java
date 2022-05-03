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
import javax.swing.JOptionPane;

/**
 *
 * @author GAMER
 */
public class clienteDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion cn=new conexion();


    
    public List listarcliente() {
        
       
        List< cliente>lista= new ArrayList<>();
        String saql="SELECT *FROM cliente";
        try {
            con=cn.conectar();
            ps=con.prepareStatement(saql);
            rs=ps.executeQuery();
            
            while (rs.next()) {
                 cliente c=new cliente();
                 
                 c.setId_cliente(rs.getInt(1));
                 c.setIdentificacion(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setEstado(rs.getString(5));
                lista.add(c);
                
            }
            
        } catch (SQLException e) {
        }
        return lista;
      }



        
         
    public boolean registrarcliente(cliente cl){
    
        try {
             con=cn.conectar();
            ps=con.prepareStatement("INSERT INTO cliente(identificacion,nombre,direccion,estado)VALUE(?,?,?,?)" );
            ps.setString(1,cl.getIdentificacion());
            ps.setString(2,cl.getNombre());
            ps.setString(3,cl.getDireccion());
            ps.setString(4,cl.getEstado());
           
            ps.execute();
            return (true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return (false);
        }finally{
        
        
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
}
        


  
  
        

    }

   
  public boolean ModificarCliente(cliente cl){
        String sql="UPDATE  cliente SET identificacion=?,nombre=?, direccion=?, estado=? WHERE id_cliente=?";
         
          con=cn.conectar();
        try {
                     
         ps=con.prepareStatement(sql);
         ps.setString(1, cl.getIdentificacion());
         ps.setString(2,cl.getNombre());
         ps.setString(3,cl.getDireccion());
         ps.setString(4,cl.getEstado());
         ps.setInt(5,cl.getId_cliente());
         ps.execute();
         return true;
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            return  false;
        } finally{
        
            try {
                con.close();
            } catch (SQLException e) {
                
                System.out.println(e.toString());
            }
        }
        
        
    }


    

   
    public boolean eliminarcliente(int id) {
      String sql="DELETE  FROM  cliente WHERE id_cliente=?";
     con=cn.conectar();
     try {
        
         
        ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        return  true;
    } catch (SQLException e) {
        System.out.println(e.toString());
     return false;
    } finally{
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
     }
    }

 public cliente BuscarCliente(String identificacion){
        cliente cl= new cliente();
        String sql= "SELECT *FROM cliente WHERE identificacion =?";
        
        try {
              con=cn.conectar();
              ps=con.prepareStatement(sql);
              ps.setString(1, identificacion);
              rs=ps.executeQuery();
              while (rs.next()) {
                  cl.setId_cliente(rs.getInt(1));
                  cl.setIdentificacion(rs.getString(2));
                  cl.setNombre(rs.getString(3));
                  cl.setDireccion(rs.getString(4));
                  cl.setEstado(rs.getString(5));
                  
                
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
               return cl;
    
    }
}
    
  
   
    

