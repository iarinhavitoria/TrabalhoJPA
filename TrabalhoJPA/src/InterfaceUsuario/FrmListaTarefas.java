/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;


import DomainModel.TarefasSemanais;
import Negocio.TarefaSemanaisBO;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulo_000
 */
public class FrmListaTarefas extends javax.swing.JInternalFrame {
    TarefaSemanaisBO bo;
    
    
    /**
     * Creates new form FrmListaMaterial
     */
    public FrmListaTarefas() {
        initComponents();
        bo = new TarefaSemanaisBO();
        
        List<TarefasSemanais> tarefas = bo.listarTodos();
        
        preencheTabela(tarefas);
    }

    private void preencheTabela(List<TarefasSemanais> lista) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Descrição");
        
        for (TarefasSemanais ts : lista) {
            Vector valores = new Vector();
            valores.add(0,ts.getIdTarefas());
            valores.add(1,ts.getDescricao());
            
            model.addRow(valores);
        }
        TblListaTarefas.setModel(model);
        TblListaTarefas.repaint();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */                                           

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlListaTarefa = new javax.swing.JPanel();
        SpnlListaTarefa = new javax.swing.JScrollPane();
        TblListaTarefas = new javax.swing.JTable();
        TxtPesquisar = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();

        setTitle("Listar Tarefas");

        PnlListaTarefa.setBackground(new java.awt.Color(255, 255, 255));
        PnlListaTarefa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listar Tarefas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        TblListaTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Descroção"
            }
        ));
        TblListaTarefas.getTableHeader().setReorderingAllowed(false);
        TblListaTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblListaTarefasMouseClicked(evt);
            }
        });
        SpnlListaTarefa.setViewportView(TblListaTarefas);

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

        javax.swing.GroupLayout PnlListaTarefaLayout = new javax.swing.GroupLayout(PnlListaTarefa);
        PnlListaTarefa.setLayout(PnlListaTarefaLayout);
        PnlListaTarefaLayout.setHorizontalGroup(
            PnlListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpnlListaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PnlListaTarefaLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(TxtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPesquisar)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListaTarefaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );
        PnlListaTarefaLayout.setVerticalGroup(
            PnlListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaTarefaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisar))
                .addGap(26, 26, 26)
                .addComponent(SpnlListaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlListaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlListaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblListaTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblListaTarefasMouseClicked
        Object valor = TblListaTarefas.getValueAt( TblListaTarefas.getSelectedRow(), 0);
        TarefasSemanais ts = bo.Abrir((int)valor);
        FrmEditarTarefas janela = new FrmEditarTarefas(ts, bo);
        this.getParent().add(janela);
        janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TblListaTarefasMouseClicked

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        TarefasSemanais ts = new TarefasSemanais(0, "");
        ts.setDescricao(TxtPesquisar.getText());
                
        List<TarefasSemanais> lista = bo.buscar(ts);
        
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
    private javax.swing.JPanel PnlListaTarefa;
    private javax.swing.JScrollPane SpnlListaTarefa;
    private javax.swing.JTable TblListaTarefas;
    private javax.swing.JTextField TxtPesquisar;
    // End of variables declaration//GEN-END:variables
}
