/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Asus
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TambahUserTest.class, PengembalianTest.class, FormTransaksiTest.class, LoginTest.class, TambahProdukTest.class, FormPenyewaanTest.class})
public class PenyewaanIntegrationTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testIntegrationSuccess() {
        FormPenyewaanTest formPenyewaan = new FormPenyewaanTest();
//        FormTransaksi formTransaksi = new FormTransaksi("Deyan", "12412512", "Depok", "0812590", "deyan@gmail.com");
        
        boolean isFormInputSuccessful = formPenyewaan.inputFormulir("Deyan", "12412512", "Depok", "0812590", "deyan@gmail.com");
//        boolean isTransactionSuccessful = formTransaksi.jikakeluar();
        
        assertTrue(isFormInputSuccessful);
//        assertTrue(isTransactionSuccessful);
    }
    
}
