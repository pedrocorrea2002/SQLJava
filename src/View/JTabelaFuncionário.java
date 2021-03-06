/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.TabelaFuncionário;
import Data.FuncionárioData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class JTabelaFuncionário extends javax.swing.JFrame {

    private TabelaFuncionário objFun2;
    private FuncionárioData DAO2;
    private int action = 0;
    
    public JTabelaFuncionário() {
        initComponents();
        DAO2 = new FuncionárioData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Pesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        NomeField = new javax.swing.JTextField();
        Endereco = new javax.swing.JLabel();
        SalárioField = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        CargoField = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        TelefoneField = new javax.swing.JFormattedTextField();
        Telefone = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        PesquisarB = new javax.swing.JButton();
        NovoB = new javax.swing.JButton();
        EditarB = new javax.swing.JButton();
        DeletarB = new javax.swing.JButton();
        CancelarB = new javax.swing.JButton();
        SalvarB = new javax.swing.JButton();
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
        jLabel1.setText("Cadastro do funcionário");

        Nome.setText("Nome:");

        NomeField.setEnabled(false);
        NomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeFieldActionPerformed(evt);
            }
        });

        Endereco.setText("Salário Fixo:");

        SalárioField.setEnabled(false);
        SalárioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalárioFieldActionPerformed(evt);
            }
        });

        Email.setText("Data de contrato:");

        CargoField.setEnabled(false);
        CargoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargoFieldActionPerformed(evt);
            }
        });

        CPF.setText("Cargo:");

        try {
            TelefoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TelefoneField.setEnabled(false);
        TelefoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefoneFieldActionPerformed(evt);
            }
        });

        Telefone.setText("Telefone:");

        ID.setText("ID:");

        IDField.setDoubleBuffered(true);
        IDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFieldActionPerformed(evt);
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

        DataField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        DataField.setToolTipText("dd/mm/aaaa");
        DataField.setEnabled(false);
        DataField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataFieldActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Endereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SalárioField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NovoB)
                                        .addGap(18, 18, 18)
                                        .addComponent(EditarB)
                                        .addGap(18, 18, 18)
                                        .addComponent(CancelarB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CPF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CargoField)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Telefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TelefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ID)
                                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PesquisarB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SalvarB)
                                .addGap(18, 18, 18)
                                .addComponent(DeletarB)
                                .addGap(18, 18, 18)
                                .addComponent(TabelaB)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VoltarB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(VoltarB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisarB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(NomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Endereco)
                    .addComponent(SalárioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefone)
                    .addComponent(TelefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CargoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(DataField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoB)
                    .addComponent(EditarB)
                    .addComponent(CancelarB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvarB)
                    .addComponent(DeletarB)
                    .addComponent(TabelaB))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void NomeFieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void SalárioFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void CargoFieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void TelefoneFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void IDFieldActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void PesquisarBActionPerformed(java.awt.event.ActionEvent evt) {                                           
try{
      if (IDField.getText().equals("")){
      JOptionPane.showMessageDialog(this, "Caixa vazia, não foi possível efetuar a pesquisa");
      IDField.requestFocus();
      }else{
          TabelaFuncionário objFun2 = DAO2.Pesquisar2(Integer.parseInt(IDField.getText()));
          if(objFun2 == null){
              JOptionPane.showMessageDialog(this, "Registro não encontrado");
              IDField.setText("");
              IDField.requestFocus();
          }else{
              NomeField.setText(objFun2.getNome2());
              SalárioField.setText((objFun2.getSalário_Fixo()+""));
              DataField.setText(objFun2.getData_de_Contrato());
              CargoField.setText(objFun2.getCargo());
              TelefoneField.setText(objFun2.getTelefone2());
              CancelarB.setEnabled(true);
              EditarB.setEnabled(true);
              DeletarB.setEnabled(true);
              PesquisarB.setEnabled(true);
              NovoB.setEnabled(false);
              SalvarB.setEnabled(false);
              NomeField.setEnabled(false);
              SalárioField.setEnabled(false);
              DataField.setEnabled(false);
              CargoField.setEnabled(false);
              TelefoneField.setEnabled(false);
              IDField.setEnabled(true);
              TabelaB.setEnabled(true);
          }
          
      }
    }catch(Exception error){
        JOptionPane.showMessageDialog(this, "Erro:" + error.getMessage());
        }
    }                                          

    private void NovoBActionPerformed(java.awt.event.ActionEvent evt) {                                      
CancelarB.setEnabled(true);
EditarB.setEnabled(false);
DeletarB.setEnabled(false);
PesquisarB.setEnabled(false);
NovoB.setEnabled(false);
SalvarB.setEnabled(true);
NomeField.setEnabled(true);
SalárioField.setEnabled(true);
CargoField.setEnabled(true);
TelefoneField.setEnabled(true);
DataField.setEnabled(true);
IDField.setEnabled(false);
IDField.setText("");
TabelaB.setEnabled(false);
action = 1;
    }                                     

    private void EditarBActionPerformed(java.awt.event.ActionEvent evt) {                                        
CancelarB.setEnabled(true);
EditarB.setEnabled(false);
DeletarB.setEnabled(false);
PesquisarB.setEnabled(false);
NovoB.setEnabled(false);
SalvarB.setEnabled(true);
NomeField.setEnabled(true);
SalárioField.setEnabled(true);
CargoField.setEnabled(true);
TelefoneField.setEnabled(true);
DataField.setEnabled(true);
IDField.setEnabled(false);
IDField.setText("");
TabelaB.setEnabled(false);
action = 2;
    }                                       

    private void DeletarBActionPerformed(java.awt.event.ActionEvent evt) {                                         
try{
        if(IDField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo ID vazio");
        }else{
        if(DAO2.Deletar2(Integer.parseInt(IDField.getText()))){
JOptionPane.showMessageDialog(this, "Registro excluído com sucesso");
CancelarB.setEnabled(false);
EditarB.setEnabled(false);
DeletarB.setEnabled(false);
PesquisarB.setEnabled(true);
NovoB.setEnabled(true);
SalvarB.setEnabled(false);
NomeField.setEnabled(false);
SalárioField.setEnabled(false);
DataField.setEnabled(false);
CargoField.setEnabled(false);
TelefoneField.setEnabled(false);
IDField.setEnabled(true);
TabelaB.setEnabled(true);
NomeField.setText("");
SalárioField.setText("");
DataField.setText("");
CargoField.setText("");
TelefoneField.setText("");
IDField.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Não foi possível excluir o registro");

        }}}
        catch(Exception error){
            JOptionPane.showMessageDialog(this, "erro: " + error.getMessage());
        }
    }                                        

    private void CancelarBActionPerformed(java.awt.event.ActionEvent evt) {                                          
CancelarB.setEnabled(false);
EditarB.setEnabled(false);
DeletarB.setEnabled(false);
PesquisarB.setEnabled(true);
NovoB.setEnabled(true);
SalvarB.setEnabled(false);
NomeField.setEnabled(false);
SalárioField.setEnabled(false);
CargoField.setEnabled(false);
TelefoneField.setEnabled(false);
IDField.setEnabled(true);
DataField.setEnabled(false);
TabelaB.setEnabled(true);
NomeField.setText("");
SalárioField.setText("");
CargoField.setText("");
TelefoneField.setText("");
DataField.setText("");
    }                                         

    private void SalvarBActionPerformed(java.awt.event.ActionEvent evt) {                                        
try {
            if (Checagem()) {
                if (action == 1){
            if(SalvarCampos()){
                
                    if(DAO2.Input2(objFun2)){
                        
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                        CancelarB.setEnabled(false);
                        EditarB.setEnabled(false);
                        DeletarB.setEnabled(false);
                        PesquisarB.setEnabled(true);
                        NovoB.setEnabled(true);
                        SalvarB.setEnabled(false);
                        NomeField.setEnabled(false);
                        SalárioField.setEnabled(false);
                        DataField.setEnabled(false);
                        CargoField.setEnabled(false);
                        TelefoneField.setEnabled(false);
                        IDField.setEnabled(true);
                        TabelaB.setEnabled(true);
                        NomeField.setText("");
                        SalárioField.setText("");
                        DataField.setText("");
                        CargoField.setText("");
                        TelefoneField.setText("");}
               
                } else{ 
            JOptionPane.showMessageDialog(this, "Não foi possível salvar o registro");
        }
              }

            if (action == 2){
                 if(SalvarCampos2()){
                
                    if(DAO2.Editar2(objFun2)){
                        
                        
                        JOptionPane.showMessageDialog(this, "Editado com sucesso!");
                        CancelarB.setEnabled(false);
                        EditarB.setEnabled(false);
                        DeletarB.setEnabled(false);
                        PesquisarB.setEnabled(true);
                        NovoB.setEnabled(true);
                        SalvarB.setEnabled(false);
                        NomeField.setEnabled(false);
                        SalárioField.setEnabled(false);
                        DataField.setEnabled(false);
                        CargoField.setEnabled(false);
                        TelefoneField.setEnabled(false);
                        IDField.setEnabled(true);
                        TabelaB.setEnabled(true);
                        NomeField.setText("");
                        SalárioField.setText("");
                        DataField.setText("");
                        CargoField.setText("");
                        TelefoneField.setText("");}
               
                }
                else{ 
            JOptionPane.showMessageDialog(this, "Não foi possível editar o registro");
                }} 
           
            }} catch (Exception ex) {
            
                    JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
                    Logger.getLogger(JTabelaCliente.class.getName()).log(Level.SEVERE, null, ex);}
        
    }                                       

    private void DataFieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void VoltarBActionPerformed(java.awt.event.ActionEvent evt) {                                        
Menu VoltaMenu = new Menu();
VoltaMenu.show();
dispose();
    }                                       

    private void TabelaBActionPerformed(java.awt.event.ActionEvent evt) {                                        
ShowTabelaFuncionário TabelaFuncionárioShow = new ShowTabelaFuncionário();
TabelaFuncionárioShow.show();
dispose();
    }                                       

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
        if (NomeField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Nome falta ser preenchido!");
            return false;}
        if (SalárioField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Salário Fixo falta ser preenchido!");
            return false;}
        if (CargoField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Cargo falta ser preenchido!");
            return false;} 
        if (DataField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Data falta ser preenchido!");
            return false;}   
        if (TelefoneField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Telefone falta ser preenchido!");
            return false;}
        
        
        return true;

}
    
    public boolean SalvarCampos(){
        objFun2 = new TabelaFuncionário();
        objFun2.setNome2(NomeField.getText());
        objFun2.setSalário_Fixo(Double.parseDouble(SalárioField.getText()));
        objFun2.setCargo(CargoField.getText());
        objFun2.setData_de_Contrato(DataField.getText());
        objFun2.setTelefone2(TelefoneField.getText());
    
    return true;
    }
     public boolean SalvarCampos2(){
        
        objFun2 = new TabelaFuncionário();
        objFun2.setID_do_Funcionário(Integer.parseInt(IDField.getText()));
        objFun2.setNome2(NomeField.getText());
        objFun2.setSalário_Fixo(Double.parseDouble(SalárioField.getText()));
        objFun2.setData_de_Contrato(DataField.getText());
        objFun2.setCargo(CargoField.getText());
        objFun2.setTelefone2(TelefoneField.getText());
    
    return true;
    }
    
        

    // Variables declaration - do not modify                     
    private javax.swing.JLabel CPF;
    private javax.swing.JButton CancelarB;
    private javax.swing.JTextField CargoField;
    private javax.swing.JFormattedTextField DataField;
    private javax.swing.JButton DeletarB;
    private javax.swing.JButton EditarB;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel Nome;
    private javax.swing.JTextField NomeField;
    private javax.swing.JButton NovoB;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton PesquisarB;
    private javax.swing.JButton SalvarB;
    private javax.swing.JTextField SalárioField;
    private javax.swing.JButton TabelaB;
    private javax.swing.JLabel Telefone;
    private javax.swing.JFormattedTextField TelefoneField;
    private javax.swing.JButton VoltarB;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
