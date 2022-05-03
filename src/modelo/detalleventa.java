/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author GAMER
 */
public class detalleventa {
    int id_dtventa;
    int id_venta;
    int id_producto;
    int cantidad;
    double precioventa;

    public detalleventa() {
    }

    public detalleventa(int id_dtventa, int id_venta, int id_producto, int cantidad, double precioventa) {
        this.id_dtventa = id_dtventa;
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
    }

    public int getId_dtventa() {
        return id_dtventa;
    }

    public void setId_dtventa(int id_dtventa) {
        this.id_dtventa = id_dtventa;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }
    
}
