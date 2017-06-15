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
public class v_inputNilaiRPL extends javax.swing.JFrame {

    /**
     * Creates new form v_inputNilaiPemro
     */
    public v_inputNilaiRPL() {
        initComponents();
    }
    
    public String getNilaiPRPL() {
        String prpl = this.nilaiPRPL.getSelectedItem().toString();
        if (this.nilaiPRPL.getSelectedItem().toString() == "<none>") {
            prpl = " ";
        } else {
            prpl = this.nilaiPRPL.getSelectedItem().toString();
        }
        return prpl;
    }
    
    public String getNilaiOOD() {
        String ood = this.nilaiOOD.getSelectedItem().toString();
        if (this.nilaiOOD.getSelectedItem().toString() == "<none>") {
            ood = " ";
        } else {
            ood = this.nilaiOOD.getSelectedItem().toString();
        }
        return ood;
    }
    
    public String getNilaiAPS() {
        String aps = this.nilaiAPS.getSelectedItem().toString();
        if (this.nilaiAPS.getSelectedItem().toString() == "<none>") {
            aps = " ";
        } else {
            aps = this.nilaiAPS.getSelectedItem().toString();
        }
        return aps;
    }

    public void pesan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
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

        nilaiAPS = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nilaiPRPL = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nilaiOOD = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tblinput = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nilaiAPS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "A", "AB", "B", "BC", "C", "CD", "D", "E" }));
        getContentPane().add(nilaiAPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 270, 40));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Lemon/Milk", 1, 24)); // NOI18N
        jLabel1.setText("INput Nilai RPL");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 90));

        jLabel2.setFont(new java.awt.Font("Lemon/Milk", 1, 12)); // NOI18N
        jLabel2.setText("Silakan Isi sesuai nilai Anda");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        jLabel3.setText("Perancangan Rekayasa Perangkat Lunak");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        nilaiPRPL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "A", "AB", "B", "BC", "C", "CD", "D", "E" }));
        getContentPane().add(nilaiPRPL, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 270, 40));

        jLabel4.setText("Perancangan Berorientasi Obyek");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        nilaiOOD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "A", "AB", "B", "BC", "C", "CD", "D", "E" }));
        getContentPane().add(nilaiOOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 270, 40));

        jLabel5.setText("Analisis Perancangan Sistem");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        tblinput.setText("Input");
        getContentPane().add(tblinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, -1, -1));

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
            java.util.logging.Logger.getLogger(v_inputNilaiRPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_inputNilaiRPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_inputNilaiRPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_inputNilaiRPL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_inputNilaiRPL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> nilaiAPS;
    private javax.swing.JComboBox<String> nilaiOOD;
    private javax.swing.JComboBox<String> nilaiPRPL;
    private javax.swing.JButton tblinput;
    // End of variables declaration//GEN-END:variables
}
