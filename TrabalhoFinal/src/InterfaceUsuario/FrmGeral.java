/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

/**
 *
 * @author Iara
 */
public class FrmGeral extends javax.swing.JFrame {

    /**
     * Creates new form FrmGeral
     */
    public FrmGeral() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        MnCadastro = new javax.swing.JMenu();
        MniFuncionario = new javax.swing.JMenuItem();
        MniPredio = new javax.swing.JMenuItem();
        MniCampus = new javax.swing.JMenuItem();
        MniTarefas = new javax.swing.JMenuItem();
        MniMaterial = new javax.swing.JMenuItem();
        MnListar = new javax.swing.JMenu();
        MniFuncionario2 = new javax.swing.JMenuItem();
        MniPredio2 = new javax.swing.JMenuItem();
        MniCampus2 = new javax.swing.JMenuItem();
        MniTarefas1 = new javax.swing.JMenuItem();
        MniMaterial2 = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Internato Federal");

        MnCadastro.setText("Cadastro");
        MnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnCadastroActionPerformed(evt);
            }
        });

        MniFuncionario.setText("Funcionario");
        MniFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniFuncionarioActionPerformed(evt);
            }
        });
        MnCadastro.add(MniFuncionario);

        MniPredio.setText("Predio");
        MniPredio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniPredioActionPerformed(evt);
            }
        });
        MnCadastro.add(MniPredio);

        MniCampus.setText("Campus");
        MniCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniCampusActionPerformed(evt);
            }
        });
        MnCadastro.add(MniCampus);

        MniTarefas.setText("Tarefas Semanais");
        MniTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniTarefasActionPerformed(evt);
            }
        });
        MnCadastro.add(MniTarefas);

        MniMaterial.setText("Material");
        MniMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniMaterialActionPerformed(evt);
            }
        });
        MnCadastro.add(MniMaterial);

        jMenuBar1.add(MnCadastro);

        MnListar.setText("Listar");

        MniFuncionario2.setText("Funcionario");
        MniFuncionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniFuncionario2ActionPerformed(evt);
            }
        });
        MnListar.add(MniFuncionario2);

        MniPredio2.setText("Predio");
        MniPredio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniPredio2ActionPerformed(evt);
            }
        });
        MnListar.add(MniPredio2);

        MniCampus2.setText("Campus");
        MniCampus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniCampus2ActionPerformed(evt);
            }
        });
        MnListar.add(MniCampus2);

        MniTarefas1.setText("Tarefas Semanais");
        MniTarefas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniTarefas1ActionPerformed(evt);
            }
        });
        MnListar.add(MniTarefas1);

        MniMaterial2.setText("Material");
        MniMaterial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniMaterial2ActionPerformed(evt);
            }
        });
        MnListar.add(MniMaterial2);

        jMenuBar1.add(MnListar);

        MenuRelatorio.setText("Relatorio");

        jMenuItem1.setText("jMenuItem1");
        MenuRelatorio.add(jMenuItem1);

        jMenuBar1.add(MenuRelatorio);

        MenuSair.setText("Sair");
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MniMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniMaterialActionPerformed
        FrmCadastroMaterial janela = new FrmCadastroMaterial();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_MniMaterialActionPerformed

    private void MniTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniTarefasActionPerformed
        FrmCadastroTarefas janela = new FrmCadastroTarefas();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_MniTarefasActionPerformed

    private void MniFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniFuncionarioActionPerformed
        FrmCadastroFuncionario janela = new FrmCadastroFuncionario();
        add(janela);
        janela.setVisible(true);
    
    }//GEN-LAST:event_MniFuncionarioActionPerformed

    private void MnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnCadastroActionPerformed
        
    }//GEN-LAST:event_MnCadastroActionPerformed

    private void MniPredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniPredioActionPerformed
        FrmPredio janela = new FrmPredio();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_MniPredioActionPerformed

    private void MniCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniCampusActionPerformed
        FrmCampus janela = new FrmCampus();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_MniCampusActionPerformed

    private void MniFuncionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniFuncionario2ActionPerformed
        FrmListaFuncionario janela = new FrmListaFuncionario();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_MniFuncionario2ActionPerformed

    private void MniPredio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniPredio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MniPredio2ActionPerformed

    private void MniCampus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniCampus2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MniCampus2ActionPerformed

    private void MniTarefas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniTarefas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MniTarefas1ActionPerformed

    private void MniMaterial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniMaterial2ActionPerformed
        FrmListaMaterial janela = new FrmListaMaterial();
        add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_MniMaterial2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGeral().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JMenu MnCadastro;
    private javax.swing.JMenu MnListar;
    private javax.swing.JMenuItem MniCampus;
    private javax.swing.JMenuItem MniCampus2;
    private javax.swing.JMenuItem MniFuncionario;
    private javax.swing.JMenuItem MniFuncionario2;
    private javax.swing.JMenuItem MniMaterial;
    private javax.swing.JMenuItem MniMaterial2;
    private javax.swing.JMenuItem MniPredio;
    private javax.swing.JMenuItem MniPredio2;
    private javax.swing.JMenuItem MniTarefas;
    private javax.swing.JMenuItem MniTarefas1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
