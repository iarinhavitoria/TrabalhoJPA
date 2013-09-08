/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

import DomainModel.Funcionario;
import Negocio.FuncionarioBO;
import javax.swing.JOptionPane;

/**
 *
 * @author John Kevin
 */
public class FrmCadastroFuncionario extends javax.swing.JInternalFrame {
    FuncionarioBO fbo = new FuncionarioBO();

    /**
     * Creates new form FrmCadastroFuncionario
     */
    public FrmCadastroFuncionario() {
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

        PnlFuncionario = new javax.swing.JPanel();
        TxtNome = new javax.swing.JTextField();
        TxtCpf = new javax.swing.JTextField();
        TxtTelefone = new javax.swing.JTextField();
        LblNome = new javax.swing.JLabel();
        LblCpf = new javax.swing.JLabel();
        LblTelefone = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setTitle("Cadastrar Funcionario");

        PnlFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        PnlFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Funcionario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        PnlFuncionario.setAutoscrolls(true);

        LblNome.setText("Nome:");

        LblCpf.setText("CPF:");

        LblTelefone.setText("Telefone:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        BtnLimpar.setText("Limpar Campo");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlFuncionarioLayout = new javax.swing.GroupLayout(PnlFuncionario);
        PnlFuncionario.setLayout(PnlFuncionarioLayout);
        PnlFuncionarioLayout.setHorizontalGroup(
            PnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFuncionarioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlFuncionarioLayout.createSequentialGroup()
                        .addGroup(PnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNome)
                            .addComponent(LblCpf)
                            .addComponent(LblTelefone))
                        .addGap(46, 46, 46)
                        .addGroup(PnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNome)
                            .addComponent(TxtCpf)
                            .addComponent(TxtTelefone)))
                    .addGroup(PnlFuncionarioLayout.createSequentialGroup()
                        .addGap(0, 59, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar)))
                .addGap(73, 73, 73))
        );
        PnlFuncionarioLayout.setVerticalGroup(
            PnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFuncionarioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNome))
                .addGap(18, 18, 18)
                .addGroup(PnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCpf))
                .addGap(18, 18, 18)
                .addGroup(PnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTelefone))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(PnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(BtnLimpar)
                    .addComponent(BtnCancelar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Funcionario f = new Funcionario(0, "", "", "");
        f.setNome(TxtNome.getText());
        f.setCpf(TxtCpf.getText());
        f.setTelefone(TxtTelefone.getText());
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja Salvar?") == 0) {
                if (fbo.Salvar(f)) { 
                    JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Falha ao salvar! Favor verificar os dados!");
                }

            } else {                
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente limpar os campos?")
                == 0) {
            TxtNome.setText(null);
            TxtCpf.setText(null);
            TxtTelefone.setText(null);
                       
            JOptionPane.showMessageDialog(rootPane, "Pronto!");
        }
        
        
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Sair?") 
                == 0){
            this.dispose();
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JLabel LblCpf;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblTelefone;
    private javax.swing.JPanel PnlFuncionario;
    private javax.swing.JTextField TxtCpf;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtTelefone;
    private javax.swing.JButton btnSalvar;
    // End of variables declaration//GEN-END:variables
}
