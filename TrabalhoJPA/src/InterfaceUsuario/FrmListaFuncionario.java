/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

import DomainModel.Funcionario;
import Negocio.FuncionarioBO;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Iara
 */
public class FrmListaFuncionario extends javax.swing.JInternalFrame {
    FuncionarioBO bo;
    /**
     * Creates new form FrmListaFuncionario
     */
    public FrmListaFuncionario() {
        initComponents();
        bo = new FuncionarioBO();
        
        List<Funcionario> funcionarios = bo.listarTodos();
        
        preencheTabela(funcionarios);
    }
    
    private void preencheTabela(List<Funcionario> lista) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nome");
        model.addColumn("CPF");
        model.addColumn("Telefone");
        
        for (Funcionario f : lista) {
            Vector valores = new Vector();
            valores.add(0,f.getIdFuncionario());
            valores.add(1,f.getNome());
            valores.add(2,f.getCpf());
            valores.add(3,f.getTelefone());
            
            model.addRow(valores);
        }
        TblListaFuncionario.setModel(model);
        TblListaFuncionario.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlListaFuncionario = new javax.swing.JPanel();
        SpnlListaFuncionario = new javax.swing.JScrollPane();
        TblListaFuncionario = new javax.swing.JTable();
        TxtPesquisar = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();

        setTitle("Listar Funcionarios  ");

        PnlListaFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        PnlListaFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listar Funcionarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        TblListaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "Cidade", "Rua", "Nº"
            }
        ));
        TblListaFuncionario.getTableHeader().setReorderingAllowed(false);
        TblListaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblListaFuncionarioMouseClicked(evt);
            }
        });
        SpnlListaFuncionario.setViewportView(TblListaFuncionario);

        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlListaFuncionarioLayout = new javax.swing.GroupLayout(PnlListaFuncionario);
        PnlListaFuncionario.setLayout(PnlListaFuncionarioLayout);
        PnlListaFuncionarioLayout.setHorizontalGroup(
            PnlListaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpnlListaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PnlListaFuncionarioLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(TxtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPesquisar)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListaFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );
        PnlListaFuncionarioLayout.setVerticalGroup(
            PnlListaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaFuncionarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlListaFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisar))
                .addGap(26, 26, 26)
                .addComponent(SpnlListaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlListaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlListaFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblListaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblListaFuncionarioMouseClicked
        Object valor = TblListaFuncionario.getValueAt( TblListaFuncionario.getSelectedRow(), 0);
        Funcionario f = bo.Abrir((int)valor);
        FrmFuncionarioEditar janela = new FrmFuncionarioEditar(f, bo);
        this.getParent().add(janela);
        janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TblListaFuncionarioMouseClicked

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        Funcionario f = new Funcionario(0, "", "", "");
        f.setNome(TxtPesquisar.getText());
                
        List<Funcionario> lista = bo.buscar(f);
        
        preencheTabela(lista);
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Sair?") 
                == 0){
            this.dispose();
        }
    }//GEN-LAST:event_BtnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JPanel PnlListaFuncionario;
    private javax.swing.JScrollPane SpnlListaFuncionario;
    private javax.swing.JTable TblListaFuncionario;
    private javax.swing.JTextField TxtPesquisar;
    // End of variables declaration//GEN-END:variables
}
