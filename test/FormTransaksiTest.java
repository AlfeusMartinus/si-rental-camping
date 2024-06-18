import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FormTransaksiTest {
    
    private FormTransaksi instance;

    public FormTransaksiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        // Setup that applies to all tests, e.g., initializing shared resources
    }
    
    @AfterClass
    public static void tearDownClass() {
        // Cleanup that applies to all tests, e.g., releasing shared resources
    }
    
    @Before
    public void setUp() {
        // Initialize the instance before each test
        instance = new FormTransaksi("Deyan", "12412512", "Depok", "0812590", "deyan@gmail.com");
    }
    
    @After
    public void tearDown() {
        // Cleanup resources after each test
    }

    @Test
    public void testHitungselisih() {
        System.out.println("hitungselisih");
        instance.hitungselisih();
    }

//    @Test
//    public void testJikakeluar() throws Exception {
//        System.out.println("jikakeluar");
//        boolean expResult = true; 
//        boolean result = instance.jikakeluar();
//        assertEquals(expResult, result);
//    }

    @Test
    public void testCekstatus() throws Exception {
        System.out.println("cekstatus");
        instance.cekstatus();
    }

    @Test
    public void testAdd_peminjam() {
        System.out.println("add_peminjam");
        instance.add_peminjam();
    }
}
