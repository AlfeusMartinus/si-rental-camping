
import Database.KoneksiDatabase;
import Database.ResultSetTable;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
 public class TambahProduk extends javax.swing.JInternalFrame {
    
    ResultSet rs;
    KoneksiDatabase con;

    public TambahProduk() {
        
        con =new KoneksiDatabase(new Database.Parameter().HOST_DB,new Database.Parameter().USERNAME_DB,new Database.Parameter().PASSWORD_DB);
        initComponents();
        loadTabel(); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlass1 = new usu.widget.glass.PanelGlass();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_kategoriproduk_addItem = new javax.swing.JTextField();
        txt_namaproduk_addItem = new javax.swing.JTextField();
        txt_kodebarang_addItem = new javax.swing.JTextField();
        txt_hargasewa_addItem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combo_Status = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_create_addItem = new usu.widget.ButtonGlass();
        btn_Edit_addItem = new usu.widget.ButtonGlass();
        btn_Delete__addItem = new usu.widget.ButtonGlass();
        btn_Refresh__addItem = new usu.widget.ButtonGlass();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        txt_search_AddItem = new javax.swing.JTextField();
        btn_Search_AddItem = new usu.widget.ButtonGlass();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableproduk = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kategori Produk");
        jLabel3.setPreferredSize(new java.awt.Dimension(88, 17));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Produk");
        jLabel4.setPreferredSize(new java.awt.Dimension(88, 17));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kode Barang");
        jLabel6.setPreferredSize(new java.awt.Dimension(88, 17));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Harga Sewa");
        jLabel7.setPreferredSize(new java.awt.Dimension(88, 17));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(":");
        jLabel9.setPreferredSize(new java.awt.Dimension(88, 17));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(":");
        jLabel10.setPreferredSize(new java.awt.Dimension(88, 17));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(":");
        jLabel12.setPreferredSize(new java.awt.Dimension(88, 17));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText(":");
        jLabel13.setPreferredSize(new java.awt.Dimension(88, 17));

        txt_kategoriproduk_addItem.setBackground(new java.awt.Color(255, 255, 255));

        txt_namaproduk_addItem.setBackground(new java.awt.Color(255, 255, 255));

        txt_kodebarang_addItem.setBackground(new java.awt.Color(255, 255, 255));
        txt_kodebarang_addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodebarang_addItemActionPerformed(evt);
            }
        });

        txt_hargasewa_addItem.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("/ Hari");

        combo_Status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tersedia", "Kosong" }));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status Barang");
        jLabel8.setPreferredSize(new java.awt.Dimension(88, 17));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(":");
        jLabel14.setPreferredSize(new java.awt.Dimension(88, 17));

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_kategoriproduk_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_namaproduk_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kodebarang_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(txt_hargasewa_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kategoriproduk_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_namaproduk_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_kodebarang_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_hargasewa_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combo_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(panelGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 940, 240));

        btn_create_addItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_create_addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.png"))); // NOI18N
        btn_create_addItem.setText("Add");
        btn_create_addItem.setRoundRect(true);
        btn_create_addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_addItemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create_addItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 150, -1));

        btn_Edit_addItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_Edit_addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil_edit.png"))); // NOI18N
        btn_Edit_addItem.setText("Edit");
        btn_Edit_addItem.setPreferredSize(new java.awt.Dimension(88, 39));
        btn_Edit_addItem.setRoundRect(true);
        btn_Edit_addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Edit_addItemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Edit_addItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 150, -1));

        btn_Delete__addItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete__addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash_box.png"))); // NOI18N
        btn_Delete__addItem.setText("Delete");
        btn_Delete__addItem.setPreferredSize(new java.awt.Dimension(88, 39));
        btn_Delete__addItem.setRoundRect(true);
        btn_Delete__addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Delete__addItemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete__addItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 150, -1));

        btn_Refresh__addItem.setForeground(new java.awt.Color(255, 255, 255));
        btn_Refresh__addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btn_Refresh__addItem.setText("Refresh");
        btn_Refresh__addItem.setPreferredSize(new java.awt.Dimension(88, 39));
        btn_Refresh__addItem.setRoundRect(true);
        btn_Refresh__addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Refresh__addItemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Refresh__addItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 150, -1));

        txt_search_AddItem.setBackground(new java.awt.Color(255, 255, 255));
        txt_search_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_AddItemActionPerformed(evt);
            }
        });

        btn_Search_AddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_lense.png"))); // NOI18N
        btn_Search_AddItem.setRoundRect(true);
        btn_Search_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Search_AddItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass2Layout = new javax.swing.GroupLayout(panelGlass2);
        panelGlass2.setLayout(panelGlass2Layout);
        panelGlass2Layout.setHorizontalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt_search_AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Search_AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelGlass2Layout.setVerticalGroup(
            panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass2Layout.createSequentialGroup()
                .addGroup(panelGlass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txt_search_AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Search_AddItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelGlass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 850, 50));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tableproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id_barang", "kategori produk", "nama barang", "kode barang", "harga sewa", "status"
            }
        ));
        tableproduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableprodukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableproduk);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 930, 250));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 46)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Form Tambah Produk");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 490, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(957, 731));
        jLabel1.setMinimumSize(new java.awt.Dimension(957, 731));
        jLabel1.setPreferredSize(new java.awt.Dimension(957, 731));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Edit_addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Edit_addItemActionPerformed
        try {
            if( !txt_kategoriproduk_addItem.getText().isEmpty() && !txt_namaproduk_addItem.getText().isEmpty() && !txt_kodebarang_addItem.getText().isEmpty() && !txt_hargasewa_addItem.getText().isEmpty()){
                String kolom[] = {"kategori","nama","kode","harga","status"};
                String isi[] = { txt_kategoriproduk_addItem.getText(),txt_namaproduk_addItem.getText(),txt_kodebarang_addItem.getText(),txt_hargasewa_addItem.getText(),combo_Status.getSelectedItem().toString()};
                con.queryUpdate("tb_produk", kolom, isi,"id_produk='"+String.valueOf(tableproduk.getValueAt(tableproduk.getSelectedRow(),0))+"'");
                JOptionPane.showMessageDialog(this, "Data Berhasil Diedit");
            }else{
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error edit data");
        }
        loadTabel();
        clear();
    }//GEN-LAST:event_btn_Edit_addItemActionPerformed

    private void txt_kodebarang_addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodebarang_addItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodebarang_addItemActionPerformed

    private void btn_create_addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_addItemActionPerformed
        // TODO add your handling code here:
        create();
    }//GEN-LAST:event_btn_create_addItemActionPerformed

    private void btn_Delete__addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Delete__addItemActionPerformed
        // TODO add your handling code here:
        try {
            String id=String.valueOf(tableproduk.getValueAt(tableproduk.getSelectedRow(),0));
                if (JOptionPane.showConfirmDialog(this, "Yakin menghapus data", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            con.queryDelete("tb_produk","id_produk="+id);

            }else{
                return;
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pilih id terlebih dahulu");
        }
        loadTabel();
        clear();
    }//GEN-LAST:event_btn_Delete__addItemActionPerformed

    private void btn_Refresh__addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Refresh__addItemActionPerformed
        // TODO add your handling code here:
        loadTabel();
    }//GEN-LAST:event_btn_Refresh__addItemActionPerformed

    private void btn_Search_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Search_AddItemActionPerformed
        // TODO add your handling code here:
         if(txt_search_AddItem.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Isikan data pencarian");
        }else{
            try {
                rs=con.querySelectAll("tb_produk", "id_produk LIKE '%"+txt_search_AddItem.getText()+"%' OR kategori LIKE '%"+txt_search_AddItem.getText()+"%' OR nama LIKE '%"+txt_search_AddItem.getText()+"%' OR kode LIKE '%"+txt_search_AddItem.getText()+"%' OR harga LIKE '%"+txt_search_AddItem.getText()+"%'");
                tableproduk.setModel(new Database.ResultSetTable(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pencarian Error");
            }
        }
        clear();
    }//GEN-LAST:event_btn_Search_AddItemActionPerformed

    private void tableprodukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableprodukMouseClicked
        // TODO add your handling code here:
        txt_kategoriproduk_addItem.setText(String.valueOf(tableproduk.getValueAt(tableproduk.getSelectedRow(),1)));
        txt_namaproduk_addItem.setText(String.valueOf( tableproduk.getValueAt(tableproduk.getSelectedRow(),2)));
        txt_kodebarang_addItem.setText(String.valueOf( tableproduk.getValueAt(tableproduk.getSelectedRow(),3)));
        txt_hargasewa_addItem.setText(String.valueOf( tableproduk.getValueAt(tableproduk.getSelectedRow(),4)));
    }//GEN-LAST:event_tableprodukMouseClicked

    private void txt_search_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_AddItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_AddItemActionPerformed

    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TambahProduk().setVisible(true);
            }
        });
    }
            
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_Delete__addItem;
    private usu.widget.ButtonGlass btn_Edit_addItem;
    private usu.widget.ButtonGlass btn_Refresh__addItem;
    private usu.widget.ButtonGlass btn_Search_AddItem;
    private usu.widget.ButtonGlass btn_create_addItem;
    private javax.swing.JComboBox combo_Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass2;
    private javax.swing.JTable tableproduk;
    private javax.swing.JTextField txt_hargasewa_addItem;
    private javax.swing.JTextField txt_kategoriproduk_addItem;
    private javax.swing.JTextField txt_kodebarang_addItem;
    private javax.swing.JTextField txt_namaproduk_addItem;
    private javax.swing.JTextField txt_search_AddItem;
    // End of variables declaration//GEN-END:variables



private void loadTabel() {
        String namaKolom[] = {"id_produk","kategori","nama","kode","harga","status"};
        rs=con.querySelect(namaKolom,"tb_produk");
        tableproduk.setModel(new ResultSetTable(rs));
    }

 private void create() {
      
        try {
 
            if( !txt_kategoriproduk_addItem.getText().isEmpty() && !txt_namaproduk_addItem.getText().isEmpty() && !txt_kodebarang_addItem.getText().isEmpty() && !txt_hargasewa_addItem.getText().isEmpty()){
                String kolom[] = {"kategori","nama","kode","harga","status"};
                String isi[] = { txt_kategoriproduk_addItem.getText(),txt_namaproduk_addItem.getText(),txt_kodebarang_addItem.getText(),txt_hargasewa_addItem.getText(),combo_Status.getSelectedItem().toString()};
                
                System.out.println( con.queryInsert("tb_produk",kolom,isi));
               
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
            }else{
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
        
        txt_kategoriproduk_addItem.setText("");
        txt_namaproduk_addItem.setText("");
        txt_kodebarang_addItem.setText("");
        txt_hargasewa_addItem.setText("");
       
    }
}

