/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo7.practica;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlosrodf
 */
public class databaseTest {
    
    public databaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.print("----------------------------------------------------\n");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.print("----------------------------------------------------\n");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregarUsuario method, of class database.
     */
    @Test
    public void testAgregarUsuario_7args() {
        System.out.println("agregarUsuario");
        String correo = "";
        String nombre = "";
        String apellido = "";
        String pass = "";
        String dir = "";
        String telefono = "";
        String fecha_nac = "";
        database instance = new database();
        boolean expResult = true;
        boolean result = instance.agregarUsuario(correo, nombre, apellido, pass, dir, telefono, fecha_nac);
        assertEquals(expResult, result);
    }

    /**
     * Test of agregarUsuario method, of class database.
     */
    @Test
    public void testAgregarUsuario_8args() {
        System.out.println("agregarUsuario");
        String correo = "#####";
        String nombre = "";
        String apellido = "";
        String pass = "";
        String dir = "";
        String telefono = "";
        String fecha_nac = "";
        String asoc = "";
        database instance = new database();
        boolean expResult = true;
        boolean result = instance.agregarUsuario(correo, nombre, apellido, pass, dir, telefono, fecha_nac, asoc);
        assertEquals(expResult, result);
    }

    /**
     * Test of existe method, of class database.
     */
    @Test
    public void testExiste() {
        System.out.println("existe");
        String correo = "dummy";
        database instance = new database();
        boolean expResult = false;
        boolean result = instance.existe(correo);
        assertEquals(expResult, result);
    }
    
}
