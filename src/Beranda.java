
import usu.widget.ButtonGlass;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asuss
 * 
 *
 */
public class Beranda extends javax.swing.JFrame {

    private ButtonGlass btn_login;

    
    public Beranda() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        btn_formMobil.setVisible(false);
        btn_formPeminjam.setVisible(false);
        btn_formUser.setVisible(false);
        btn_transaksi.setVisible(false);;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_login = new usu.widget.ButtonGlass();
        btn_formMobil = new usu.widget.ButtonGlass();
        btn_formPeminjam = new usu.widget.ButtonGlass();
        btn_transaksi = new usu.widget.ButtonGlass();
        btn_formUser = new usu.widget.ButtonGlass();
        btn_closee = new usu.widget.ButtonGlass();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        layar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SiRentalCamping");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1520, 891));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login2.png"))); // NOI18N
        btn_login.setText("Login");
        btn_login.setRoundRect(true);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, 80));

        btn_formMobil.setForeground(new java.awt.Color(255, 255, 255));
        btn_formMobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tambahAlat.png"))); // NOI18N
        btn_formMobil.setText("Tambah Peralatan");
        btn_formMobil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_formMobil.setRoundRect(true);
        btn_formMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formMobilActionPerformed(evt);
            }
        });
        getContentPane().add(btn_formMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, 80));

        btn_formPeminjam.setForeground(new java.awt.Color(255, 255, 255));
        btn_formPeminjam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sewaAlat.png"))); // NOI18N
        btn_formPeminjam.setText("Sewa Peralatan");
        btn_formPeminjam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_formPeminjam.setRoundRect(true);
        btn_formPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formPeminjamActionPerformed(evt);
            }
        });
        getContentPane().add(btn_formPeminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, 80));

        btn_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        btn_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kembaliAlat.png"))); // NOI18N
        btn_transaksi.setText("Pengembalian");
        btn_transaksi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_transaksi.setRoundRect(true);
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, 80));

        btn_formUser.setForeground(new java.awt.Color(255, 255, 255));
        btn_formUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tambahPengguna.png"))); // NOI18N
        btn_formUser.setText("Tambah Pengguna");
        btn_formUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_formUser.setRoundRect(true);
        btn_formUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_formUserActionPerformed(evt);
            }
        });
        getContentPane().add(btn_formUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 210, 80));

        btn_closee.setForeground(new java.awt.Color(255, 255, 255));
        btn_closee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        btn_closee.setText("Keluar");
        btn_closee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_closee.setRoundRect(true);
        btn_closee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_closee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 210, 80));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Copyright LaudzaTeam @2024");
        jLabel5.setEnabled(false);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 820, -1, 60));

        jLabel4.setFont(new java.awt.Font("Futura Md BT", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CAMP");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 190, -1));

        jLabel3.setFont(new java.awt.Font("Futura Md BT", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LAUDZA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, -1));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SEWA ALAT-ALAT CAMPING");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 240, 20));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg-home.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(333, 789));
        jLabel1.setMinimumSize(new java.awt.Dimension(333, 789));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 910));

        layar.setBackground(new java.awt.Color(143, 10, 24));
        layar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layarLayout = new javax.swing.GroupLayout(layar);
        layar.setLayout(layarLayout);
        layarLayout.setHorizontalGroup(
            layarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        layarLayout.setVerticalGroup(
            layarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );

        getContentPane().add(layar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 1380, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_formMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formMobilActionPerformed
        layar.removeAll();
        layar.repaint();
        TambahProduk TP = new TambahProduk();
        layar.add(TP);
        TP.setVisible(true);
    }//GEN-LAST:event_btn_formMobilActionPerformed

    private void btn_formPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formPeminjamActionPerformed
        layar.removeAll();
        layar.repaint();
        FormPenyewaan FP = new FormPenyewaan();
        layar.add(FP);
        FP.setVisible(true);
    }//GEN-LAST:event_btn_formPeminjamActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        layar.removeAll();
        layar.repaint();
        Pengembalian P = new Pengembalian();
        P.setVisible(true);
        layar.add(P);
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_formUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_formUserActionPerformed
        layar.removeAll();
        layar.repaint();
        TambahUser TU = new TambahUser();
        TU.setVisible(true);
        layar.add(TU);
    }//GEN-LAST:event_btn_formUserActionPerformed

    private void btn_closeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeeActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
         //     jDesktopPane1.removeAll();
        //     jDesktopPane1.repaint();
        dispose();
        Login fm = new Login();
        fm.setVisible(true);
        //jDesktopPane1.add(fm);
    }//GEN-LAST:event_btn_loginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_closee;
    private usu.widget.ButtonGlass btn_formMobil;
    private usu.widget.ButtonGlass btn_formPeminjam;
    private usu.widget.ButtonGlass btn_formUser;
    private usu.widget.ButtonGlass btn_login;
    private usu.widget.ButtonGlass btn_transaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel layar;
    // End of variables declaration//GEN-END:variables
*/
    public void admin() {

        btn_formMobil.setVisible(true);
        btn_formPeminjam.setVisible(true);
        btn_formUser.setVisible(true);
        btn_closee.setVisible(true);
        btn_login.setVisible(false);
        btn_transaksi.setVisible(true);
        

    }

    public void user() {
        btn_formMobil.setVisible(true);
        btn_formPeminjam.setVisible(true);
        btn_formUser.setVisible(false);
        btn_closee.setVisible(true);
        btn_login.setVisible(false);
        btn_transaksi.setVisible(true);
        
    }
    
    public static usu.widget.ButtonGlass btn_closee;
    public static usu.widget.ButtonGlass btn_formMobil;
    public static usu.widget.ButtonGlass btn_formPeminjam;
    public static usu.widget.ButtonGlass btn_formUser;
    public static usu.widget.ButtonGlass btn_transaksi;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel layar;
    // End of variables declaration
}
