import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TambahUserTest {

    private TambahUser instance;

    public TambahUserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new TambahUser();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMain() {
        String[] args = null;
        TambahUser.main(args);
        assertTrue(instance.isVisible()); 
    }

    @Test
    public void testAddUser() {
        // Set up user details
        instance.txt_nama_user.setText("Test User");
        instance.txt_username_user.setText("testuser");
        instance.txt_password_user.setText("password");
        instance.cb_type.setSelectedItem("Staff");


        boolean userAdded = false;

        assertTrue(userAdded);
    }

//    @Test
//    public void testEditUser() {
//        // Add user for editing
//        instance.txtName.setText("Edit User");
//        instance.txtUsername.setText("edituser");
//        instance.txtPassword.setText("password");
//        instance.cbType.setSelectedItem("Staff");
//
//        instance.addUser();
//
//        // Select the first user in the table
//        instance.tableUser.setRowSelectionInterval(0, 0);
//
//        // Change user details
//        instance.txtName.setText("Edited User");
//        instance.txtUsername.setText("editeduser");
//        instance.txtPassword.setText("newpassword");
//        instance.cbType.setSelectedItem("Admin");
//
//        // Edit user
//        instance.editUser();
//
//        // Validate user edition
//        TableModel model = instance.getTableModel();
//        boolean userEdited = false;
//        for (int i = 0; i < model.getRowCount(); i++) {
//            if (model.getValueAt(i, 1).equals("Edited User") && model.getValueAt(i, 2).equals("editeduser")) {
//                userEdited = true;
//                break;
//            }
//        }
//        assertTrue(userEdited);
//    }
//
//    @Test
//    public void testDeleteUser() {
//        // Add user for deletion
//        instance.txtName.setText("Delete User");
//        instance.txtUsername.setText("deleteuser");
//        instance.txtPassword.setText("password");
//        instance.cbType.setSelectedItem("Staff");
//
//        instance.addUser();
//
//        // Select the first user in the table
//        instance.tableUser.setRowSelectionInterval(0, 0);
//
//        // Delete user
//        instance.deleteUser();
//
//        // Validate user deletion
//        TableModel model = instance.getTableModel();
//        boolean userDeleted = true;
//        for (int i = 0; i < model.getRowCount(); i++) {
//            if (model.getValueAt(i, 1).equals("Delete User") && model.getValueAt(i, 2).equals("deleteuser")) {
//                userDeleted = false;
//                break;
//            }
//        }
//        assertTrue(userDeleted);
//    }
}