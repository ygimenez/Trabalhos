/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetocss.view;

import javax.swing.JOptionPane;
import br.com.ProjetoCSS.model.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;
import br.com.ProjetoCSS.controller.ProdutoDAO;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.*;
import java.util.Vector;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author Yago
 */
public class JFProduto extends javax.swing.JFrame {

    private static int qtd = 0;
    private static ProdutoDAO pd;
    private static int pflag = 0;
    private static int iflag = 0;

    /**
     * Creates new form JFProduto
     */
    public JFProduto() {
        initComponents();
        JFProduto.pd = new ProdutoDAO();
        setLocationRelativeTo(null);
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
        grade = new javax.swing.JTable();
        t_consultar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        pid = new javax.swing.JRadioButton();
        pnome = new javax.swing.JRadioButton();
        pcat = new javax.swing.JRadioButton();
        cnome = new javax.swing.JTextField();
        dcat = new javax.swing.JComboBox<>();
        consultar = new javax.swing.JButton();
        t_cadastrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_desc = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t_qtd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_cat = new javax.swing.JTextField();
        inserir = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t_valor = new javax.swing.JFormattedTextField();
        exluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        m_consultar = new javax.swing.JMenu();
        m_cadastrar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setAutoRequestFocus(false);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grade.setAutoCreateRowSorter(true);
        grade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Descrição", "Quantidade", "Valor", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grade);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 530, 340));

        t_consultar.setName(""); // NOI18N
        t_consultar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultar produto");
        t_consultar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 11, -1, -1));

        cid.setName(""); // NOI18N
        t_consultar.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 47, 140, -1));

        buttonGroup1.add(pid);
        pid.setText("ID");
        pid.setName(""); // NOI18N
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        t_consultar.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, -1, -1));

        buttonGroup1.add(pnome);
        pnome.setText("Nome");
        pnome.setName(""); // NOI18N
        pnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnomeActionPerformed(evt);
            }
        });
        t_consultar.add(pnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 87, -1, -1));

        buttonGroup1.add(pcat);
        pcat.setText("Categoria");
        pcat.setName(""); // NOI18N
        pcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcatActionPerformed(evt);
            }
        });
        t_consultar.add(pcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 128, -1, -1));

        cnome.setName(""); // NOI18N
        cnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnomeActionPerformed(evt);
            }
        });
        t_consultar.add(cnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 88, 140, -1));

        dcat.setName(""); // NOI18N
        dcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcatActionPerformed(evt);
            }
        });
        t_consultar.add(dcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 129, 120, -1));

        consultar.setText("Consultar");
        consultar.setName(""); // NOI18N
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        t_consultar.add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 169, -1, -1));

        getContentPane().add(t_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 340));
        t_consultar.getAccessibleContext().setAccessibleName("");

        t_cadastrar.setName(""); // NOI18N
        t_cadastrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastrar produto");
        t_cadastrar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 10, -1, -1));

        t_nome.setName(""); // NOI18N
        t_cadastrar.add(t_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 47, 190, -1));

        jLabel3.setText("Nome");
        t_cadastrar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, -1));

        jLabel4.setText("Descrição");
        t_cadastrar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        t_desc.setColumns(20);
        t_desc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        t_desc.setLineWrap(true);
        t_desc.setRows(1);
        jScrollPane2.setViewportView(t_desc);

        t_cadastrar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 90, 190, 90));

        jLabel5.setText("Quantidade");
        t_cadastrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jButton1.setText("-");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        t_cadastrar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 40, 20));

        jButton2.setText("-10");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        t_cadastrar.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 210, -1, 20));

        t_qtd.setEditable(false);
        t_qtd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_qtd.setText("0");
        t_qtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_qtdActionPerformed(evt);
            }
        });
        t_qtd.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                t_qtdPropertyChange(evt);
            }
        });
        t_cadastrar.add(t_qtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 40, -1));

        jLabel6.setText("Valor");
        t_cadastrar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel7.setText("Categoria");
        t_cadastrar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 278, -1, -1));
        t_cadastrar.add(t_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 275, 127, -1));

        inserir.setText("Inserir");
        inserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inserirMouseClicked(evt);
            }
        });
        inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirActionPerformed(evt);
            }
        });
        t_cadastrar.add(inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        t_cadastrar.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jButton3.setText("+");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        t_cadastrar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 20));

        jButton4.setText("+10");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        t_cadastrar.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, 20));

        jLabel8.setText("R$");
        t_cadastrar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 243, -1, -1));
        t_cadastrar.add(t_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 90, -1));

        exluir.setText("Excluir");
        exluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exluirActionPerformed(evt);
            }
        });
        t_cadastrar.add(exluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        getContentPane().add(t_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 340));

        m_consultar.setText("Consultar");
        m_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_consultarMouseClicked(evt);
            }
        });
        m_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_consultarActionPerformed(evt);
            }
        });
        jMenuBar1.add(m_consultar);

        m_cadastrar.setText("Cadastrar/Editar");
        m_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_cadastrarMouseClicked(evt);
            }
        });
        m_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_cadastrarActionPerformed(evt);
            }
        });
        jMenuBar1.add(m_cadastrar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        consultar.setEnabled(true);
        cid.setEnabled(true);
        cnome.setEnabled(false);
        cnome.setText("");
        dcat.setEnabled(false);
        dcat.setSelectedIndex(-1);
        JFProduto.pflag = 1;
    }//GEN-LAST:event_pidActionPerformed

    private void cnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnomeActionPerformed

    private void m_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_consultarActionPerformed

    }//GEN-LAST:event_m_consultarActionPerformed

    private void m_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_cadastrarActionPerformed

    }//GEN-LAST:event_m_cadastrarActionPerformed

    private void m_consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_consultarMouseClicked
        t_consultar.setVisible(true);
        t_cadastrar.setVisible(false);
        reset();
    }//GEN-LAST:event_m_consultarMouseClicked

    private void m_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_cadastrarMouseClicked
        t_consultar.setVisible(false);
        t_cadastrar.setVisible(true);
        buttonGroup1.clearSelection();
        cid.setEnabled(false);
        cid.setText("");
        cnome.setEnabled(false);
        cnome.setText("");
        dcat.setEnabled(false);
        dcat.setSelectedIndex(-1);
        consultar.setEnabled(false);
        insertMode();
        reset();
    }//GEN-LAST:event_m_cadastrarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (qtd > 0) {
            qtd--;
            t_qtd.setText(Integer.toString(qtd));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (qtd <= 10) {
            qtd = 0;
        } else if (qtd > 10) {
            qtd -= 10;
        }
        t_qtd.setText(Integer.toString(qtd));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t_qtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_qtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_qtdActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        t_cadastrar.setVisible(false);
        DecimalFormat d = new DecimalFormat("#.00", DecimalFormatSymbols.getInstance(Locale.US));
        NumberFormatter format = new NumberFormatter(d);
        format.setFormat(d);
        format.setAllowsInvalid(false);
        t_valor.setFormatterFactory(new DefaultFormatterFactory(format));
        grade.setDefaultEditor(Object.class, null);
        grade.setSelectionMode(0);
        consultar.setEnabled(false);
        cid.setEnabled(false);
        cnome.setEnabled(false);
        dcat.setEnabled(false);
        reset();
    }//GEN-LAST:event_formWindowOpened

    private void t_qtdPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_t_qtdPropertyChange

    }//GEN-LAST:event_t_qtdPropertyChange

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        qtd++;
        t_qtd.setText(Integer.toString(qtd));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        qtd += 10;
        t_qtd.setText(Integer.toString(qtd));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirActionPerformed
        if (!getCadastroNulo()) {
            if (JFProduto.iflag == 2) {
                Produto p = new Produto();

                p.setNome_prod(t_nome.getText());
                p.setDesc_prod(t_desc.getText());
                p.setQtd_prod(qtd);
                p.setValor_prod(Float.parseFloat(t_valor.getText()));
                p.setCat_prod(t_cat.getText());

                pd.InsereProd(p);
                insertMode();
                reset();
            } else {
                Produto p = new Produto();

                p.setId_prod(Integer.parseInt(grade.getValueAt(grade.getSelectedRow(), 0).toString()));
                p.setNome_prod(t_nome.getText());
                p.setDesc_prod(t_desc.getText());
                p.setQtd_prod(qtd);
                p.setValor_prod(Float.parseFloat(t_valor.getText()));
                p.setCat_prod(t_cat.getText());

                pd.AlterarProd(p);
                reset();
                insertMode();
            }
        }
    }//GEN-LAST:event_inserirActionPerformed

    private void inserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inserirMouseClicked

    }//GEN-LAST:event_inserirMouseClicked

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        if (!getConsultaNula()) {
            select(JFProduto.pflag);
        }
    }//GEN-LAST:event_consultarActionPerformed

    private void pnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnomeActionPerformed
        consultar.setEnabled(true);
        cid.setEnabled(false);
        cid.setText("");
        cnome.setEnabled(true);
        dcat.setEnabled(false);
        dcat.setSelectedIndex(-1);
        JFProduto.pflag = 2;
    }//GEN-LAST:event_pnomeActionPerformed

    private void pcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcatActionPerformed
        consultar.setEnabled(true);
        cid.setEnabled(false);
        cnome.setEnabled(false);
        dcat.setEnabled(true);
        fetchItems();
        JFProduto.pflag = 3;
    }//GEN-LAST:event_pcatActionPerformed

    private void dcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcatActionPerformed

    }//GEN-LAST:event_dcatActionPerformed

    private void gradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeMouseClicked
        if (grade.getSelectedRow() != -1) {
            editMode();
        }
    }//GEN-LAST:event_gradeMouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        insertMode();
    }//GEN-LAST:event_cancelarActionPerformed

    private void exluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exluirActionPerformed
        Produto p = new Produto();

        p.setId_prod(Integer.parseInt(grade.getValueAt(grade.getSelectedRow(), 0).toString()));
        p.setNome_prod(t_nome.getText());
        p.setDesc_prod(t_desc.getText());
        p.setQtd_prod(qtd);
        p.setValor_prod(Float.parseFloat(t_valor.getText()));
        p.setCat_prod(t_cat.getText());

        if (JOptionPane.showConfirmDialog(null, "Deseja realmente deletar o item " + p.getId_prod() + " - " + p.getNome_prod() + "?", "Confirmação", YES_NO_OPTION) == 0) {
            pd.DeletaProd(p);
            reset();
        }
    }//GEN-LAST:event_exluirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFProduto().setVisible(true);
        });
    }

    public static DefaultTableModel fill(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        int count = metaData.getColumnCount();

        Vector<String> names = new Vector<>();
        for (int i = 1; i <= count; i++) {
            names.add(metaData.getColumnName(i));
        }

        Vector<Vector<Object>> data = new Vector<>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<>();
            for (int i = 1; i <= count; i++) {
                vector.add(rs.getObject(i));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, names);
    }

    public void reset() {
        try {
            grade.setModel(fill(pd.ConsultarAll()));
        } catch (SQLException ex) {
            printStackTrace();
        }
    }

    public void select(int f) {
        try {
            switch (f) {
                case 1:
                    grade.setModel(fill(pd.ConsultarID(Integer.parseInt(cid.getText()))));
                    break;
                case 2:
                    grade.setModel(fill(pd.ConsultarNome(cnome.getText())));
                    break;
                case 3:
                    grade.setModel(fill(pd.ConsultarCat(dcat.getSelectedItem().toString())));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo de pesquisa inválida");
                    break;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar valores: " + e);
        }
    }

    public void fetchItems() {
        try {
            ResultSet rs = pd.ConsultarAll();
            while (rs.next()) {
                dcat.addItem(rs.getString(6));
                for (int i = 0; i < dcat.getItemCount(); i++) {
                    for (int x = i + 1; x < dcat.getItemCount(); x++) {
                        if (dcat.getItemAt(i).equals(dcat.getItemAt(x))) {
                            dcat.removeItemAt(x);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao recuperar categorias: " + e);
        }
    }

    public void editMode() {
        inserir.setText("Aplicar");
        cancelar.setEnabled(true);
        iflag = 1;
        t_nome.setText(grade.getValueAt(grade.getSelectedRow(), 1).toString());
        t_desc.setText(grade.getValueAt(grade.getSelectedRow(), 2).toString());
        JFProduto.qtd = Integer.parseInt(grade.getValueAt(grade.getSelectedRow(), 3).toString());
        t_qtd.setText(Integer.toString(JFProduto.qtd));
        t_valor.setText(grade.getValueAt(grade.getSelectedRow(), 4).toString());
        t_cat.setText(grade.getValueAt(grade.getSelectedRow(), 5).toString());
    }

    public void insertMode() {
        inserir.setText("Inserir");
        cancelar.setEnabled(false);
        iflag = 2;
        t_nome.setText("");
        t_desc.setText("");
        JFProduto.qtd = 0;
        t_qtd.setText(Integer.toString(JFProduto.qtd));
        t_valor.setText("");
        t_cat.setText("");
    }

    public boolean getCadastroNulo() {
        boolean nomeNull = t_nome.getText().isEmpty();
        boolean descNull = t_desc.getText().isEmpty();
        boolean valorNull = t_valor.getText().isEmpty();
        boolean catNull = t_cat.getText().isEmpty();
        boolean campoNull = false;
        String alert = "Os campos a seguir devem ser preenchidos:";

        if (nomeNull || descNull || valorNull || catNull) {
            if (nomeNull) {
                alert += "\nNome";
            }
            if (descNull) {
                alert += "\nDescrição";
            }
            if (valorNull) {
                alert += "\nValor";
            }
            if (catNull) {
                alert += "\nCategoria";
            }
            JOptionPane.showMessageDialog(null, alert);
            campoNull = true;
        }

        return campoNull;
    }

    public boolean getConsultaNula() {
        boolean idNull = cid.getText().isEmpty();
        boolean nomeNull = cnome.getText().isEmpty();
        boolean catNull = dcat.getSelectedIndex() == -1;
        boolean campoNull = false;

        if (JFProduto.pflag == 1 && idNull) {
            JOptionPane.showMessageDialog(null, "Favor preencher o campo ID");
            campoNull = true;
        }
        if (JFProduto.pflag == 2 && nomeNull) {
            JOptionPane.showMessageDialog(null, "Favor preencher o campo nome");
            campoNull = true;
        }
        if (JFProduto.pflag == 3 && catNull) {
            JOptionPane.showMessageDialog(null, "Favor selecionar uma categoria");
            campoNull = true;
        }

        return campoNull;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cnome;
    private javax.swing.JButton consultar;
    private javax.swing.JComboBox<String> dcat;
    private javax.swing.JButton exluir;
    private javax.swing.JTable grade;
    private javax.swing.JButton inserir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu m_cadastrar;
    private javax.swing.JMenu m_consultar;
    private javax.swing.JRadioButton pcat;
    private javax.swing.JRadioButton pid;
    private javax.swing.JRadioButton pnome;
    private javax.swing.JPanel t_cadastrar;
    private javax.swing.JTextField t_cat;
    private javax.swing.JPanel t_consultar;
    private javax.swing.JTextArea t_desc;
    private javax.swing.JTextField t_nome;
    private javax.swing.JTextField t_qtd;
    private javax.swing.JFormattedTextField t_valor;
    // End of variables declaration//GEN-END:variables
}
