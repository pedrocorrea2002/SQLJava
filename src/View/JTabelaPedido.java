/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.TabelaPedido;
import Data.PedidoData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class JTabelaPedido extends javax.swing.JFrame {

    private TabelaPedido objFun4;
    private PedidoData DAO4;
    private int action = 0;
    
    public JTabelaPedido() {
        initComponents();
        DAO4 = new PedidoData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        IDPedidoField = new javax.swing.JTextField();
        PesquisarB = new javax.swing.JButton();
        NovoB = new javax.swing.JButton();
        EditarB = new javax.swing.JButton();
        DeletarB = new javax.swing.JButton();
        CancelarB = new javax.swing.JButton();
        SalvarB = new javax.swing.JButton();
        Email2 = new javax.swing.JLabel();
        OBSField = new javax.swing.JTextField();
        ProdutoField = new javax.swing.JTextField();
        ClienteField = new javax.swing.JTextField();
        FuncionárioField = new javax.swing.JTextField();
        Check = new javax.swing.JCheckBox();
        DataField = new javax.swing.JFormattedTextField();
        TabelaB = new javax.swing.JButton();
        VoltarB = new javax.swing.JButton();

        Pesquisar.setText("jButton1");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Pedidos");

        Nome.setText("ID do cliente:");

        Endereco.setText("ID do produto:");

        Email.setText("Data do pedido:");

        CPF.setText("ID do funcionário:");

        ID.setText("ID do pedido:");

        IDPedidoField.setDoubleBuffered(true);
        IDPedidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDPedidoFieldActionPerformed(evt);
            }
        });

        PesquisarB.setLabel("Pesquisar");
        PesquisarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarBActionPerformed(evt);
            }
        });

        NovoB.setText("Novo");
        NovoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoBActionPerformed(evt);
            }
        });

        EditarB.setText("Editar");
        EditarB.setEnabled(false);
        EditarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBActionPerformed(evt);
            }
        });

        DeletarB.setText("Deletar");
        DeletarB.setEnabled(false);
        DeletarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarBActionPerformed(evt);
            }
        });

        CancelarB.setText("Cancelar");
        CancelarB.setEnabled(false);
        CancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBActionPerformed(evt);
            }
        });

        SalvarB.setText("Salvar");
        SalvarB.setEnabled(false);
        SalvarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarBActionPerformed(evt);
            }
        });

        Email2.setText("OBS:");

        OBSField.setEnabled(false);
        OBSField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OBSFieldActionPerformed(evt);
            }
        });

        ProdutoField.setDoubleBuffered(true);
        ProdutoField.setEnabled(false);
        ProdutoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutoFieldActionPerformed(evt);
            }
        });

        ClienteField.setDoubleBuffered(true);
        ClienteField.setEnabled(false);
        ClienteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteFieldActionPerformed(evt);
            }
        });

        FuncionárioField.setDoubleBuffered(true);
        FuncionárioField.setEnabled(false);
        FuncionárioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionárioFieldActionPerformed(evt);
            }
        });

        Check.setText("jCheckBox1");
        Check.setEnabled(false);

        DataField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        DataField.setToolTipText("dd/mm/aaaa");
        DataField.setEnabled(false);

        TabelaB.setText("Tabela");
        TabelaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaBActionPerformed(evt);
            }
        });

        VoltarB.setText("Voltar");
        VoltarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DataField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Email2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OBSField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDPedidoField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FuncionárioField))
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PesquisarB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(VoltarB))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SalvarB)
                            .addComponent(NovoB))
                        .addGap(18, 18, 18)
                        .addComponent(DeletarB)
                        .addGap(18, 18, 18)
                        .addComponent(TabelaB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(EditarB)
                        .addGap(18, 18, 18)
                        .addComponent(CancelarB))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Endereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProdutoField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(VoltarB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDPedidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisarB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(ClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco)
                    .addComponent(ProdutoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF)
                    .addComponent(FuncionárioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(DataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OBSField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email2)
                    .addComponent(Check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NovoB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EditarB)
                        .addComponent(CancelarB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeletarB)
                    .addComponent(SalvarB)
                    .addComponent(TabelaB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarActionPerformed

    private void IDPedidoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDPedidoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDPedidoFieldActionPerformed

    private void PesquisarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarBActionPerformed
try{
      if (IDPedidoField.getText().equals("")){
      JOptionPane.showMessageDialog(this, "Caixa vazia, não foi possível efetuar a pesquisa");
      IDPedidoField.requestFocus();
      }else{
          TabelaPedido objFun4 = DAO4.Pesquisar4(Integer.parseInt(IDPedidoField.getText()));
          if(objFun4 == null){
              JOptionPane.showMessageDialog(this, "Registro não encontrado");
              IDPedidoField.setText("");
              IDPedidoField.requestFocus();
          }else{
              ClienteField.setText((objFun4.getID_do_Cliente())+"");
              ProdutoField.setText((objFun4.getID_do_Produto())+"");
              FuncionárioField.setText((objFun4.getID_do_Funcionário())+"");
              DataField.setText(objFun4.getData_do_Pedido());
              OBSField.setText(objFun4.getOBS());
              CancelarB.setEnabled(true);
              EditarB.setEnabled(true);
              DeletarB.setEnabled(true);
              PesquisarB.setEnabled(true);
              NovoB.setEnabled(false);
              SalvarB.setEnabled(false);
              IDPedidoField.setEnabled(true);
              ClienteField.setEnabled(false);
              ProdutoField.setEnabled(false);
              DataField.setEnabled(false);
              FuncionárioField.setEnabled(false);
              DataField.setEnabled(false);
              OBSField.setEnabled(true);
              TabelaB.setEnabled(true);
          }
          
      }
    }catch(Exception error){
        JOptionPane.showMessageDialog(this, "Erro:" + error.getMessage());
        }
    }//GEN-LAST:event_PesquisarBActionPerformed

    private void NovoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoBActionPerformed
CancelarB.setEnabled(true);
EditarB.setEnabled(false);
DeletarB.setEnabled(false);
PesquisarB.setEnabled(false);
NovoB.setEnabled(false);
SalvarB.setEnabled(true);
IDPedidoField.setEnabled(true);
ClienteField.setEnabled(true);
FuncionárioField.setEnabled(true);
ProdutoField.setEnabled(true);
DataField.setEnabled(true);
OBSField.setEnabled(true);
IDPedidoField.setEnabled(false);
Check.setEnabled(true);
IDPedidoField.setText("");
TabelaB.setEnabled(false);
action = 1;

    }//GEN-LAST:event_NovoBActionPerformed

    private void EditarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBActionPerformed
CancelarB.setEnabled(true);
EditarB.setEnabled(false);
DeletarB.setEnabled(false);
PesquisarB.setEnabled(false);
NovoB.setEnabled(false);
SalvarB.setEnabled(true);
IDPedidoField.setEnabled(true);
ClienteField.setEnabled(true);
FuncionárioField.setEnabled(true);
ProdutoField.setEnabled(true);
DataField.setEnabled(true);
OBSField.setEnabled(true);
IDPedidoField.setEnabled(false);
Check.setEnabled(true);
IDPedidoField.setText("");
TabelaB.setEnabled(false);
action = 2;
    }//GEN-LAST:event_EditarBActionPerformed

    private void DeletarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarBActionPerformed
