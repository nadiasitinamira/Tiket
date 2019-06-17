
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
 * @author ASUS
 */
public class PemesananTiketPesawat extends javax.swing.JFrame {

    int harga, beli, total, bayar, kembali, jumlah;
    DefaultTableModel model;
    /**
     * Creates new form PemesananTiketPesawat
     */
    public PemesananTiketPesawat() {
        initComponents();
        this.setLocationRelativeTo(null);//make center
        String []judul={"Kode Pesawat","Nama Pesawat","Berangkat dari","Tujuan Pesawat","Harga Tiket","Jumlah Tiket","Total Bayar","Uang Bayar","Uang Kembali"};
        model = new DefaultTableModel(judul,0);
        tabelpesawat.setModel(model);
        tampilkan();
    }
    
    private void tampilkan(){
        
        int row = tabelpesawat.getRowCount();
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
        kode_pesawat.setSelectedItem("==PILIH==");
        nama_pesawat.setText("");
        brngkt_txt.setText("");
        tujuan_pesawat.setSelectedItem("==PILIH==");
        harga_tiket.setText("");
        jumlah_tiket.setText("");
        total_bayar.setText("");
        uang_bayar.setText("");
        uang_kembali.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kode_pesawat = new javax.swing.JComboBox<>();
        nama_pesawat = new javax.swing.JTextField();
        tujuan_pesawat = new javax.swing.JComboBox<>();
        harga_tiket = new javax.swing.JTextField();
        total_bayar = new javax.swing.JTextField();
        uang_bayar = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        uang_kembali = new javax.swing.JTextField();
        input = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jumlah_tiket = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelpesawat = new javax.swing.JTable();
        btn_keluar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        brngkt_txt = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pemesanan Tiket Pesawat");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setText("Kode Pesawat");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel3.setText("Nama Pesawat");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel4.setText("Tujuan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel5.setText("Harga Tiket");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel6.setText("Jumlah Tiket");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel7.setText("Total Bayar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabel8.setText("Uang Bayar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel9.setText("Uang Kembali");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        kode_pesawat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==PILIH==", "MPT", "GRD", "BTV" }));
        kode_pesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_pesawatActionPerformed(evt);
            }
        });
        jPanel1.add(kode_pesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 210, -1));
        jPanel1.add(nama_pesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 210, -1));

        tujuan_pesawat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==PILIH==", "Jakarta", "Medan", "Sabang", "Lampung", "Padang", "Kalimantan" }));
        tujuan_pesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuan_pesawatActionPerformed(evt);
            }
        });
        jPanel1.add(tujuan_pesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 210, -1));

        harga_tiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_tiketActionPerformed(evt);
            }
        });
        harga_tiket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                harga_tiketKeyReleased(evt);
            }
        });
        jPanel1.add(harga_tiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 210, -1));

        total_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_bayarActionPerformed(evt);
            }
        });
        jPanel1.add(total_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 210, -1));

        uang_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uang_bayarActionPerformed(evt);
            }
        });
        jPanel1.add(uang_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 210, -1));

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        jPanel1.add(hitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        uang_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uang_kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(uang_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 210, -1));

        input.setText("Input");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        jPanel1.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, -1, -1));

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        jumlah_tiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_tiketActionPerformed(evt);
            }
        });
        jumlah_tiket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jumlah_tiketKeyReleased(evt);
            }
        });
        jPanel1.add(jumlah_tiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 210, -1));

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, -1, -1));

        tabelpesawat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabelpesawat);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 540, 610, 100));

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, -1, -1));

        jLabel10.setText("Berangkat dari");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));
        jPanel1.add(brngkt_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kode_pesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_pesawatActionPerformed
        // TODO add your handling code here:
        if (kode_pesawat.getSelectedItem().equals("MPT")){
            nama_pesawat.setText("Merpati");
        }else if(kode_pesawat.getSelectedItem().equals("GRD")){
            nama_pesawat.setText("Garuda");
        }else if(kode_pesawat.getSelectedItem().equals("BTV")){
            nama_pesawat.setText("Batavia");
        }
    }//GEN-LAST:event_kode_pesawatActionPerformed

    private void tujuan_pesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuan_pesawatActionPerformed
        // TODO add your handling code here:
        if(tujuan_pesawat.getSelectedItem().equals("==PILIH==")){
            buttonGroup1.clearSelection();
            harga_tiket.setText("");
        }
        else if(tujuan_pesawat.getSelectedItem().equals("Jakarta")){
            harga_tiket.setText("300000");
        }
        else if(tujuan_pesawat.getSelectedItem().equals("Medan")){
            harga_tiket.setText("1500000");
        }
        else if(tujuan_pesawat.getSelectedItem().equals("Lampung")){
            harga_tiket.setText("1000000");
        }
        else if(tujuan_pesawat.getSelectedItem().equals("Sabang")){
            harga_tiket.setText("600000");
        }
        else if(tujuan_pesawat.getSelectedItem().equals("Padang")){
            harga_tiket.setText("2000000");
        }
        else if(tujuan_pesawat.getSelectedItem().equals("Kalimantan")){
            harga_tiket.setText("2500000");
        }
    }//GEN-LAST:event_tujuan_pesawatActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        int total=Integer.parseInt(total_bayar.getText());
        int uang=Integer.parseInt(uang_bayar.getText());
        int hasil=uang-total;
        uang_kembali.setText(Integer.toString(hasil));
    }//GEN-LAST:event_hitungActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
        try {
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiket","root","");
            cn.createStatement().executeUpdate("insert into tiket_pesawat values"+"('"+kode_pesawat.getSelectedItem()+"','"+nama_pesawat.getText()+"','"+brngkt_txt.getText()+"','"+tujuan_pesawat.getSelectedItem()+"','"+harga_tiket.getText()+"','"+jumlah_tiket.getText()+"','"+total_bayar.getText()+"','"+uang_bayar.getText()+"','"+uang_kembali.getText()+"')");
            tampilkan();
            reset();
            
            buttonGroup1.clearSelection();
            kode_pesawat.setSelectedItem("==PILIH==");
            nama_pesawat.setText("");
            brngkt_txt.setText("");
            tujuan_pesawat.setSelectedItem("==PILIH==");
            harga_tiket.setText("");
            jumlah_tiket.setText("");
            total_bayar.setText("");
            uang_bayar.setText("");
            uang_kembali.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(PemesananTiketPesawat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiket","root","");
            cn.createStatement().executeUpdate("delete from tiket_pesawat where kode_pesawat='"+kode_pesawat.getSelectedItem()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(PemesananTiketPesawat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void uang_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uang_bayarActionPerformed
        // TODO add your handling code here:
        bayar=Integer.parseInt(uang_bayar.getText());
        kembali=Integer.parseInt(total_bayar.getText());
        total=bayar-kembali;
        uang_kembali.setText(String.valueOf(total));
    }//GEN-LAST:event_uang_bayarActionPerformed

    private void total_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_bayarActionPerformed

    private void jumlah_tiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_tiketActionPerformed
        // TODO add your handling code here:
        beli=Integer.parseInt(jumlah_tiket.getText());
        harga=Integer.parseInt(harga_tiket.getText());
        total=bayar*harga;
        total_bayar.setText(String.valueOf(total));
    }//GEN-LAST:event_jumlah_tiketActionPerformed

    private void jumlah_tiketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlah_tiketKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=Integer.valueOf(harga_tiket.getText());
        b=Integer.valueOf(jumlah_tiket.getText());
        c=a*b;
        total_bayar.setText(""+c);
    }//GEN-LAST:event_jumlah_tiketKeyReleased

    private void harga_tiketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_harga_tiketKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=Integer.valueOf(harga_tiket.getText());
        b=Integer.valueOf(total_bayar.getText());
        c=a-b;
        uang_kembali.setText(""+c);
    }//GEN-LAST:event_harga_tiketKeyReleased

    private void harga_tiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_tiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_tiketActionPerformed

    private void uang_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uang_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uang_kembaliActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
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
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String sql = "UPDATE tiket_pesawat SET kode_pesawat='"+kode_pesawat.getSelectedItem()+"',nama_pesawat='"+nama_pesawat.getText()+"', berangkat_dari='"+brngkt_txt.getText()+"',tujuan_pesawat='"+tujuan_pesawat.getSelectedItem()+"',harga_tiket='"+harga_tiket.getText()+"',jumlah_tiket='"+jumlah_tiket.getText()+"',total_bayar='"+total_bayar.getText()+"',uang_bayar='"+uang_bayar.getText()+"',uang_kembali='"+uang_kembali.getText()+"' where kode_pesawat='"+kode_pesawat.getSelectedItem()+"'";
            java.sql.Connection conn=(Connection)MyConnection.getConnection();
            java.sql.PreparedStatement pst =conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        }catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        new PemesananTiketPesawat().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(PemesananTiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemesananTiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemesananTiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemesananTiketPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemesananTiketPesawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brngkt_txt;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField harga_tiket;
    private javax.swing.JButton hitung;
    private javax.swing.JButton input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jumlah_tiket;
    private javax.swing.JComboBox<String> kode_pesawat;
    private javax.swing.JTextField nama_pesawat;
    private javax.swing.JTable tabelpesawat;
    private javax.swing.JTextField total_bayar;
    private javax.swing.JComboBox<String> tujuan_pesawat;
    private javax.swing.JTextField uang_bayar;
    private javax.swing.JTextField uang_kembali;
    // End of variables declaration//GEN-END:variables
}
