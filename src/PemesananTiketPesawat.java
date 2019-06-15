
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
    /**
     * Creates new form PemesananTiketPesawat
     */
    public PemesananTiketPesawat() {
        initComponents();
        this.setLocationRelativeTo(null);//make center
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        input = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        uang_kembali = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        uang_bayar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        total_bayar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jumlah_tiket = new javax.swing.JTextField();
        harga_tiket = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kelas_pesawat = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nama_pesawat = new javax.swing.JTextField();
        kode_pesawat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(41, 128, 185));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pemesanan Tiket Pesawat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 630, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Kode Pesawat");

        input.setBackground(new java.awt.Color(0, 151, 230));
        input.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        input.setText("Input");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(194, 54, 22));
        keluar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Uang Kembali");

        uang_kembali.setBackground(new java.awt.Color(241, 242, 246));

        hitung.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        uang_bayar.setBackground(new java.awt.Color(241, 242, 246));
        uang_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uang_bayarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Uang Bayar");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total Bayar");

        total_bayar.setBackground(new java.awt.Color(241, 242, 246));
        total_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_bayarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Jumlah Tiket");

        jumlah_tiket.setBackground(new java.awt.Color(241, 242, 246));
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

        harga_tiket.setBackground(new java.awt.Color(241, 242, 246));
        harga_tiket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                harga_tiketKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Harga Tiket");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Kelas Pesawat");

        kelas_pesawat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==PILIH==", "Kelas 1", "Kelas 2", "Kelas 3" }));
        kelas_pesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelas_pesawatActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nama Pesawat");

        nama_pesawat.setBackground(new java.awt.Color(241, 242, 246));

        kode_pesawat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==PILIH==", "MPT", "GRD", "BTV" }));
        kode_pesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_pesawatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)))
                        .addGap(154, 154, 154)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uang_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlah_tiket, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(harga_tiket, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kelas_pesawat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama_pesawat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kode_pesawat, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hitung)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(input)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(keluar))
                                .addComponent(uang_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kode_pesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nama_pesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(kelas_pesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(harga_tiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jumlah_tiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(uang_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(uang_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input)
                    .addComponent(keluar))
                .addGap(56, 56, 56))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 630, 540));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Pesawat", "Nama Pesawat", "Kelas Pesawat", "Jumlah Tiket"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_delete.setBackground(new java.awt.Color(194, 54, 22));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_delete.setText("Delete");

        jButton2.setBackground(new java.awt.Color(0, 151, 230));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(37, 37, 37)
                .addComponent(btn_delete)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(jButton2))
                .addContainerGap())
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

    private void kelas_pesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelas_pesawatActionPerformed
        // TODO add your handling code here:
        if(kode_pesawat.getSelectedItem().equals("MPT")){
            if(kelas_pesawat.getSelectedItem().equals("Kelas 1")){
                harga_tiket.setText("1500000");
            }else if(kelas_pesawat.getSelectedItem().equals("Kelas 2")){
                harga_tiket.setText("900000");
            }else if(kelas_pesawat.getSelectedItem().equals("Kelas 3")){
                harga_tiket.setText("500000");
            }
        }else if(kode_pesawat.getSelectedItem().equals("GRD")){
            if(kelas_pesawat.getSelectedItem().equals("Kelas 1")){
                harga_tiket.setText("1200000");
            }else if(kelas_pesawat.getSelectedItem().equals("Kelas 2")){
                harga_tiket.setText("800000");
            }else if(kelas_pesawat.getSelectedItem().equals("Kelas 3")){
                harga_tiket.setText("400000");
            }
        }else if(kode_pesawat.getSelectedItem().equals("BTV")){
            if(kelas_pesawat.getSelectedItem().equals("Kelas 1")){
                harga_tiket.setText("1000000");
            }else if(kelas_pesawat.getSelectedItem().equals("Kelas 2")){
                harga_tiket.setText("700000");
            }else if(kelas_pesawat.getSelectedItem().equals("Kelas 3")){
                harga_tiket.setText("300000");
            }
        }
    }//GEN-LAST:event_kelas_pesawatActionPerformed

    private void harga_tiketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_harga_tiketKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=Integer.valueOf(harga_tiket.getText());
        b=Integer.valueOf(total_bayar.getText());
        c=a-b;
        uang_kembali.setText(""+c);
    }//GEN-LAST:event_harga_tiketKeyReleased

    private void jumlah_tiketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlah_tiketKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=Integer.valueOf(harga_tiket.getText());
        b=Integer.valueOf(jumlah_tiket.getText());
        c=a*b;
        total_bayar.setText(""+c);
    }//GEN-LAST:event_jumlah_tiketKeyReleased

    private void jumlah_tiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_tiketActionPerformed
        // TODO add your handling code here:
        beli=Integer.parseInt(jumlah_tiket.getText());
        harga=Integer.parseInt(harga_tiket.getText());
        total=bayar*harga;
        total_bayar.setText(String.valueOf(total));
    }//GEN-LAST:event_jumlah_tiketActionPerformed

    private void total_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_bayarActionPerformed

    private void uang_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uang_bayarActionPerformed
        // TODO add your handling code here:
        bayar=Integer.parseInt(uang_bayar.getText());
        kembali=Integer.parseInt(total_bayar.getText());
        total=bayar-kembali;
        uang_kembali.setText(String.valueOf(total));
    }//GEN-LAST:event_uang_bayarActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        int total=Integer.parseInt(total_bayar.getText());
        int uang=Integer.parseInt(uang_bayar.getText());
        int hasil=uang-total;
        uang_kembali.setText(Integer.toString(hasil));
    }//GEN-LAST:event_hitungActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
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
    }//GEN-LAST:event_keluarActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
        nama_pesawat.setText("");
        harga_tiket.setText("");
        jumlah_tiket.setText("");
        total_bayar.setText("");
        uang_bayar.setText("");
        uang_kembali.setText("");
        kelas_pesawat.setSelectedIndex(0);
        kode_pesawat.setSelectedIndex(0);

    }//GEN-LAST:event_inputActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTable1MouseClicked

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
    private javax.swing.JButton btn_delete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField harga_tiket;
    private javax.swing.JButton hitung;
    private javax.swing.JButton input;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlah_tiket;
    private javax.swing.JComboBox<String> kelas_pesawat;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox<String> kode_pesawat;
    private javax.swing.JTextField nama_pesawat;
    private javax.swing.JTextField total_bayar;
    private javax.swing.JTextField uang_bayar;
    private javax.swing.JTextField uang_kembali;
    // End of variables declaration//GEN-END:variables
}
