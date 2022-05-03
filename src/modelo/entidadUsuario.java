/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class entidadUsuario {
    private  int id_vendedor;
    private String nomre;
    private String identificacion;
    private String telefono;
    private String estado;
    private String user;

    public entidadUsuario() {
    }

    public entidadUsuario(int id_vendedor, String nomre, String identificacion, String telefono, String estado, String user) {
        this.id_vendedor = id_vendedor;
        this.nomre = nomre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.estado = estado;
        this.user = user;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNomre() {
        return nomre;
    }

    public void setNomre(String nomre) {
        this.nomre = nomre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
