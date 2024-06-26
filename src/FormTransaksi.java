/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

import Database.KoneksiDatabase;
import Database.ResultSetTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class FormTransaksi extends javax.swing.JInternalFrame {

    ResultSet rs;
    KoneksiDatabase con;
    static String nama;
    static String nik;
    static String alamat;
    static String tlp;
    static String email;
    String status1;
    
    
    public FormTransaksi(String nama, String nik, String alamat, String tlp, String email) {
        con = new KoneksiDatabase(new Database.Parameter().HOST_DB, new Database.Parameter().USERNAME_DB, new Database.Parameter().PASSWORD_DB);
        
        initComponents();
        lblNama.setText(nama);
        lblNik.setText(nik);
        lbl_alamat.setText(alamat);
        lbl_tlp.setText(tlp);
        lbl_email.setText(email);
        loadMobil();
        loadTabel();
    }
    
    FormTransaksi(String nama, String alamat, String tlp, String email) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_create_addItem = new usu.widget.ButtonGlass();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblNik = new javax.swing.JLabel();
        lbl_alamat = new javax.swing.JLabel();
        lbl_tlp = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        panelGlass3 = new usu.widget.glass.PanelGlass();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel32 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btn_Refresh__addItem = new usu.widget.ButtonGlass();
        jLabel40 = new javax.swing.JLabel();
        txt_total = new javax.swing.JLabel();
        txt_lama = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        btn_Refresh__addItem2 = new usu.widget.ButtonGlass();
        panelGlass4 = new usu.widget.glass.PanelGlass();
        jLabel9 = new javax.swing.JLabel();
        lbl_kategori = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        lbl_harga = new javax.swing.JLabel();
        lbl_nama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1150, 733));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(143, 10, 24));
        jPanel1.setPreferredSize(new java.awt.Dimension(1220, 800));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Form Transaksi ");

        btn_create_addItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_create_addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/submit.png"))); // NOI18N
        btn_create_addItem.setText("Submit");
        btn_create_addItem.setRoundRect(true);
        btn_create_addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_addItemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATA PEMINJAM");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIK");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("No. Tlp");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Email");

        lblNama.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNama.setForeground(new java.awt.Color(255, 255, 255));
        lblNama.setText("Nama");

        lblNik.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNik.setForeground(new java.awt.Color(255, 255, 255));
        lblNik.setText("Nik");

        lbl_alamat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_alamat.setForeground(new java.awt.Color(255, 255, 255));
        lbl_alamat.setText("Alamat");
        lbl_alamat.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lbl_tlp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_tlp.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tlp.setText("No. Tlp");

        lbl_email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email.setText("Email");

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(lbl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51))
                                .addGroup(panelGlass1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40))))
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_alamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_tlp, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addContainerGap(52, Short.MAX_VALUE))))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblNama))
                .addGap(12, 12, 12)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblNik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lbl_tlp))
                .addGap(18, 18, 18)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(lbl_email))
                .addGap(21, 21, 21))
        );

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tgl  Peminjaman");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Tgl Pengembalian");

        btn_Refresh__addItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_Refresh__addItem.setText("Hitung");
        btn_Refresh__addItem.setRoundRect(true);
        btn_Refresh__addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Refresh__addItemActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Rp.");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt_total.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txt_total.setForeground(new java.awt.Color(255, 255, 255));
        txt_total.setText("Total");

        txt_lama.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Lama Peminjaman");

        jLabel41.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Hari");

        javax.swing.GroupLayout panelGlass3Layout = new javax.swing.GroupLayout(panelGlass3);
        panelGlass3.setLayout(panelGlass3Layout);
        panelGlass3Layout.setHorizontalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass3Layout.createSequentialGroup()
                        .addComponent(btn_Refresh__addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelGlass3Layout.createSequentialGroup()
                        .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass3Layout.createSequentialGroup()
                                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelGlass3Layout.createSequentialGroup()
                                        .addComponent(txt_lama, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel41)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelGlass3Layout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        panelGlass3Layout.setVerticalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(27, 27, 27)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addComponent(btn_Refresh__addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txt_total))
                .addGap(34, 34, 34))
        );

        btn_Refresh__addItem2.setForeground(new java.awt.Color(255, 255, 255));
        btn_Refresh__addItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refreshh.png"))); // NOI18N
        btn_Refresh__addItem2.setText("Refresh");
        btn_Refresh__addItem2.setRoundRect(true);
        btn_Refresh__addItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Refresh__addItem2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Kode Barang");

        lbl_kategori.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_kategori.setForeground(new java.awt.Color(255, 255, 255));
        lbl_kategori.setText("lbl_merek");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kategori");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Nama Barang");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Harga");

        lbl_harga.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_harga.setForeground(new java.awt.Color(255, 255, 255));
        lbl_harga.setText("lbl_merek");

        lbl_nama.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_nama.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nama.setText("lbl_merek");

        javax.swing.GroupLayout panelGlass4Layout = new javax.swing.GroupLayout(panelGlass4);
        panelGlass4.setLayout(panelGlass4Layout);
        panelGlass4Layout.setHorizontalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(182, 182, 182))
                    .addGroup(panelGlass4Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass4Layout.createSequentialGroup()
                        .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGlass4Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addGroup(panelGlass4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(61, 61, 61)))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        panelGlass4Layout.setVerticalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbl_kategori))
                .addGap(18, 18, 18)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lbl_nama))
                .addGap(18, 18, 18)
                .addGroup(panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lbl_harga))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nama_peminjam", "kode_barang", "kategori", "nama_barang", "harga", "tgl_pinjam", "tgl_kembali", "lama", "total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btn_create_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(btn_Refresh__addItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGlass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGlass3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGlass4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_create_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Refresh__addItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_create_addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_addItemActionPerformed
        create();
    }//GEN-LAST:event_btn_create_addItemActionPerformed

    private void btn_Refresh__addItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Refresh__addItem2ActionPerformed
        loadTabel();
    }//GEN-LAST:event_btn_Refresh__addItem2ActionPerformed

    private void btn_Refresh__addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Refresh__addItemActionPerformed
        hitungselisih();
    }//GEN-LAST:event_btn_Refresh__addItemActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String st = (String) jComboBox1.getSelectedItem();
        ResultSet rst = con.querySelectAll("tb_produk", "kode='" + st + "'");
        try {
            while (rst.next()) {

                this.lbl_kategori.setText(rst.getString("kategori"));
                this.lbl_nama.setText(rst.getString("nama"));
                this.lbl_harga.setText(rst.getString("harga"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_Refresh__addItem;
    private usu.widget.ButtonGlass btn_Refresh__addItem2;
    private usu.widget.ButtonGlass btn_create_addItem;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNik;
    private javax.swing.JLabel lbl_alamat;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_harga;
    private javax.swing.JLabel lbl_kategori;
    private javax.swing.JLabel lbl_nama;
    private javax.swing.JLabel lbl_tlp;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass3;
    private usu.widget.glass.PanelGlass panelGlass4;
    private javax.swing.JTextField txt_lama;
    private javax.swing.JLabel txt_total;
    // End of variables declaration//GEN-END:variables

    private void loadMobil() {
        rs = con.querySelectAll("tb_produk");
        try {
            while (rs.next()) {
                    jComboBox1.addItem(rs.getString("kode"));
            }
        } catch (Exception e) {
            Logger.getLogger(FormPenyewaan.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void hitungselisih() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String strDate1 = df.format(jDateChooser1.getDate());
            String strDate2 = df.format(jDateChooser2.getDate());
            Date Tanggal1 = df.parse(strDate1);
            Date Tanggal2 = df.parse(strDate2);
            long Hari1 = Tanggal1.getTime();
            long Hari2 = Tanggal2.getTime();
            
            if (Hari2 < Hari1) {
                JOptionPane.showMessageDialog(this, "Inputkan tanggal pengembalian dengan benar");
                return;
            }
            
            long diff = Hari2 - Hari1;
            long Lama = diff / (24 * 60 * 60 * 1000);
            String Hasil = (Long.toString(Lama));
            txt_lama.setText(Hasil);

            int harga_sewa = Integer.parseInt(lbl_harga.getText()); // lbl_harga di pars ke integer
            int lama_sewa = Integer.parseInt(txt_lama.getText());   // txt_lama di pars ke integer
            int Total = harga_sewa * lama_sewa;                     // mencari total Harga
            String a = Integer.toString(Total);
            txt_total.setText(a);

        } catch (Exception a) {
            JOptionPane.showMessageDialog(this, "Masukan Tanggal Peminjaman dan Tanggal Pengembalian");
        }
    }
    
    
    private void loadTabel() {
        String namaKolom[] = {"nama_peminjam", "kode_barang", "kategori", "nama_barang", "harga", "tgl_pinjam", "tgl_kembali", "lama", "total"};
        rs = con.querySelect(namaKolom, "tb_transaksi");
        jTable1.setModel(new ResultSetTable(rs)); //,"tgl_pinjam","tgl_kembali" ,jDateChooser1.getDateFormatString(),jDateChooser2.getDateFormatString()
    }

    private void create(){
        try {
            if (!lblNama.getText().isEmpty()) {
                if (!jikakeluar()) {
                    JOptionPane.showMessageDialog(this, "maaf barang ini sedang tidak tersedia");
                } else {
                    String kolom[] = {"nama_peminjam", "kode_barang", "kategori", "nama_barang", "harga", "tgl_pinjam", "tgl_kembali", "lama", "total"};
                    java.util.Date tgl = (java.util.Date) this.jDateChooser1.getDate();
                    java.util.Date tgl1 = (java.util.Date) this.jDateChooser2.getDate();

                    String isi[] = {lblNama.getText(), jComboBox1.getSelectedItem().toString(), lbl_kategori.getText(), lbl_nama.getText(), lbl_harga.getText() , new java.sql.Date(tgl.getTime()).toString(), new java.sql.Date(tgl1.getTime()).toString(), txt_lama.getText(), txt_total.getText()};
                    System.out.println(con.queryInsert("tb_transaksi", kolom, isi));

//                    JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
                    cekstatus();
                    add_peminjam();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error input data");
            System.out.println("salah");
        }
        loadTabel();
        clear();
    }
    
    private void clear() {
        txt_total.setText("");
        txt_lama.setText("");
        // boxnopol.addItem(rs.getString("nopol"));
        //jDateChooser1.addNotify();
        //jDateChooser2.addNotify();
    }
    
    
    public boolean jikakeluar() throws SQLException {
        boolean hasil;

        rs = con.querySelectAll("tb_produk", "kode ='" + jComboBox1.getSelectedItem().toString() + "'");
        while (rs.next()) {
            status1 = rs.getString("status");
        }
        if (status1.equals("Keluar")) {
            hasil = false;
        } else {
            hasil = true;
        }
        return hasil;

    }
    
    
    
    public void cekstatus() throws SQLException {
        rs = con.querySelectAll("tb_produk", "kode ='" + jComboBox1.getSelectedItem().toString() + "'");
        while (rs.next()) {
            status1 = rs.getString("status");

        }
        String update_status = "Keluar";
        String kolom[] = {"status"};
        String isi[] = {update_status};
        con.queryUpdate("tb_produk", kolom, isi, "kode='" + jComboBox1.getSelectedItem().toString() + "'");
    }
    
    
    
    public void add_peminjam() {

        String kolom[] = {"nama", "nik", "alamat", "telp", "email"};
        String isi[] = {lblNama.getText(), lblNik.getText(), lbl_alamat.getText(), lbl_tlp.getText(), lbl_email.getText()};
        System.out.println(con.queryInsert("tb_peminjam", kolom, isi));
        JOptionPane.showMessageDialog(this, "Data Peminjam Berhasil Disimpan");
    }
    
}