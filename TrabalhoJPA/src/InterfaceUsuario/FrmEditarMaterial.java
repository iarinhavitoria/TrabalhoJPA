/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

import DomainModel.Material;
import Negocio.MaterialBO;
import javax.swing.JOptionPane;

/**
 *
 * @author Iara
 */
public class FrmEditarMaterial extends javax.swing.JInternalFrame {
    Material material;
    MaterialBO bo;

    /**
     * Creates new form FrmCadastroMaterial
     */
    public FrmEditarMaterial(Material m, MaterialBO mbo) {
        initComponents();
        this.material = m;
        this.bo = mbo;
        
        carregaCampos();
    }

    private void carregaCampos() {
        TxtDescricao.setText(material.getDescricao());
        
     }

    private void carregaObjeto() {
        material.setDescricao(TxtDescricao.getText());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlMaterial = new javax.swing.JPanel();
        LblDescricao = new javax.swing.JLabel();
        TxtDescricao = new javax.swing.JTextField();
        BtnSalvar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnApagar = new javax.swing.JButton();

        setTitle("Editar Material");

        PnlMaterial.setBackground(new java.awt.Color(255, 255, 255));
        PnlMaterial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        LblDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblDescricao.setText("Descrição:");

        TxtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescricaoActionPerformed(evt);
            }
        });

        BtnSalvar.setText("Salvar");
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });

        BtnLimpar.setText("Limpar Campos");
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

        BtnApagar.setText("Apagar");
        BtnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlMaterialLayout = new javax.swing.GroupLayout(PnlMaterial);
        PnlMaterial.setLayout(PnlMaterialLayout);
        PnlMaterialLayout.setHorizontalGroup(
            PnlMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMaterialLayout.createSequentialGroup()
                .addGroup(PnlMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlMaterialLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(LblDescricao)
                        .addGap(18, 18, 18)
                        .addComponent(TxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlMaterialLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(BtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PnlMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnApagar)
                            .addGroup(PnlMaterialLayout.createSequentialGroup()
                                .addComponent(BtnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnCancelar)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        PnlMaterialLayout.setVerticalGroup(
            PnlMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(PnlMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalvar)
                    .addComponent(BtnLimpar)
                    .addComponent(BtnCancelar))
                .addGap(28, 28, 28)
                .addComponent(BtnApagar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescricaoActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed

        
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja Salvar?") == 0) {
                carregaObjeto();
                if (bo.Salvar(material)) {
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

    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Sair?") 
                == 0){
            this.dispose();
        }
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente limpar os campos?")
                == 0) {
            
            TxtDescricao.setText(null);
                       
            JOptionPane.showMessageDialog(rootPane, "Pronto!");
        }
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApagarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Remover?")
            == 0){
            
            if (bo.Apagar(material)) {
                    JOptionPane.showMessageDialog(rootPane, "Apagado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Nao foi possivel apagar!");
                }
            
            
        }
    }//GEN-LAST:event_BtnApagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnApagar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JLabel LblDescricao;
    private javax.swing.JPanel PnlMaterial;
    private javax.swing.JTextField TxtDescricao;
    // End of variables declaration//GEN-END:variables
}