try{
        if(IDPedidoField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo ID vazio");
        }else{
        if(!(DAO4.Deletar4(Integer.parseInt(IDPedidoField.getText())))){
            JOptionPane.showMessageDialog(this, "Não foi possível excluir o registro");
        }else{
            JOptionPane.showMessageDialog(this, "Registro excluído com sucesso");
CancelarB.setEnabled(false);
EditarB.setEnabled(false);
DeletarB.setEnabled(false);
PesquisarB.setEnabled(true);
NovoB.setEnabled(true);
SalvarB.setEnabled(false);
IDPedidoField.setEnabled(false);
ClienteField.setEnabled(false);
FuncionárioField.setEnabled(false);
ProdutoField.setEnabled(false);
DataField.setEnabled(false);
OBSField.setEnabled(false);
Check.setEnabled(false);
IDPedidoField.setText("");
ClienteField.setText("");
FuncionárioField.setText("");
ProdutoField.setText("");
DataField.setText("");
OBSField.setText("");
TabelaB.setEnabled(true);
        }}}
        catch(Exception error){
            JOptionPane.showMessageDialog(this, "erro: " + error.getMessage());
        }
    }//GEN-LAST:event_DeletarBActionPerformed

    private void CancelarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBActionPerformed
CancelarB.setEnabled(false);
EditarB.setEnabled(false);
DeletarB.setEnabled(false);
PesquisarB.setEnabled(true);
NovoB.setEnabled(true);
SalvarB.setEnabled(false);
IDPedidoField.setEnabled(true);
ClienteField.setEnabled(false);
FuncionárioField.setEnabled(false);
ProdutoField.setEnabled(false);
DataField.setEnabled(false);
OBSField.setEnabled(false);
Check.setEnabled(false);
IDPedidoField.setText("");
ClienteField.setText("");
FuncionárioField.setText("");
ProdutoField.setText("");
DataField.setText("");
OBSField.setText("");
TabelaB.setEnabled(true);
    }//GEN-LAST:event_CancelarBActionPerformed

    private void SalvarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarBActionPerformed
