/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.modelo.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ilopez
 */
public class RamTest {
    
    public RamTest() {
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
     * Test of getMarca method, of class Ram.
     */
    @org.junit.Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Ram instance = null;
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Ram.
     */
    @org.junit.Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Ram instance = null;
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacidad method, of class Ram.
     */
    @org.junit.Test
    public void testGetCapacidad() {
        System.out.println("getCapacidad");
        Ram instance = null;
        int expResult = 0;
        int result = instance.getCapacidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacidad method, of class Ram.
     */
    @org.junit.Test
    public void testSetCapacidad() {
        System.out.println("setCapacidad");
        int capacidad = 0;
        Ram instance = null;
        instance.setCapacidad(capacidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
