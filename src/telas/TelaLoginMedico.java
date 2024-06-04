/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dados.AppDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gilmar.rjunior
 */
public class TelaLoginMedico extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLoginMedico() {
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

        lblNomeMedico = new javax.swing.JLabel();
        txtNomeMedico = new javax.swing.JTextField();
        lblSenhaMedico = new javax.swing.JLabel();
        bntEntrar = new javax.swing.JButton();
        pswMedico = new javax.swing.JPasswordField();
        lblSenhaMedico1 = new javax.swing.JLabel();
        txtCrmMedico = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Médico - ADS Consultas");
        getContentPane().setLayout(null);

        lblNomeMedico.setText("Nome:");
        getContentPane().add(lblNomeMedico);
        lblNomeMedico.setBounds(60, 60, 50, 30);

        txtNomeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeMedico);
        txtNomeMedico.setBounds(110, 60, 310, 30);

        lblSenhaMedico.setText("Senha:");
        getContentPane().add(lblSenhaMedico);
        lblSenhaMedico.setBounds(60, 110, 50, 30);

        bntEntrar.setText("Entrar");
        bntEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntEntrar);
        bntEntrar.setBounds(190, 220, 90, 30);
        getContentPane().add(pswMedico);
        pswMedico.setBounds(110, 110, 310, 30);

        lblSenhaMedico1.setText("CRM:");
        getContentPane().add(lblSenhaMedico1);
        lblSenhaMedico1.setBounds(60, 160, 50, 30);

        try {
            txtCrmMedico.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######/UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCrmMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrmMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCrmMedico);
        txtCrmMedico.setBounds(110, 160, 150, 30);

        setSize(new java.awt.Dimension(503, 296));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeMedicoActionPerformed

    private void bntEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEntrarActionPerformed
        String nome, senha, crm;
        
        nome = txtNomeMedico.getText();
        senha = pswMedico.getText();
        crm = txtCrmMedico.getText();
        
        try {
            ResultSet resultado = new AppDao().logarMedico(nome, senha, crm);
            
            if(resultado.next()){
                new ProntuarioMedico().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos.");
            }   
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Entre em contato com o administrador e informe o erro: " + ex.getMessage());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Entre em contato com o administrador e informe o erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_bntEntrarActionPerformed

    private void txtCrmMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrmMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCrmMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoginMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEntrar;
    private javax.swing.JLabel lblNomeMedico;
    private javax.swing.JLabel lblSenhaMedico;
    private javax.swing.JLabel lblSenhaMedico1;
    private javax.swing.JPasswordField pswMedico;
    private javax.swing.JFormattedTextField txtCrmMedico;
    private javax.swing.JTextField txtNomeMedico;
    // End of variables declaration//GEN-END:variables
}