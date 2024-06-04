/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dados.AppDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class CadastrarRecepcionista extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarRecepcionista
     */
    public CadastrarRecepcionista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeRecepcionista = new javax.swing.JLabel();
        txtSenhaRecepcionista = new javax.swing.JTextField();
        lblSenhaRecepcionista = new javax.swing.JLabel();
        bntCadastrar = new javax.swing.JButton();
        txtNomeRecepcionista = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Recepcionista - ADS Consultas");
        getContentPane().setLayout(null);

        lblNomeRecepcionista.setText("Nome:");
        getContentPane().add(lblNomeRecepcionista);
        lblNomeRecepcionista.setBounds(60, 60, 50, 30);

        txtSenhaRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaRecepcionistaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenhaRecepcionista);
        txtSenhaRecepcionista.setBounds(110, 140, 310, 30);

        lblSenhaRecepcionista.setText("Senha:");
        getContentPane().add(lblSenhaRecepcionista);
        lblSenhaRecepcionista.setBounds(60, 140, 50, 30);

        bntCadastrar.setText("Cadastrar");
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntCadastrar);
        bntCadastrar.setBounds(190, 220, 90, 30);

        txtNomeRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeRecepcionistaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeRecepcionista);
        txtNomeRecepcionista.setBounds(110, 60, 310, 30);

        setSize(new java.awt.Dimension(496, 315));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaRecepcionistaActionPerformed

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
        String nome, senha;

        nome = txtSenhaRecepcionista.getText();
        senha = txtSenhaRecepcionista.getText();

        try{
            new AppDao().cadastrarRep(nome, senha);
            
            JOptionPane.showMessageDialog(null, "Recepcionista cadastrado com sucesso!");
            
            txtNomeRecepcionista.setText("");
            txtSenhaRecepcionista.setText("");
            dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar localizar o Driver.");
        } catch (SQLException ex) {
            if (ex.getMessage().contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Recepcionista já cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar localizar o Banco de Dados." + ex.getMessage());
            }
        }
    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void txtNomeRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeRecepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeRecepcionistaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarRecepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastrar;
    private javax.swing.JLabel lblNomeRecepcionista;
    private javax.swing.JLabel lblSenhaRecepcionista;
    private javax.swing.JTextField txtNomeRecepcionista;
    private javax.swing.JTextField txtSenhaRecepcionista;
    // End of variables declaration//GEN-END:variables
}