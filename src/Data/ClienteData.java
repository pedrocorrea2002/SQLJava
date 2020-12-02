package Data;

import java.sql.PreparedStatement;

import Model.TabelaCliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Data.Connect;


public class ClienteData {
	
    private List<TabelaCliente> LerTabela = new ArrayList<TabelaCliente>();
	
	Connect con;
	public boolean Input(TabelaCliente objFun) throws Exception{
		
		con = new Connect();
		
		String SQL = "insert into TabelaCliente values (?,?,?,?,?)";
		PreparedStatement ps = con.getConnect().prepareStatement(SQL);
                ps.setString(1, objFun.getNome());
		ps.setString(2, objFun.getCPF());
                ps.setString(3, objFun.getEndereco());
                ps.setString(4, objFun.getEmail());
                ps.setString(5, objFun.getTelefone());
		
		if(ps.executeUpdate() > 0)
		return true;
		
		else;
			return false;
	}
        public TabelaCliente Pesquisar(int ID) throws Exception{
            con = new Connect();
            TabelaCliente objFun = null;
            String SQL = "select * from TabelaCliente where ID_do_Cliente = ?";
            PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                objFun = new TabelaCliente();
                objFun.setNome(rs.getString("Nome"));
                objFun.setCPF(rs.getString("CPF"));
                objFun.setEndereco(rs.getString("Endereço"));
                objFun.setEmail(rs.getString("Email"));
                objFun.setTelefone(rs.getString("Telefone"));
            }
            return objFun;
        }	
        
        public boolean Editar(TabelaCliente objFun) throws Exception{
            con = new Connect();
            String SQL = "update TabelaCliente set Nome = ?, CPF = ?, Endereço = ?, Email = ?, Telefone = ? where ID_do_Cliente = ?";
            PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setString(1, objFun.getNome());
            ps.setString(2, objFun.getCPF());
            ps.setString(3, objFun.getEndereco());
            ps.setString(4, objFun.getEmail());
            ps.setString(5, objFun.getTelefone());
            ps.setInt(6, objFun.getID());
            if(ps.executeUpdate() > 0)
		return true;
		
		else;
			return false;
        }
       public boolean Deletar (int ID) throws Exception{
           con = new Connect();
           String SQL = "delete from TabelaCliente where ID_do_Cliente = ?";
           PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setInt(1, ID);
           if(ps.executeUpdate() > 0)
		return true;
		else;
		return false;
        }
         
            public List<TabelaCliente> LerTabela(){
            ResultSet rs = null;

                try {
                con = new Connect();
                String SQL = "select * from TabelaCliente";
                PreparedStatement ps = null; 
                 
                
                    ps = con.getConnect().prepareStatement(SQL);
                    rs = ps.executeQuery();
                    while(rs.next()){
                      TabelaCliente objFun = new TabelaCliente(); 
                      objFun.setID(rs.getInt("ID_do_Cliente"));
                      objFun.setNome(rs.getString("Nome"));
                      objFun.setCPF(rs.getString("CPF"));
                      objFun.setEndereco(rs.getString("Endereço"));
                      objFun.setEmail(rs.getString("Email"));
                      objFun.setTelefone(rs.getString("Telefone"));
                      LerTabela.add(objFun);
                    }
             } catch (Exception ex) {
                Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
             }
            
                return LerTabela;
            }
}