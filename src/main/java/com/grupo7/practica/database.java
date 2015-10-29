/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo7.practica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlosrodf
 */
public class database {
    
    private ArrayList<Usuario> usuarios;

    public database() {
        
        this.usuarios = new ArrayList<>();
        
        File file = new File("screenjunkies.txt");
        if (!file.exists()) {
            PrintWriter writer = null;
            try {
                writer = new PrintWriter("screenjunkies.txt");
                writer.close();
                System.out.println("Archivo de datos creado");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                writer.close();
            }
        } else {
            System.out.println("Archivo de datos ya existente");
        }
        leerArchivo();
    }
    
    private void leerArchivo(){       
        try{
            BufferedReader br = new BufferedReader(new FileReader("screenjunkies.txt"));
            String line = br.readLine();
            while(line != null){
                cargar(line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cargar(String u){
        String[] arr = u.split("~");
        if(arr.length == 8){
            this.usuarios.add(new Usuario(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]));
        }else{
            this.usuarios.add(new Usuario(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8]));
        }   
    }
    
    private boolean existe(String correo){
        for(Usuario u : usuarios){
            if(u.getCorreo().equals(correo))
                return true;
        }
        return false;
    }
    
    public boolean escribirArchivo(){
        try {
            FileWriter f = new FileWriter("screenjunkies.txt");
            for(Usuario u : usuarios){
                f.write(u.getString());
            }
            f.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean agregarUsuario(String correo, String nombre, String apellido, String pass, String dir, String telefono, String fecha_nac){
        if(existe(correo)){
            return false;
        }else{
            usuarios.add(new Usuario(correo,nombre,apellido,pass,dir,telefono,fecha_nac,"dd/mm/yyyy"));
            return true;
        }
    }
    
    public boolean agregarUsuario(String correo, String nombre, String apellido, String pass, String dir, String telefono, String fecha_nac, String asoc){
        if(existe(correo)){
            return false;
        }else{
            usuarios.add(new Usuario(correo,nombre,apellido,pass,dir,telefono,fecha_nac,"dd/mm/yyyy",asoc));
            return true;
        }
    }
}
