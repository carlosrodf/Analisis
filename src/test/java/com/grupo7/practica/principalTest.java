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
public class principalTest {
    
    public principalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class principal.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        principal.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarCampos method, of class principal.
     */
    @Test
    public void testValidarCampos() {
        System.out.println("validarCampos");
        String username = "";
        String password = "";
        principal instance = new principal();
        boolean expResult = false;
        boolean result = instance.validarCampos(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
