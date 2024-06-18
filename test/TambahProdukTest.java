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
public class TambahProdukTest {
    
    public TambahProdukTest() {
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
    

    public boolean inputProduk(String kategori, String nama, String kode, String harga) {
        return !(kategori.isEmpty() || nama.isEmpty() || kode.isEmpty() || harga.isEmpty());
    }
    
    @Test
    public void testInputFormulirSuccess() {
        // Verify that the inputs are handled correctly
        System.out.println("succes test");
        assertTrue(inputProduk("Tenda", "Dome Eiger 6 Orang", "TE01", "13000"));
    }
    
    @Test
    public void testInputFormulirFalse() {
        // Verify that the inputs are handled correctly
        System.out.println("succes false with input kategori is null");
        assertFalse(inputProduk("", "Dome Eiger 6 Orang", "TE01", "13000"));
    }
    
}
