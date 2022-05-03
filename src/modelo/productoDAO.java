
 package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class productoDAO {
     producto p=new producto();
    conexion cn= new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    public boolean RegistrarProducto(producto pro) {

        con = cn.conectar();
        try {

            ps = con.prepareStatement("INSERT INTO producto(nombre,precio,stock,estado)VALUE(?,?,?,?)");
            ps.setString(1, pro.getNombre());
            ps.setDouble(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
           ps.setString(4, pro.getEstado());
            ps.execute();
            return (true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return (false);
        } finally {

            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

    
    }
       public List listarproducto() {
        List<producto> Listarpro;
         Listarpro = new ArrayList();
            
        try {
            con=cn.conectar();
            
            ps = con.prepareStatement("SELECT *FROM  producto");
            rs = ps.executeQuery();

            while (rs.next()) {
                producto pro = new producto();
                pro.setId_producto(rs.getInt("id_producto"));
                pro.setNombre(rs.getString("nombre"));
                 pro.setPrecio(rs.getDouble("precio"));
                pro.setStock(rs.getInt("stock"));
                pro.setEstado(rs.getString("estado"));
                Listarpro.add(pro);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listarpro;
    }
       
       public producto BuscarPro(int id){
        producto producto=new producto();
        
          try {
              con=cn.conectar();
               ps=con.prepareStatement("SELECT * FROM `producto` WHERE  id_producto=?");
               ps.setInt(1, id);
               rs=ps.executeQuery();
               if (rs.next()) {
              producto.setId_producto(rs.getInt(1));
              producto.setNombre(rs.getString(2));
              producto.setPrecio(rs.getDouble(3));
              producto.setStock(rs.getInt(4));
              producto.setEstado(rs.getString(5));
               } 
               
          } catch (SQLException e) {
              System.out.println(e.toString());
          }
        return producto;
      
      }
       
       
       
       public  int actualizarstock( int cant, int idp){
       String sql=" update producto set stock=? where id_producto=?";
       
           try {
               con=cn.conectar();
               ps=con.prepareStatement(sql);
               ps.setInt(1, cant);
               ps.setInt(2, idp);
               ps.executeUpdate();
           } catch (SQLException e) {
           }
       return r;
       
       }
       public boolean eliminarproducto(int id) {
      String sql="DELETE  FROM  producto WHERE id_producto=?";
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
       
        public boolean Modificarproducto(producto p){
          try {
          con=cn.conectar();
         ps=con.prepareStatement("UPDATE  producto SET nombre=?, precio=?,  stock=?, estado=? WHERE id_producto=?");
         ps.setString(1, p.getNombre());
         ps.setDouble(2,p.getPrecio());
         ps.setInt(3,p.getStock());
         ps.setString(4,p.getEstado());
        
         ps.setInt(5,p.getId_producto());
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
}