package Data;

import java.sql.PreparedStatement;

import Model.TabelaProduto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoData {
	
    private List<TabelaProduto> LerTabela3 = new ArrayList<TabelaProduto>();
	
	Connect con;
	public boolean Input3(TabelaProduto objFun3) throws Exception{
		
		con = new Connect();
		
		String SQL = "insert into TabelaProduto values (?,?,?,?,?,?)";
		PreparedStatement ps = con.getConnect().prepareStatement(SQL);
                ps.setString(1, objFun3.getIngrediente1());
		ps.setString(2, objFun3.getIngrediente2());
                ps.setString(3, objFun3.getIngrediente3());
                ps.setString(4, objFun3.getIngrediente4());
                ps.setString(5, objFun3.getDescricao());
                ps.setDouble(6, objFun3.getValor_do_Produto());
		
		if(ps.executeUpdate() > 0)
		return true;
		
		else;
			return false;
	}
        public TabelaProduto Pesquisar3(int ID_do_Produto) throws Exception{
            con = new Connect();
            TabelaProduto objFun = null;
            String SQL = "select * from TabelaProduto where ID_do_Produto = ?";
            PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setInt(1, ID_do_Produto);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                objFun = new TabelaProduto();
                objFun.setIngrediente1(rs.getString("Ingrediente1"));
                objFun.setIngrediente2(rs.getString("Ingrediente2"));
                objFun.setIngrediente3(rs.getString("Ingrediente3"));
                objFun.setIngrediente4(rs.getString("Ingrediente4"));
                objFun.setDescricao(rs.getString("Descrição"));
                objFun.setValor_do_Produto(rs.getDouble("Valor_do_Produto"));
            }
            return objFun;
        }	
        
        public boolean Editar3(TabelaProduto objFun3) throws Exception{
            con = new Connect();
            String SQL = "update TabelaProduto set Ingrediente1 = ?, Ingrediente2 = ?, Ingrediente3 = ?, Ingrediente4 = ?, Descrição = ?, Valor_do_Produto = ? where ID_do_Produto = ?";
            PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setString(1, objFun3.getIngrediente1());
	    ps.setString(2, objFun3.getIngrediente2());
            ps.setString(3, objFun3.getIngrediente3());
            ps.setString(4, objFun3.getIngrediente4());
            ps.setString(5, objFun3.getDescricao());
            ps.setDouble(6, objFun3.getValor_do_Produto());
            ps.setInt(7, objFun3.getID_do_Produto());
            if(ps.executeUpdate() > 0)
		return true;
		
		else;
			return false;
        }
       public boolean Deletar (int ID_do_Produto) throws Exception{
           con = new Connect();
           String SQL = "delete from TabelaProduto where ID_do_Produto = ?";
           PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setInt(1, ID_do_Produto);
           if(ps.executeUpdate() > 0)
		return true;
		else;
		return false;
        }
         
            public List<TabelaProduto> LerTabela3(){
            try {
                con = new Connect();
                String SQL = "select * from TabelaProduto";
                PreparedStatement ps = null; 
                ResultSet rs = null;
                
                
                    ps = con.getConnect().prepareStatement(SQL);
                    rs = ps.executeQuery();
                    while(rs.next()){
                      TabelaProduto objFun3 = new TabelaProduto(); 
                      objFun3.setID_do_Produto(rs.getInt("ID_do_Produto"));
                      objFun3.setIngrediente1(rs.getString("Ingrediente1"));
                      objFun3.setIngrediente2(rs.getString("Ingrediente2"));
                      objFun3.setIngrediente3(rs.getString("Ingrediente3"));
                      objFun3.setIngrediente4(rs.getString("Ingrediente4"));
                      objFun3.setDescricao(rs.getString("Descrição"));
                      objFun3.setValor_do_Produto(rs.getDouble("Valor_do_Produto"));
                      LerTabela3.add(objFun3);
                    }
             } catch (Exception ex) {
                Logger.getLogger(ProdutoData.class.getName()).log(Level.SEVERE, null, ex);}
            //}finally{
            //    .closeConnection(con,objFun,rs)
            //}
            //}finally{
            //    .closeConnection(con,objFun,rs)
            //}
            
                return LerTabela3;
            }
}