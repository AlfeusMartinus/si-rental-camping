/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.net.Socket;
import java.sql.*;
import Database.KoneksiDatabase;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;


/**
 *
 * @author Asus
 */
public class LoginTest {
    private Connection con;
    private String id_user;
    private String hak;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws SQLException {
        // Initialize the connection before each test
        KoneksiDatabase koneksiDatabase = new KoneksiDatabase(new Database.Parameter().HOST_DB, new Database.Parameter().USERNAME_DB, new Database.Parameter().PASSWORD_DB);
    }
    
    @After
    public void tearDown() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean login(String txt_username, String txt_password) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "SELECT id_user, type FROM user WHERE username='" + txt_username + "' AND password='" + txt_password + "'";

        try (ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                id_user = rs.getString("id_user");
                hak = rs.getString("type");
                return true;
            } else {
                return false;
            }
        }
    }
    /**
     * Test of main method, of class Login.
     */   
//    @Test
//    public void testLoginSuccess() throws SQLException {
//        Assertions.assertTrue(login("root", ""), "Login seharusnya berhasil untuk user 'root' dengan password kosong.");
//    }
    
    
    
    
    
    
    
    @Test
    public void testAddition() {
        int sum = 1 + 1;
        assertEquals(2, sum);
    }

    
}
