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
public class Auxiliar {

    public Auxiliar() {
    }
    
    public boolean validarCampos(String username, String password){
        return !username.equals("") && !password.equals("");
    }
    
}
