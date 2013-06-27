/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

import DomainModel.Aluno;
import Negocio.AlunoBO;
import javax.swing.JOptionPane;

/**
 *
 * @author Iara
 */
public class FrmEditarAluno extends javax.swing.JInternalFrame {
    Aluno aluno;
    AlunoBO bo;

    /**
     * Creates new form FrmAluno
     */
    public FrmEditarAluno(Aluno a, AlunoBO d) {
        initComponents();
        this.aluno = a;
        this.bo = d;

        carregaCampos();
    }
    
    private void carregaCampos() {
        
        TxtNome.setText(aluno.getNome());
        TxtCpf.setText(aluno.getCpf());
        TxtRg.setText(aluno.getRg());
        TxtTelefone.setText(aluno.getTelefone());
        TxtEmail.setText(aluno.getEmail());
        TxtMedia.setText(Double.toString(aluno.getMedia()));
        TxtIdCurso.setText(Integer.toString(aluno.getIdcurso()));
        TxtNomeResponsavel.setText(aluno.getNomeresp());
        TxtTelefoneResponsavel.setText(aluno.getTelefoneresp());
     }

    private void carregaObjeto() {
        aluno.setNome(TxtNome.getText());
        aluno.setCpf(TxtCpf.getText());
        aluno.setRg(TxtRg.getText());
        aluno.setTelefone(TxtTelefone.getText());
        aluno.setEmail(TxtEmail.getText());
        aluno.setMedia(Double.parseDouble(TxtMedia.getText()));
        aluno.setIdcurso(Integer.parseInt(TxtIdCurso.getText()));
        aluno.setNomeresp(TxtNomeResponsavel.getText());
        aluno.setTelefoneresp(TxtTelefoneResponsavel.getText());
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
        TxtRg = new javax.swing.JTextField();
        TxtTelefone = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtMedia = new javax.swing.JTextField();
        TxtIdCurso = new javax.swing.JTextField();
        TxtNomeResponsavel = new javax.swing.JTextField();
        TxtNome = new javax.swing.JTextField();
        TxtTelefoneResponsavel = new javax.swing.JTextField();
        TxtCpf = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BtnLimparCampos = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        LblNome = new javax.swing.JLabel();
        LblCpf = new javax.swing.JLabel();
        LblRg = new javax.swing.JLabel();
        LblTelefone = new javax.swing.JLabel();
        LblEmail = new javax.swing.JLabel();
        LblMedia = new javax.swing.JLabel();
        LblIdCurso = new javax.swing.JLabel();
        LblResponsavlel = new javax.swing.JLabel();
        LblTelefoneResponsavel = new javax.swing.JLabel();
        BtnApagar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        TxtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefoneActionPerformed(evt);
            }
        });

        TxtIdCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdCursoActionPerformed(evt);
            }
        });

        TxtTelefoneResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefoneResponsavelActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnLimparCampos.setText("Limpar Campos");
        BtnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparCamposActionPerformed(evt);
            }
        });
        BtnLimparCampos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                BtnLimparCamposAncestorRemoved(evt);
            }
        });

        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        LblNome.setText("Nome:");

        LblCpf.setText("CPF: ");

        LblRg.setText("RG: ");

        LblTelefone.setText("Telefone:");

        LblEmail.setText("Email:");

        LblMedia.setText("Media:");

        LblIdCurso.setText("ID - Curso");

        LblResponsavlel.setText("Responsavel");

        LblTelefoneResponsavel.setText("Telefone:");

        BtnApagar.setText("Apagar");
        BtnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNome)
                            .addComponent(LblRg)
                            .addComponent(LblTelefone)
                            .addComponent(LblEmail)
                            .addComponent(LblMedia)
                            .addComponent(LblIdCurso)
                            .addComponent(LblResponsavlel)
                            .addComponent(LblTelefoneResponsavel)
                            .addComponent(LblCpf))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtIdCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtMedia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtRg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtNomeResponsavel)
                            .addComponent(TxtTelefoneResponsavel)
                            .addComponent(TxtNome)
                            .addComponent(TxtCpf))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLimparCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnApagar)
                        .addGap(0, 2, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCpf)
                    .addComponent(TxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblRg))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTelefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblMedia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblIdCurso))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblResponsavlel))
                .addGap(18, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefoneResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTelefoneResponsavel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnLimparCampos)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnApagar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefoneActionPerformed

    private void TxtIdCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdCursoActionPerformed

    private void TxtTelefoneResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefoneResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefoneResponsavelActionPerformed

    private void BtnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparCamposActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente limpar os campos?")
                == 0) {
            TxtNome.setText(null);
            TxtCpf.setText(null);
            TxtRg.setText(null);
            TxtTelefone.setText(null);
            TxtEmail.setText(null);
            TxtMedia.setText(null);
            TxtIdCurso.setText(null);
            TxtNomeResponsavel.setText(null);
            TxtTelefoneResponsavel.setText(null);
            
            JOptionPane.showMessageDialog(rootPane, "Pronto!");
        }
    }//GEN-LAST:event_BtnLimparCamposActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja Salvar?") == 0) {

                carregaObjeto();
                
                if (bo.Salvar(aluno)) {
                    JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Falha ao salvar! Consulte o administrador do sistema!");
                }

            } else {                
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar! Consulte o administrador do sistema!");
        }
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void BtnLimparCamposAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_BtnLimparCamposAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLimparCamposAncestorRemoved

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Sair?") 
                == 0){
            this.dispose();
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApagarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Remover?")
            == 0){
            
            if (bo.Apagar(aluno)) {
                    JOptionPane.showMessageDialog(rootPane, "Apagado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Nao foi possivel apagar!");
                }
            
            
        }
    }//GEN-LAST:event_BtnApagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApagar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnLimparCampos;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel LblCpf;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblIdCurso;
    private javax.swing.JLabel LblMedia;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblResponsavlel;
    private javax.swing.JLabel LblRg;
    private javax.swing.JLabel LblTelefone;
    private javax.swing.JLabel LblTelefoneResponsavel;
    private javax.swing.JTextField TxtCpf;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtIdCurso;
    private javax.swing.JTextField TxtMedia;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JTextField TxtNomeResponsavel;
    private javax.swing.JTextField TxtRg;
    private javax.swing.JTextField TxtTelefone;
    private javax.swing.JTextField TxtTelefoneResponsavel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
