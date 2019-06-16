
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class PemesananTiketKeretaApi extends javax.swing.JFrame {
    int eksekutif, bisnis, ekonomi, harga, beli, total, bayar, kembali;
    DefaultTableModel model;
    /**
     * Creates new form PemesananTiketKeretaApi
     */
    public PemesananTiketKeretaApi() {
        initComponents();
        this.setLocationRelativeTo(null);//make center
        String []judul={"Jurusan","Jenis","Harga","Nomor Kursi","Nama Penumpang","Jumlah Beli","Total Bayar","Uang Bayar","Uang Kembali"};
        model = new DefaultTableModel(judul,0);
        tabel_kereta_api.setModel(model);
        tampilkan();
        
    }
    
    private void tampilkan(){
        
        int row = tabel_kereta_api.getRowCount();
        for(int a=0;a<row;a++){
            model.removeRow(0);
        }
        try{
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiket","root","");
        ResultSet rs = cn.createStatement().executeQuery("select * from tiketkeretaapi");
        while(rs.next()){
            String data[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)};
            model.addRow(data);
        }
      } catch (SQLException ex) {
          Logger.getLogger(PemesananTiketKeretaApi.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    
    private void reset(){
        txt_harga.setText("");
        jurusan.setSelectedItem("Pilih Jurusan");
        txt_kursi.setText("");
        txt_penumpang.setText("");
        txt_total.setText("");
        txt_beli.setText("");
        txt_bayar.setText("");
        txt_kembali.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jenis = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jurusan = new javax.swing.JComboBox<>();
        rb_eksekutif = new javax.swing.JRadioButton();
        rb_bisnis = new javax.swing.JRadioButton();
        rb_ekonomi = new javax.swing.JRadioButton();
        txt_harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_input = new javax.swing.JButton();
        txt_kursi = new javax.swing.JTextField();
        txt_penumpang = new javax.swing.JTextField();
        txt_beli = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_bayar = new javax.swing.JTextField();
        txt_kembali = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_kereta_api = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data Kereta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Jurusan");

        jenis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jenis.setText("Jenis");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Harga");

        jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==PILIH==", "Bandar Kalipah", "Binjai", "Kisaran", "Rantau Parapat", "Siantar", "Tebing Tinggi" }));
        jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurusanActionPerformed(evt);
            }
        });

        rb_eksekutif.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rb_eksekutif.setText("Eksekutif");
        rb_eksekutif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_eksekutifActionPerformed(evt);
            }
        });

        rb_bisnis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rb_bisnis.setText("Bisnis");
        rb_bisnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_bisnisActionPerformed(evt);
            }
        });

        rb_ekonomi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rb_ekonomi.setText("Ekonomi");
        rb_ekonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_ekonomiActionPerformed(evt);
            }
        });

        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jenis)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jurusan, 0, 1, Short.MAX_VALUE)
                    .addComponent(txt_harga)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_ekonomi)
                            .addComponent(rb_eksekutif)
                            .addComponent(rb_bisnis))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenis)
                    .addComponent(rb_eksekutif))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_bisnis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_ekonomi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 310, 240));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nomor Kursi");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nama Penumpang");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Jumlah Beli");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Total Bayar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Uang Bayar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Uang Kembali");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, -1, -1));

        btn_input.setBackground(new java.awt.Color(0, 151, 230));
        btn_input.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_input.setText("Input");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        jPanel1.add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        txt_kursi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kursiActionPerformed(evt);
            }
        });
        jPanel1.add(txt_kursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 140, -1));
        jPanel1.add(txt_penumpang, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 140, -1));

        txt_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_beliActionPerformed(evt);
            }
        });
        txt_beli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_beliKeyReleased(evt);
            }
        });
        jPanel1.add(txt_beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 140, -1));

        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        jPanel1.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 140, -1));

        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });
        txt_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bayarKeyReleased(evt);
            }
        });
        jPanel1.add(txt_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 140, -1));

        txt_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(txt_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 140, -1));

        jPanel3.setBackground(new java.awt.Color(41, 128, 185));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Pemesanan Tiket Kereta Api");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        btn_update.setBackground(new java.awt.Color(0, 151, 230));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        btn_delete.setBackground(new java.awt.Color(194, 54, 22));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        btn_reset.setBackground(new java.awt.Color(194, 54, 22));
        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, -1, -1));

        btn_batal.setBackground(new java.awt.Color(194, 54, 22));
        btn_batal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_batal.setText("Keluar");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        tabel_kereta_api.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "Title 7", "null", "Title 9"
            }
        ));
        tabel_kereta_api.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_kereta_apiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_kereta_api);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_batal)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_batal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bayarActionPerformed
        // TODO add your handling code here:
        //menginput jumlah beli tiket dan mengetahui total pembayaran
        bayar=Integer.parseInt(txt_bayar.getText());
        kembali=Integer.parseInt(txt_total.getText());
        total=bayar-kembali;
        txt_kembali.setText(String.valueOf(total));
    }//GEN-LAST:event_txt_bayarActionPerformed

    private void jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurusanActionPerformed
        // TODO add your handling code here:
        //membuat kondisi untuk menentukan harga sesuai jurusan
        if(jurusan.getSelectedItem().equals("Pilih Jurusan")){
            buttonGroup1.clearSelection();
            txt_harga.setText("");
        }
        else if(jurusan.getSelectedItem().equals("Bandar Kalipah")){
            eksekutif=300000;
            bisnis=290000;
            ekonomi=260000;
        }
        else if(jurusan.getSelectedItem().equals("Binjai")){
            eksekutif=15000;
            bisnis=10000;
            ekonomi=5000;
        }
        else if(jurusan.getSelectedItem().equals("Kisaran")){
            eksekutif=230000;
            bisnis=200000;
            ekonomi=160000;
        }
        else if(jurusan.getSelectedItem().equals("Rantau Parapat")){
            eksekutif=290000;
            bisnis=270000;
            ekonomi=250000;
        }
        else if(jurusan.getSelectedItem().equals("Siantar")){
            eksekutif=310000;
            bisnis=300000;
            ekonomi=280000;
        }
        else if(jurusan.getSelectedItem().equals("Tebing Tinggi")){
            eksekutif=280000;
            bisnis=250000;
            ekonomi=230000;
        }
    }//GEN-LAST:event_jurusanActionPerformed

    private void rb_eksekutifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_eksekutifActionPerformed
        // TODO add your handling code here:
        //menampilkan harga setelah pilih jenis kelas VIP
        if(rb_eksekutif.isSelected()){
            txt_harga.setText(String.valueOf(eksekutif));
        }
    }//GEN-LAST:event_rb_eksekutifActionPerformed

    private void rb_bisnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_bisnisActionPerformed
        // TODO add your handling code here:
        //menampilkan harga setelah pilih jenis kelas ekonomi
        if(rb_bisnis.isSelected()){
            txt_harga.setText(String.valueOf(bisnis));
        }
    }//GEN-LAST:event_rb_bisnisActionPerformed

    private void txt_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_beliActionPerformed
        // TODO add your handling code here:
        //menginput jumlah beli tiket dan mengetahui total pembayaran
        beli=Integer.parseInt(txt_beli.getText());
        harga=Integer.parseInt(txt_harga.getText());
        total=bayar*harga;
        txt_total.setText(String.valueOf(total));
    }//GEN-LAST:event_txt_beliActionPerformed

    private void txt_beliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_beliKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=Integer.valueOf(txt_harga.getText());
        b=Integer.valueOf(txt_beli.getText());
        c=a*b;
        txt_total.setText(""+c);
    }//GEN-LAST:event_txt_beliKeyReleased

    private void txt_bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bayarKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=Integer.valueOf(txt_bayar.getText());
        b=Integer.valueOf(txt_total.getText());
        c=a-b;
        txt_kembali.setText(""+c);
    }//GEN-LAST:event_txt_bayarKeyReleased

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        try {
            // TODO add your handling code here:
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiket","root","");
            cn.createStatement().executeUpdate("insert into tiketkeretaapi values"+"('"+jurusan.getSelectedItem()+"','"+rb_eksekutif.getText()+"','"+txt_harga.getText()+"','"+txt_kursi.getText()+"','"+txt_penumpang.getText()+"','"+txt_beli.getText()+"','"+txt_total.getText()+"','"+txt_bayar.getText()+"','"+txt_kembali.getText()+"')");
            tampilkan();
            reset();
            
            buttonGroup1.clearSelection();
            txt_harga.setText("");
            jurusan.setSelectedItem("Pilih Jurusan");
            txt_kursi.setText("");
            txt_penumpang.setText("");
            txt_total.setText("");
            txt_beli.setText("");
            txt_bayar.setText("");
            txt_kembali.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(PemesananTiketKeretaApi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this,
                "Konfirmasi Keluar Aplikasi",
                "Yakin untuk keluar dari program",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            MenuPilihanTiket Menu;
            Menu = new MenuPilihanTiket();
            Menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_batalActionPerformed

    private void rb_ekonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_ekonomiActionPerformed
        // TODO add your handling code here:
        if(rb_ekonomi.isSelected()){
            txt_harga.setText(String.valueOf(ekonomi));
        }
    }//GEN-LAST:event_rb_ekonomiActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_kursiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kursiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kursiActionPerformed

    private void txt_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kembaliActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiket","root","");
            cn.createStatement().executeUpdate("update tiketkeretaapi set jenis='"+rb_eksekutif.getText()+"',harga='"+txt_harga.getText()+"',nomor_kursi='"+txt_kursi.getText()+"',nama_penumpang='"+txt_penumpang.getText()+"',jumlah_beli='"+txt_beli.getText()+"',total_bayar='"+txt_total.getText()+"',uang_bayar='"+txt_bayar.getText()+"',uang_kembali='"+txt_kembali.getText()+"',where jurusan='"+jurusan.getSelectedItem()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(PemesananTiketKeretaApi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tabel_kereta_apiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_kereta_apiMouseClicked
        // TODO add your handling code here:
        int i = tabel_kereta_api.getSelectedRow();
        if(i>-1){
            jurusan.setSelectedItem(model.getValueAt(i, 0).toString());
            rb_eksekutif.setText(model.getValueAt(i, 1).toString());
            txt_harga.setText(model.getValueAt(i, 2).toString());
            txt_kursi.setText(model.getValueAt(i, 3).toString());
            txt_penumpang.setText(model.getValueAt(i, 4).toString());
            txt_beli.setText(model.getValueAt(i, 5).toString());
            txt_total.setText(model.getValueAt(i, 6).toString());
            txt_bayar.setText(model.getValueAt(i, 7).toString());
            txt_kembali.setText(model.getValueAt(i, 8).toString());
        }
    }//GEN-LAST:event_tabel_kereta_apiMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiket","root","");
            cn.createStatement().executeUpdate("delete from tiketkeretaapi where jurusan='"+jurusan.getSelectedItem()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(PemesananTiketKeretaApi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(PemesananTiketKeretaApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemesananTiketKeretaApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemesananTiketKeretaApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemesananTiketKeretaApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemesananTiketKeretaApi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jenis;
    private javax.swing.JComboBox<String> jurusan;
    private javax.swing.JRadioButton rb_bisnis;
    private javax.swing.JRadioButton rb_ekonomi;
    private javax.swing.JRadioButton rb_eksekutif;
    private javax.swing.JTable tabel_kereta_api;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_beli;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_kembali;
    private javax.swing.JTextField txt_kursi;
    private javax.swing.JTextField txt_penumpang;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
