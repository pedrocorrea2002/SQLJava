/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.PreparedStatement;

import Model.TabelaFuncionário;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionárioData {
	
	private List<TabelaFuncionário> LerTabela2 = new ArrayList<TabelaFuncionário>();
	Connect con;
	public boolean Input2(TabelaFuncionário objFun2) throws Exception{
		
		con = new Connect();
		
		String SQL = "insert into TabelaFuncionário values (?,?,?,?,?)";
		PreparedStatement ps = con.getConnect().prepareStatement(SQL);
                ps.setString(1, objFun2.getNome2());
		ps.setDouble(2, objFun2.getSalário_Fixo());
                ps.setString(3, objFun2.getData_de_Contrato());
                ps.setString(4, objFun2.getCargo());
                ps.setString(5, objFun2.getTelefone2());
		
		if(ps.executeUpdate() > 0)
		return true;
		
		else;
			return false;
	}
        
        public boolean Editar2(TabelaFuncionário objFun2) throws Exception{
            con = new Connect();
            String SQL = "update TabelaFuncionário set Nome = ?, Salário_Fixo= ?, Data_de_Contrato = ?, Cargo = ?, Telefone = ? where ID_do_Funcionário = ?";
            PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setString(1, objFun2.getNome2());
	    ps.setDouble(2, objFun2.getSalário_Fixo());
            ps.setString(3, objFun2.getData_de_Contrato());
            ps.setString(4, objFun2.getCargo());
            ps.setString(5, objFun2.getTelefone2());
            ps.setInt(6, objFun2.getID_do_Funcionário());
            if(ps.executeUpdate() > 0)
		return true;
		
		else;
			return false;
        }
       public boolean Deletar2 (int ID_do_Funcionário) throws Exception{
           con = new Connect();
           String SQL = "delete from TabelaFuncionário where ID_do_Funcionário = ?";
           PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setInt(1, ID_do_Funcionário);
           if(ps.executeUpdate() > 0)
		return true;
		else;
		return false;
        }
	public TabelaFuncionário Pesquisar2(int ID_do_Funcionário) throws Exception{
            con = new Connect();
            TabelaFuncionário objFun2 = null;
            String SQL = "select * from TabelaFuncionário where ID_do_Funcionário = ?";
            PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setInt(1, ID_do_Funcionário);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                objFun2 = new TabelaFuncionário();
                objFun2.setNome2(rs.getString("Nome"));
                objFun2.setSalário_Fixo(rs.getDouble("Salário_Fixo"));
                objFun2.setCargo(rs.getString("Cargo"));
                objFun2.setData_de_Contrato(rs.getString("Data_de_Contrato"));
                objFun2.setTelefone2(rs.getString("Telefone"));
            }
            return objFun2;
        }
        
        public List<TabelaFuncionário> LerTabela2(){
            try {
                con = new Connect();
                String SQL = "select * from TabelaFuncionário";
                PreparedStatement ps = null; 
                ResultSet rs = null;
                 
                
                    ps = con.getConnect().prepareStatement(SQL);
                    rs = ps.executeQuery();
                    while(rs.next()){
                      TabelaFuncionário objFun2 = new TabelaFuncionário();
                      objFun2.setID_do_Funcionário(rs.getInt("ID_do_Funcionário"));
                      objFun2.setNome2(rs.getString("Nome"));
                      objFun2.setSalário_Fixo(rs.getDouble("Salário_Fixo"));
                      objFun2.setData_de_Contrato(rs.getString("Data_de_Contrato"));
                      objFun2.setCargo(rs.getString("Cargo"));
                      objFun2.setTelefone2(rs.getString("Telefone"));
                      LerTabela2.add(objFun2);
                    }
             } catch (Exception ex) {
                Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);}
            //}finally{
            //    .closeConnection(con,objFun,rs)
            //}
            
                return LerTabela2;
            }
}
