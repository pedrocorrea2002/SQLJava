/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Everton Luan
 */
public class TabelaFuncionário {
    
    private int ID_do_Funcionário;
    private String Nome2;
    private double Salário_Fixo;
    private String Data_de_Contrato;
    private String Cargo;
    private String Telefone2;

    public TabelaFuncionário() {
    }

    public TabelaFuncionário(int ID_do_Funcionário, String Nome2, double Salário_Fixo, String Data_de_Contrato, String Cargo, String Telefone) {
        this.ID_do_Funcionário = ID_do_Funcionário;
        this.Nome2 = Nome2;
        this.Salário_Fixo = Salário_Fixo;
        this.Data_de_Contrato = Data_de_Contrato;
        this.Cargo = Cargo;
        this.Telefone2 = Telefone2;
    }

    /**
     * @return the ID_do_Funcionário
     */
    public int getID_do_Funcionário() {
        return ID_do_Funcionário;
    }

    /**
     * @param ID_do_Funcionário the ID_do_Funcionário to set
     */
    public void setID_do_Funcionário(int ID_do_Funcionário) {
        this.ID_do_Funcionário = ID_do_Funcionário;
    }

    /**
     * @return the Nome
     */
    public String getNome2() {
        return Nome2;
    }

    /**
     * @param Nome2 the Nome to set
     */
    public void setNome2(String Nome) {
        this.Nome2 = Nome;
    }

    /**
     * @return the Salário_Fixo
     */
    public double getSalário_Fixo() {
        return Salário_Fixo;
    }

    /**
     * @param Salário_Fixo the Salário_Fixo to set
     */
    public void setSalário_Fixo(double Salário_Fixo) {
        this.Salário_Fixo = Salário_Fixo;
    }

    /**
     * @return the Data_de_Contrato
     */
    

    /**
     * @return the Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * @param Cargo the Cargo to set
     */
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone2() {
        return Telefone2;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone2(String Telefone2) {
        this.Telefone2 = Telefone2;
    }

    /**
     * @return the Data_de_Contrato
     */
    public String getData_de_Contrato() {
        return Data_de_Contrato;
    }

    /**
     * @param Data_de_Contrato the Data_de_Contrato to set
     */
    public void setData_de_Contrato(String Data_de_Contrato) {
        this.Data_de_Contrato = Data_de_Contrato;
    }
    
    
    
}
