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
public class TabelaPedido {
    
    private int ID_do_Pedido;
    private int ID_do_Cliente;
    private int ID_do_Produto;
    private int ID_do_Funcionário;
    private String Data_do_Pedido;
    private String OBS;

    public TabelaPedido() {
    }

    public TabelaPedido(int ID_do_Pedido, int ID_do_Cliente, int ID_do_Produto, int ID_do_Funcionário, String Data_do_Pedido, String OBS) {
        this.ID_do_Pedido = ID_do_Pedido;
        this.ID_do_Cliente = ID_do_Cliente;
        this.ID_do_Produto = ID_do_Produto;
        this.ID_do_Funcionário = ID_do_Funcionário;
        this.Data_do_Pedido = Data_do_Pedido;
        this.OBS = OBS;
    }

    /**
     * @return the ID_do_Pedido
     */
    public int getID_do_Pedido() {
        return ID_do_Pedido;
    }

    /**
     * @param ID_do_Pedido the ID_do_Pedido to set
     */
    public void setID_do_Pedido(int ID_do_Pedido) {
        this.ID_do_Pedido = ID_do_Pedido;
    }

    /**
     * @return the ID_do_Cliente
     */
    public int getID_do_Cliente() {
        return ID_do_Cliente;
    }

    /**
     * @param ID_do_Cliente the ID_do_Cliente to set
     */
    public void setID_do_Cliente(int ID_do_Cliente) {
        this.ID_do_Cliente = ID_do_Cliente;
    }

    /**
     * @return the ID_do_Produto
     */
    public int getID_do_Produto() {
        return ID_do_Produto;
    }

    /**
     * @param ID_do_Produto the ID_do_Produto to set
     */
    public void setID_do_Produto(int ID_do_Produto) {
        this.ID_do_Produto = ID_do_Produto;
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
     * @return the Data_do_Pedido
     */
    public String getData_do_Pedido() {
        return Data_do_Pedido;
    }

    /**
     * @param Data_do_Pedido the Data_do_Pedido to set
     */
    public void setData_do_Pedido(String Data_do_Pedido) {
        this.Data_do_Pedido = Data_do_Pedido;
    }

    /**
     * @return the OBS
     */
    public String getOBS() {
        return OBS;
    }

    /**
     * @param OBS the OBS to set
     */
    public void setOBS(String OBS) {
        this.OBS = OBS;
    }
    
    
}
