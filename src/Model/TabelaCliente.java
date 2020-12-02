package Model;

public class TabelaCliente {

    private int ID;
    private String Nome;
    private String CPF;
    private String Endereco;
    private String Email;
    private String Telefone;

    public TabelaCliente() {
    }

    public TabelaCliente(int ID, String Nome, String CPF, String Endereco, String Email, String Telefone) {
        this.ID = ID;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Email = Email;
        this.Telefone = Telefone;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
     public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the Endereço
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereço the Endereço to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    } 
 
}
