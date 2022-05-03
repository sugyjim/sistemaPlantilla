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
public class venta {
    int id_venta;
    int id_cliente;
    int id_vendedor;
    double monto;
    String numeroVenta;
    String estado;
    String fechaventa;

    public venta() {
    }

    public venta(int id_venta, int id_cliente, int id_vendedor, double monto, String numeroVenta, String estado, String fechaventa) {
        this.id_venta = id_venta;
        this.id_cliente = id_cliente;
        this.id_vendedor = id_vendedor;
        this.monto = monto;
        this.numeroVenta = numeroVenta;
        this.estado = estado;
        this.fechaventa = fechaventa;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(String fechaventa) {
        this.fechaventa = fechaventa;
    }
    
}