/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Asus
 */
public class FormPenyewaanTest {
    
    public FormPenyewaanTest() {
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

    public boolean inputFormulir(String nama, String nik, String alamat, String tlp, String email) {
        return !(nama.isEmpty() || nik.isEmpty() || alamat.isEmpty() || tlp.isEmpty() || email.isEmpty());
    }

    @Test
    public void testInputFormulirSuccess() {
        // Verify that the inputs are handled correctly
        assertTrue(inputFormulir("Deyan", "12412512", "Depok", "0812590", "deyan@gmail.com"));
    }

    @Test
    public void testInputFormulirFailureEmptyName() {
        // Verify that the method returns false when name is empty
        assertFalse(inputFormulir("", "12412512", "Depok", "0812590", "deyan@gmail.com"));
    }

    @Test
    public void testInputFormulirFailureEmptyNik() {
        // Verify that the method returns false when NIK is empty
        assertFalse(inputFormulir("Deyan", "", "Depok", "0812590", "deyan@gmail.com"));
    }

    @Test
    public void testInputFormulirFailureEmptyAddress() {
        // Verify that the method returns false when address is empty
        assertFalse(inputFormulir("Deyan", "12412512", "", "0812590", "deyan@gmail.com"));
    }

    @Test
    public void testInputFormulirFailureEmptyTlp() {
        // Verify that the method returns false when telephone number is empty
        assertFalse(inputFormulir("Deyan", "12412512", "Depok", "", "deyan@gmail.com"));
    }

    @Test
    public void testInputFormulirFailureEmptyEmail() {
        // Verify that the method returns false when email is empty
        assertFalse("Failed Input Formulir due to empty email", inputFormulir("Deyan", "12412512", "Depok", "0812590", ""));
    }
    
}