try {
            if (Checagem()) {
                if (action == 1){
            if(SalvarCampos()){
                
                    if(DAO4.Input4(objFun4)){
                        
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
CancelarB.setEnabled(false);
EditarB.setEnabled(false);
DeletarB.setEnabled(false);
PesquisarB.setEnabled(true);
NovoB.setEnabled(true);
SalvarB.setEnabled(false);
IDPedidoField.setEnabled(true);
ClienteField.setEnabled(false);
FuncionárioField.setEnabled(false);
ProdutoField.setEnabled(false);
DataField.setEnabled(false);
OBSField.setEnabled(false);
Check.setEnabled(false);
TabelaB.setEnabled(true);
IDPedidoField.setText("");
ClienteField.setText("");
FuncionárioField.setText("");
ProdutoField.setText("");
DataField.setText("");
OBSField.setText("");}
               
                } else{ 
            JOptionPane.showMessageDialog(this, "Não foi possível salvar o registro");
        }
              }

            if (action == 2){
                 if(SalvarCampos2()){
                
                    if(DAO4.Editar4(objFun4)){
                        
                        
                        JOptionPane.showMessageDialog(this, "Editado com sucesso!");
CancelarB.setEnabled(false);
EditarB.setEnabled(false);
DeletarB.setEnabled(false);
PesquisarB.setEnabled(true);
NovoB.setEnabled(true);
SalvarB.setEnabled(false);
IDPedidoField.setEnabled(true);
ClienteField.setEnabled(false);
FuncionárioField.setEnabled(false);
ProdutoField.setEnabled(false);
DataField.setEnabled(false);
OBSField.setEnabled(false);
Check.setEnabled(false);
TabelaB.setEnabled(true);
IDPedidoField.setText("");
ClienteField.setText("");
FuncionárioField.setText("");
ProdutoField.setText("");
DataField.setText("");
OBSField.setText("");}
               
                }
                else{ 
            JOptionPane.showMessageDialog(this, "Não foi possível editar o registro");
                }} 
           
            }} catch (Exception ex) {
            
                    JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
                    Logger.getLogger(JTabelaCliente.class.getName()).log(Level.SEVERE, null, ex);}
        
    }//GEN-LAST:event_SalvarBActionPerformed

    private void OBSFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OBSFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OBSFieldActionPerformed

    private void ProdutoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdutoFieldActionPerformed

    private void ClienteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteFieldActionPerformed

    private void FuncionárioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionárioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FuncionárioFieldActionPerformed

    private void VoltarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBActionPerformed
Menu VoltaMenu = new Menu();
VoltaMenu.show();
dispose();
    }//GEN-LAST:event_VoltarBActionPerformed

    private void TabelaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaBActionPerformed
ShowTabelaPedido TabelaPedidoShow = new ShowTabelaPedido();
TabelaPedidoShow.show();
dispose();
    }//GEN-LAST:event_TabelaBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTabelaFuncionário().setVisible(true);
            }
        });
    }
    
    public boolean Checagem(){
        if (ClienteField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Cliente falta ser preenchido!");
            return false;}
        if (ProdutoField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Produto falta ser preenchido!");
            return false;}
        if (FuncionárioField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Funcionário falta ser preenchido!");
            return false;}
         if (DataField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Data do Pedido falta ser preenchido!");
            return false;}
        if (OBSField.getText().equals("")){
            if(!(CheckListener())){
            return true;    
            }
            if(CheckListener()){JOptionPane.showMessageDialog(this, "Campo OBS falta ser preenchido!");
            return false;}}
  
        
        
        
        return true;

}
    
    public boolean SalvarCampos(){
        
        objFun4 = new TabelaPedido();
        objFun4.setID_do_Cliente(Integer.parseInt(ClienteField.getText()));
        objFun4.setID_do_Produto(Integer.parseInt(ProdutoField.getText()));
        objFun4.setID_do_Funcionário(Integer.parseInt(FuncionárioField.getText()));
        objFun4.setData_do_Pedido(DataField.getText());
        objFun4.setOBS(OBSField.getText());
    
    return true;
    }
         public boolean SalvarCampos2(){
        
        objFun4 = new TabelaPedido();
        objFun4.setID_do_Pedido(Integer.parseInt(IDPedidoField.getText()));
        objFun4.setID_do_Cliente(Integer.parseInt(ClienteField.getText()));
        objFun4.setID_do_Produto(Integer.parseInt(ProdutoField.getText()));
        objFun4.setID_do_Funcionário(Integer.parseInt(FuncionárioField.getText()));
        objFun4.setData_do_Pedido(DataField.getText());
        objFun4.setOBS(OBSField.getText());
    
    return true;
    }   
    
   private boolean CheckListener(){
    boolean CheckL = Check.isSelected();
    
    if (CheckL = false){
    return false;}
    
    return true;
}

    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JButton CancelarB;
    private javax.swing.JCheckBox Check;
    private javax.swing.JTextField ClienteField;
    private javax.swing.JFormattedTextField DataField;
    private javax.swing.JButton DeletarB;
    private javax.swing.JButton EditarB;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email2;
    private javax.swing.JLabel Endereco;
    private javax.swing.JTextField FuncionárioField;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField IDPedidoField;
    private javax.swing.JLabel Nome;
    private javax.swing.JButton NovoB;
    private javax.swing.JTextField OBSField;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton PesquisarB;
    private javax.swing.JTextField ProdutoField;
    private javax.swing.JButton SalvarB;
    private javax.swing.JButton TabelaB;
    private javax.swing.JButton VoltarB;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}