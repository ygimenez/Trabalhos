/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoCSS.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Beatriz
 */
public class JFCliente extends javax.swing.JFrame {
   Connection conexao = null;
   PreparedStatement pst = null;
   ResultSet rs = null;  
   int flag;
     
    /**
     * Creates new form JFCliente
     */
    public JFCliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtId = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edtLogin = new javax.swing.JTextField();
        edtSenhaE = new javax.swing.JTextField();
        edtSenha = new javax.swing.JTextField();
        CB_Perfil = new javax.swing.JComboBox<>();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        Nome5 = new javax.swing.JLabel();
        radID = new javax.swing.JRadioButton();
        RadNome = new javax.swing.JRadioButton();
        edtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Confirmar Senha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel3.setText("Nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));
        getContentPane().add(edtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 80, -1));
        getContentPane().add(edtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 370, -1));

        jLabel4.setText("Login");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel5.setText("Senha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));
        getContentPane().add(edtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 180, -1));
        getContentPane().add(edtSenhaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 180, -1));
        getContentPane().add(edtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 180, -1));

        CB_Perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione sua Opção", "Administrador", "Usuário" }));
        getContentPane().add(CB_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 260, -1));

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        Nome5.setText("Pesquisar Por:");
        getContentPane().add(Nome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 30));

        radID.setText("ID");
        getContentPane().add(radID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        RadNome.setText("Nome");
        getContentPane().add(RadNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        edtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(edtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 190, -1));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        tbUsuario.setBackground(new java.awt.Color(0, 206, 209));
        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Login", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        flag = 0;

        edtNome.setEnabled(true);
        edtLogin.setEnabled(true);
        edtSenha.setEnabled(true);
        edtSenhaE.setEnabled(true);
        CB_Perfil.setEnabled(true);

        edtId.setText("");
        edtNome.setText("");
        edtLogin.setText("");
        edtSenha.setText("");
        edtSenhaE.setText("");

        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnInserir.setEnabled(false);

    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        flag = 1;

        edtNome.setEnabled(true);;
        edtLogin.setEnabled(true);
        edtSenha.setEnabled(true);
        edtSenhaE.setEnabled(true);
        CB_Perfil.setEnabled(true);

        btnInserir.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnDeletar.setEnabled(false);
        btnCancelar.setEnabled(true);

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        deletar();

    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:

        if (edtNome.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Insira um Nome para o Usuário");
            return;
        }
        if(edtLogin.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Insira um Login para o Usuário");
            return;
        }
        if (edtSenha.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Insira a Senha para o Usuário");
            return;
        }
        if (edtSenhaE.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Confirme a Senha");
            return;
        }
        if (CB_Perfil.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Selecione um Tipo para Usuário");
            return;
        }

        if (flag==0){

            if (edtSenha.getText().equals(edtSenhaE.getText())){
                insereUsu();

                edtNome.setEnabled(false);
                edtLogin.setEnabled(false);
                edtSenha.setEnabled(false);
                edtSenhaE.setEnabled(false);
                CB_Perfil.setEnabled(false);

                btnAlterar.setEnabled(true);
                btnSalvar.setEnabled(false);
                btnDeletar.setEnabled(true);
                btnCancelar.setEnabled(false);
                btnInserir.setEnabled(true);
                // atualizaID();

            } else {
                JOptionPane.showMessageDialog(this,"As senhas não conferem. Digite novamente");
                edtSenha.setText(null);
                edtSenhaE.setText(null);
                edtSenha.requestFocus();
            }

        }else{

            if (edtSenha.getText().equals(edtSenhaE.getText())){
                alteraUsu();
            } else {
                JOptionPane.showMessageDialog(this,"As senhas não conferem. Digite novamente");
                edtSenha.setText(null);
                edtSenhaE.setText(null);
                edtSenha.requestFocus();
            }

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        edtNome.setEnabled(false);;
        edtLogin.setEnabled(false);
        edtSenha.setEnabled(false);
        edtSenhaE.setEnabled(false);
        CB_Perfil.setEnabled(false);

        btnInserir.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnCancelar.setEnabled(false);

        edtId.setText("");
        edtNome.setText("");
        edtLogin.setText("");
        edtSenha.setText("");
        edtSenhaE.setText("");

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void edtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:

        if (radID.isSelected()){
            consultaId();

            if (tbUsuario.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Registro não encontrado");
            }}

            if (RadNome.isSelected()){
                consultaNome();

                if (tbUsuario.getRowCount()==0){
                    JOptionPane.showMessageDialog(this, "Registro não encontrado");
                }}
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
        // TODO add your handling code here:
        setarCampos();
        btnAlterar.setEnabled(true);
        btnDeletar.setEnabled(true);
    }//GEN-LAST:event_tbUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Perfil;
    private javax.swing.JLabel Nome5;
    private javax.swing.JRadioButton RadNome;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField edtId;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtPesquisa;
    private javax.swing.JTextField edtSenha;
    private javax.swing.JTextField edtSenhaE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radID;
    private javax.swing.JTable tbUsuario;
    // End of variables declaration//GEN-END:variables
}
