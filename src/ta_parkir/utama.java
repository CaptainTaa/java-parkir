/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_parkir;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author zurin
 */
public class utama extends javax.swing.JFrame {
    
    /**
     * Creates new form utama
     */
   koneksi c;
public static int kodeLogin=3;
ResultSet resultSet;
Statement statement;
    public utama(int login) {
        initComponents();
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
                kodeLogin = login;
belumLogin();

if (login == 0) {
    admin();
} else if (login == 1) {
    user();
} else {
    belumLogin();
}
    }
      private void belumLogin() {
        mnParkir.setEnabled(false);
         mnPendapatan.setEnabled(false);
    }
    private void admin() {
        mnParkir.setEnabled(true);
         mnPendapatan.setEnabled(true);
    }
    private void user() {
        mnParkir.setEnabled(true);
         mnPendapatan.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnParkir = new javax.swing.JMenu();
        mnPendapatan = new javax.swing.JMenu();
        mnKeluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Manajemen Parkir");
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dekstop-1000.jpg"))); // NOI18N

        mnParkir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Traffic Jam-64.png"))); // NOI18N
        mnParkir.setText("Parkir");
        mnParkir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnParkirMousePressed(evt);
            }
        });
        jMenuBar1.add(mnParkir);

        mnPendapatan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Money Transfer-64.png"))); // NOI18N
        mnPendapatan.setText("Pendapatan");
        mnPendapatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnPendapatanMousePressed(evt);
            }
        });
        jMenuBar1.add(mnPendapatan);

        mnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit-64.png"))); // NOI18N
        mnKeluar.setText("Keluar");
        mnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnKeluarMousePressed(evt);
            }
        });
        jMenuBar1.add(mnKeluar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnKeluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnKeluarMousePressed
        // TODO add your handling code here:
        Object[] options = {"Ya", "Tidak, tetap di halaman"};
        int dialog = JOptionPane.showOptionDialog(this, "Apakah Anda yakin akan Keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (dialog == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mnKeluarMousePressed

    private void mnParkirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnParkirMousePressed
        // TODO add your handling code here:
        new fParkir(this,true).setVisible(true);
    }//GEN-LAST:event_mnParkirMousePressed

    private void mnPendapatanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPendapatanMousePressed
        // TODO add your handling code here:
        new fPendapatan(this, true).setVisible(true);
    }//GEN-LAST:event_mnPendapatanMousePressed

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
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new utama(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnKeluar;
    private javax.swing.JMenu mnParkir;
    private javax.swing.JMenu mnPendapatan;
    // End of variables declaration//GEN-END:variables
}
