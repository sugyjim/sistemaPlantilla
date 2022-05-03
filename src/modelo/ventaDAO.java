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

/**
 *
 * @author GAMER
 */
public class ventaDAO {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    int id_venta=0;
    
         
     
   
    
    
    public String idventa (){
        String idv="";
        String sql= "select max(id_venta) from venta";
        try {
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            
             while(rs.next()){
                 
             idv=rs.getString(1);
             
             
             }
        } catch (SQLException e) {
        }
        return idv;
    }
    
    public int guardarventa( venta v){
    venta venta= new venta();
    String sql= " insert into venta( id_cliente, id_vendedor, numeroVenta, monto, fechaVenta,estado) values(?,?,?,?,?,?)";
    
        try {
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1,v.getId_cliente());
            ps.setInt(2, v.id_vendedor);
            ps.setString(3, v.getNumeroVenta());
            ps.setDouble(4, v.getMonto());
            ps.setString(5, v.getFechaventa());
            ps.setString(6, v.getEstado());
            r=ps.executeUpdate();
                    
            
            
        } catch (SQLException e) {
        }
    return r;
    }
    
    public int  guardardetaventa (detalleventa dv){
    String sql= "insert into detalleventa( id_Venta, id_producto,cantidad, precioventa)values(?,?,?,?)";
     
    
        try {
            con=cn.conectar();
            ps=con.prepareStatement(sql);
             ps.setInt(1,dv.getId_venta());
            ps.setInt(2, dv.getId_producto());
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getPrecioventa() );
            
            
            r=ps.executeUpdate();
        } catch (SQLException e) {
        }
    return r;
    }

    
     public List listarventa() {
        List<venta> Listarventa;
        Listarventa = new ArrayList();
             con = cn.conectar();
        try {
            
            ps = con.prepareStatement("SELECT *FROM  venta");
            rs = ps.executeQuery();

            while (rs.next()) {
               venta vent = new venta();
                vent.setId_venta(rs.getInt("id_venta"));
                vent.setId_cliente(rs.getInt("id_cliente"));
                vent.setId_vendedor(rs.getInt("id_vendedor"));
                vent.setNumeroVenta(rs.getString("numeroVenta"));
                vent.setFechaventa(rs.getDate("fechaVenta").toString());
                vent.setMonto(rs.getDouble("monto"));
                vent.setEstado(rs.getString("estado"));
                
                Listarventa.add(vent);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Listarventa;
    }
}
    

