/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pedro
 */
public class TabelaProduto {
    private int ID_do_Produto;
    private String Ingrediente1;
    private String Ingrediente2;
    private String Ingrediente3;
    private String Ingrediente4;
    private String Descricao;
    private Double Valor_do_Produto;

    public TabelaProduto() {
    }

    public TabelaProduto(int ID_do_Produto, String Ingrediente1, String Ingrediente2, String Ingrediente3, String Ingrediente4, String Descricao, Double Valor_do_Produto) {
        this.ID_do_Produto = ID_do_Produto;
        this.Ingrediente1 = Ingrediente1;
        this.Ingrediente2 = Ingrediente2;
        this.Ingrediente3 = Ingrediente3;
        this.Ingrediente4 = Ingrediente4;
        this.Descricao = Descricao;
        this.Valor_do_Produto = Valor_do_Produto;
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
     * @return the Ingrediente1
     */
    public String getIngrediente1() {
        return Ingrediente1;
    }

    /**
     * @param Ingrediente1 the Ingrediente1 to set
     */
    public void setIngrediente1(String Ingrediente1) {
        this.Ingrediente1 = Ingrediente1;
    }

    /**
     * @return the Ingrediente2
     */
    public String getIngrediente2() {
        return Ingrediente2;
    }

    /**
     * @param Ingrediente2 the Ingrediente2 to set
     */
    public void setIngrediente2(String Ingrediente2) {
        this.Ingrediente2 = Ingrediente2;
    }

    /**
     * @return the Ingrediente3
     */
    public String getIngrediente3() {
        return Ingrediente3;
    }

    /**
     * @param Ingrediente3 the Ingrediente3 to set
     */
    public void setIngrediente3(String Ingrediente3) {
        this.Ingrediente3 = Ingrediente3;
    }

    /**
     * @return the Ingrediente4
     */
    public String getIngrediente4() {
        return Ingrediente4;
    }

    /**
     * @param Ingrediente4 the Ingrediente4 to set
     */
    public void setIngrediente4(String Ingrediente4) {
        this.Ingrediente4 = Ingrediente4;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the Valor_do_Produto
     */
    public Double getValor_do_Produto() {
        return Valor_do_Produto;
    }

    /**
     * @param Valor_do_Produto the Valor_do_Produto to set
     */
    public void setValor_do_Produto(Double Valor_do_Produto) {
        this.Valor_do_Produto = Valor_do_Produto;
    }
    
    
}
