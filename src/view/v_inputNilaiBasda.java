/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author dallasarivle
 */
public class v_inputNilaiBasda extends javax.swing.JFrame {

    /**
     * Creates new form v_inputNilaiPemro
     */
    public v_inputNilaiBasda() {
        initComponents();
    }

    public String getNilaiSBD() {
        String sbd = this.nilaiSBD.getSelectedItem().toString();
        if (this.nilaiSBD.getSelectedItem().toString() == "<none>") {
            sbd = " ";
        } else {
            sbd = this.nilaiSBD.getSelectedItem().toString();
        }
        return sbd;
    }

    public String getNilaisql() {
        String sql = this.nilaiSQL.getSelectedItem().toString();
        if (this.nilaiSQL.getSelectedItem().toString() == "<none>") {
            sql = " ";
        } else {
            sql = this.nilaiSBD.getSelectedItem().toString();
        }
        return sql;
    }

    public void pesan(String pesan) {
        JOptionPane.showMessageDialog(null, pesan);
    }

    public JButton tblInput() {
        return tblinput;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nilaiSBD = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nilaiSQL = new javax.swing.JComboBox<>();
        tblinput = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Lemon/Milk", 1, 24)); // NOI18N
        jLabel1.setText("INput Nilai Basda");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jLabel2.setFont(new java.awt.Font("Lemon/Milk", 1, 12)); // NOI18N
        jLabel2.setText("Silakan Isi sesuai nilai Anda");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        jLabel3.setText("Sistem Basis Data");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        nilaiSBD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "A", "AB", "B", "BC", "C", "CD", "D", "E" }));
        getContentPane().add(nilaiSBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 270, 40));

        jLabel4.setText("Pemrograman SQL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        nilaiSQL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "A", "AB", "B", "BC", "C", "CD", "D", "E" }));
        getContentPane().add(nilaiSQL, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 270, 40));

        tblinput.setText("Input");
        getContentPane().add(tblinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//     * @param args the command line arguments
//     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

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
            java.util.logging.Logger.getLogger(v_inputNilaiBasda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_inputNilaiBasda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_inputNilaiBasda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_inputNilaiBasda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_inputNilaiBasda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> nilaiSBD;
    private javax.swing.JComboBox<String> nilaiSQL;
    private javax.swing.JButton tblinput;
    // End of variables declaration//GEN-END:variables
}
