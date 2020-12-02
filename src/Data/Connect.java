package Data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {

	private Connection connect;
		public Connect() throws Exception{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                //Class.forName("net.sourceforge.jtds.jdbc.Driver");
		String url = "jdbc:sqlserver://DESKTOP-DACNNQH\\SQLEXPRESS:51258;databaseName=Pizzaria";
		connect = DriverManager.getConnection(url,"UsuarioPadrão","1234");
		
		}
		
		public Connection getConnect() {
			return connect;
		}
                
}
