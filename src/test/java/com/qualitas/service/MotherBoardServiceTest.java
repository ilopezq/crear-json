/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.service;

import com.qualitas.modelo.entities.MotherBoard;
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
public class MotherBoardServiceTest {
    
    public MotherBoardServiceTest() {
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
     * Test of main method, of class MotherBoardService.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MotherBoardService.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of creaMother method, of class MotherBoardService.
     */
    @Test
    public void testCreaMother() {
        System.out.println("creaMother");
        MotherBoardService instance = new MotherBoardService();
        MotherBoard expResult = null;
        MotherBoard result = instance.creaMother();
        assertNotNull(result);  // No debe de ser nulo
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
