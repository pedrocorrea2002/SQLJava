package Data;

import java.sql.PreparedStatement;

import Model.TabelaPedido;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PedidoData {
	
    private List<TabelaPedido> LerTabela4 = new ArrayList<TabelaPedido>();
	
	Connect con;
	public boolean Input4(TabelaPedido objFun4) throws Exception{
		
		con = new Connect();
		
		String SQL = "insert into TabelaPedido values (?,?,?,?,?)";
		PreparedStatement ps = con.getConnect().prepareStatement(SQL);
                ps.setInt(1, objFun4.getID_do_Cliente());
		ps.setInt(3, objFun4.getID_do_Funcionário());
                ps.setString(4, objFun4.getData_do_Pedido());
                ps.setInt(2, objFun4.getID_do_Produto());
                ps.setString(5, objFun4.getOBS());
		
		if(ps.executeUpdate() > 0)
		return true;
		
		else;
			return false;
	}
        public TabelaPedido Pesquisar4(int ID_do_Pedido) throws Exception{
            con = new Connect();
            TabelaPedido objFun4 = null;
            String SQL = "select * from TabelaProduto where ID_do_Pedido = ?";
            PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setInt(1, ID_do_Pedido);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                objFun4 = new TabelaPedido();
                objFun4.setID_do_Cliente(rs.getInt("ID_do_cliente"));
                objFun4.setID_do_Produto(rs.getInt("ID_do_produto"));
                objFun4.setID_do_Funcionário(rs.getInt("ID_do_funcionário"));
                objFun4.setData_do_Pedido(rs.getString("Data_do_pedido"));
                objFun4.setOBS(rs.getString("OBS"));
            }
            return objFun4;
        }	
        
        public boolean Editar4(TabelaPedido objFun4) throws Exception{
            con = new Connect();
            String SQL = "update TabelaPedido set ID_do_Cliente = ?, ID_do_Produto = ?, ID_do_Funcionário = ?, Data_de_Pedido = ?, OBS = ? where ID_do_Pedido = ?";
            PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setInt(1, objFun4.getID_do_Cliente());
	    ps.setInt(2, objFun4.getID_do_Produto());
            ps.setInt(3, objFun4.getID_do_Funcionário());
            ps.setString(4, objFun4.getData_do_Pedido());
            ps.setString(5, objFun4.getOBS());
            ps.setInt(6, objFun4.getID_do_Pedido());
            if(ps.executeUpdate() > 0)
		return true;
		
		else;
			return false;
        }
       public boolean Deletar4 (int ID_do_Pedido) throws Exception{
           con = new Connect();
           String SQL = "delete from TabelaPedido where ID_do_Pedido = ?";
           PreparedStatement ps = con.getConnect().prepareStatement(SQL);
            ps.setInt(1, ID_do_Pedido);
           if(ps.executeUpdate() > 0)
		return true;
		else;
		return false;
        }
         
            public List<TabelaPedido> LerTabela4(){
            try {
                con = new Connect();
                String SQL = "select * from TabelaPedido";
                PreparedStatement ps = null; 
                ResultSet rs = null;
                
                
                    ps = con.getConnect().prepareStatement(SQL);
                    rs = ps.executeQuery();
                    while(rs.next()){
                TabelaPedido objFun4 = new TabelaPedido(); 
                objFun4 = new TabelaPedido();
                objFun4.setID_do_Pedido(rs.getInt("ID_do_Pedido"));
                objFun4.setID_do_Cliente(rs.getInt("ID_do_Cliente"));
                objFun4.setID_do_Produto(rs.getInt("ID_do_Produto"));
                objFun4.setID_do_Funcionário(rs.getInt("ID_do_Funcionário"));
                objFun4.setData_do_Pedido(rs.getString("Data_do_Pedido"));
                objFun4.setOBS(rs.getString("OBS"));
                      LerTabela4.add(objFun4);
                    }
             } catch (Exception ex) {
                Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);}
            
                return LerTabela4;
            }
}
