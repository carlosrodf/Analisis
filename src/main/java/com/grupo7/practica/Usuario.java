/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo7.practica;

/**
 *
 * @author carlosrodf
 */
public class Usuario {
    
    private String correo;
    private String nombre;
    private String apellido;
    private String password;
    private String direccion;
    private String telefono;
    private String fecha_nac;
    private String fecha_soc;
    private String asociado;
    
    private boolean asociado_flag;

    public Usuario(String correo, String nombre, String apellido, String password, String direccion, String telefono, String fecha_nac, String fecha_soc) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nac = fecha_nac;
        this.fecha_soc = fecha_soc;
        this.asociado_flag = false;
    }

    public Usuario(String correo, String nombre, String apellido, String password, String direccion, String telefono, String fecha_nac, String fecha_soc, String asociado) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nac = fecha_nac;
        this.fecha_soc = fecha_soc;
        this.asociado = asociado;
        this.asociado_flag = true;
    }
    
    public String getString(){
        if(!asociado_flag)
            return correo + "~" + nombre + "~" + apellido + "~" + password + "~" + direccion + "~" + telefono + "~" + fecha_nac + "~" + fecha_soc + "\n";
        else
            return correo + "~" + nombre + "~" + apellido + "~" + password + "~" + direccion + "~" + telefono + "~" + fecha_nac + "~" + fecha_soc + "~" + asociado + "\n";
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPassword() {
        return password;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public String getAsociado() {
        return asociado;
    }

    public boolean isAsociado() {
        return asociado_flag;
    }
    
    
}
