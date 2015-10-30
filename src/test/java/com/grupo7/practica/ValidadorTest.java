/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo7.practica;

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
public class ValidadorTest {
    
    public ValidadorTest() {
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
     * Test of noNulls method, of class Validador.
     */
    @Test
    public void testNoNulls() {
        System.out.println("noNulls");
        String[] args = null;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.noNulls(args);
        assertEquals(expResult, result);
    }

    /**
     * Test of paswordsMatch method, of class Validador.
     */
    @Test
    public void testPaswordsMatch() {
        System.out.println("paswordsMatch");
        String p1 = "p1";
        String p2 = "p1";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.paswordsMatch(p1, p2);
        assertEquals(expResult, result);
    }

    /**
     * Test of telefonoValido method, of class Validador.
     */
    @Test
    public void testTelefonoValido() {
        System.out.println("telefonoValido");
        String tel = "12345678";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.telefonoValido(tel);
        assertEquals(expResult, result);
    }

    /**
     * Test of fechaValida method, of class Validador.
     */
    @Test
    public void testFechaValida() {
        System.out.println("fechaValida");
        String dia = "11";
        String mes = "11";
        String anio = "11";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.fechaValida(dia, mes, anio);
        assertEquals(expResult, result);
    }
    
}
