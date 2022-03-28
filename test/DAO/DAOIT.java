/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Customer;
import entity.Homestay;
import entity.Image;
import entity.Location;
import entity.totalPrice;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import model.locations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LNV
 */
public class DAOIT {
    
    public DAOIT() {
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
     * Test of updateLocation method, of class DAO.
     */
    @Test
    public void testUpdateLocation() {
        System.out.println("updateLocation");
        String id = "1";
        String name = "Cần thơ";
        String image = "";
        DAO instance = new DAO();
        instance.updateLocation(id, name, image);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
